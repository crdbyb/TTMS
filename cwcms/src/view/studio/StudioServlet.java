package com.cwcms.view.studio;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cwcms.dao.idao.IStudioDAO;
import com.cwcms.dao.impl.StudioDAO;
import com.cwcms.model.Studio;
import com.cwcms.util.ComUtil;
@WebServlet("/studio")
public class StudioServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private IStudioDAO dao;
	public void init() throws ServletException {
		dao=new StudioDAO();
	}
	
	//http://localhost/cwcms/studio 列表
	//http://localhost/cwcms/studio?cmd=edit 编辑
	//http://localhost/cwcms/studio?cmd=del 删除
	//http://localhost/cwcms/studio?cmd=save 保存
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String cmd=req.getParameter("cmd");
		if ("del".equals(cmd)) {
			this.del(req, resp);
		} else if ("save".equals(cmd)) {
			this.save(req, resp);
		} else if ("edit".equals(cmd)) {
			this.edit(req, resp);
		} else {
			this.list(req, resp);
		}
	}
	protected void list(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Studio> studio=dao.select("");
		req.setAttribute("studios", studio);
		req.getRequestDispatcher("/WEB-INF/views/studio/list.jsp").forward(req, resp);
	}
	protected void del(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		int id=Integer.valueOf(req.getParameter("id"));
		dao.delete(id);
		resp.sendRedirect(req.getContextPath()+"/studio");
}

	protected void edit(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		String id=req.getParameter("id");
		if(ComUtil.hasLength(id)){
			List<Studio> list = dao.select("studio_id="+id);
			Studio studio=list.get(0);
			req.setAttribute("studio", studio);
		}
		req.getRequestDispatcher("/WEB-INF/views/studio/edit.jsp").forward(req, resp);
	}
		
	
	
	protected void save(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String id=req.getParameter("studio_id");
		String name=req.getParameter("studio_name");
		String rowCount=req.getParameter("studio_row");
		String colCount=req.getParameter("studio_col");
		String introduction=req.getParameter("studio.intro");
		Studio studio=new Studio(name, Integer.valueOf(rowCount), Integer.valueOf(colCount), introduction);
		if(ComUtil.hasLength(id)){
			int newId=Integer.valueOf(id);
			studio.setId(newId);
			dao.update(studio);
		}else{
			dao.insert(studio);
		}
		resp.sendRedirect(req.getContextPath()+"/studio");
	}
	
}
