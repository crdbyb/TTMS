package com.cwcms.service.image;

public class CFile {
	private String imageUrl;	//图片保存的相对路径upload/1.png	JSP：<image str="${user.imageUrl}"><>
	private String imageName;	//图片的原始名称
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	@Override
	public String toString() {
		return "CFile [imageUrl=" + imageUrl + ", imageName=" + imageName + "]";
	}
}
