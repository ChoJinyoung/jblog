package com.bit2015.jblog.vo;

public class BlogVo {
	
	private long userNo;
	private long blogNo;
	private String title;
	private String tag;
	private long cntDisplayPost;
	private String status;
	private String fileName;
	
	public long getBlogNo() {
		return blogNo;
	}
	public void setBlogNo(long blogNo) {
		this.blogNo = blogNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public long getCntDisplayPost() {
		return cntDisplayPost;
	}
	public void setCntDisplayPost(long cntDisplayPost) {
		this.cntDisplayPost = cntDisplayPost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getUserNo() {
		return userNo;
	}
	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}
	@Override
	public String toString() {
		return "BlogVo [userNo=" + userNo + ", blogNo=" + blogNo + ", title="
				+ title + ", tag=" + tag + ", cntDisplayPost=" + cntDisplayPost
				+ ", status=" + status + ", fileName=" + fileName + "]";
	}
	
	
}
