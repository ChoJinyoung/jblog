package com.bit2015.jblog.vo;

public class CategoryVo {
	private long blogNo;
	private long categoryNo;
	private long categoryName;
	private String displayType;
	private String description;
	private String createdDate;
	private String modifiedDate;
	public long getBlogNo() {
		return blogNo;
	}
	public void setBlogNo(long blogNo) {
		this.blogNo = blogNo;
	}
	public long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public long getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(long categoryName) {
		this.categoryName = categoryName;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	@Override
	public String toString() {
		return "CategoryVo [blogNo=" + blogNo + ", categoryNo=" + categoryNo
				+ ", categoryName=" + categoryName + ", displayType="
				+ displayType + ", description=" + description
				+ ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	
}