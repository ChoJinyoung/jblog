package com.bit2015.jblog.vo;

public class PostVo {
	private String userName;
	private long blogNo;
	private long postNo;
	private long categoryNo;
	private String title;
	private String content;
	private String createdDate;
	private String modifiedDate;
	private long userNo;
	public long getPostNo() {
		return postNo;
	}
	public void setPostNo(long postNo) {
		this.postNo = postNo;
	}
	public long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public long getUserNo() {
		return userNo;
	}
	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getBlogNo() {
		return blogNo;
	}
	public void setBlogNo(long blogNo) {
		this.blogNo = blogNo;
	}
	@Override
	public String toString() {
		return "PostVo [userName=" + userName + ", blogNo=" + blogNo
				+ ", postNo=" + postNo + ", categoryNo=" + categoryNo
				+ ", title=" + title + ", content=" + content
				+ ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + ", userNo=" + userNo + "]";
	}
}
