package com.cwcms.service.image;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;


public class FileUtil {
	private static final String ALLOWED_IMAGE_TYPE="png;gif;jpg;jpeg";
	public static void service(HttpServletRequest req,Map<String,String> map,
			Map<String, CFile> binaryMap) 
		throws ServletException, IOException {
	//解析检查请求 
	boolean isMultipart=ServletFileUpload.isMultipartContent(req);
	if(!isMultipart){
		return ;
	}
	try {
		DiskFileItemFactory factory=new DiskFileItemFactory();
		factory.setSizeThreshold(20*1024);			//默认大小是10kb 设置上传大小
		//	factory.setRepository();					//设置临时目录
		ServletFileUpload upload=new ServletFileUpload(factory);
		//单次上传文件大小不可以超过2M
		upload.setFileSizeMax(1024 * 1024 * 2);		
		//设置该次请求总数据大小不超过3M
		//upload.setSizeMax(1024*1024*3);
		
		List<FileItem> items=upload.parseRequest(req);
		for (FileItem item : items) {
			String fieldName=item.getFieldName();	//获取表单控件的name 名字
			if(item.isFormField()){
				//普通表单
				String value=item.getString("utf-8");	//获取表单控件的参数值
				map.put(fieldName, value);
			}
			else{
				//---------------------------------------
				//上传文件的拓展名
				String ext=FilenameUtils.getExtension(item.getName());
				String[] allowedImageType=ALLOWED_IMAGE_TYPE.split(";");
				if(!Arrays.asList(allowedImageType).contains(ext)){
					throw new LogicException("请上传正确的图片格式");
				}
				//----------------------------------------
				//表单的上传控件.
				String fileName=UUID.randomUUID().toString()+ "."
							+FilenameUtils.getExtension(item.getName());
				String dir=req.getServletContext().getRealPath("/upload");
				
				item.write(new File(dir,fileName));	//把二进制写到哪个文件
				
				CFile file=new CFile();
				file.setImageName(FilenameUtils.getName(item.getName()));
				file.setImageUrl("/upload/"+fileName);
				binaryMap.put(fieldName, file);
			}
		}
	}catch(FileSizeLimitExceededException e){
		throw new LogicException("单独大小不可以超过2M");
	}catch(LogicException e){
		throw e;
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
