package org.liferayasif.front.dto;

public class NavigationDto {

	private Long id;
	private String pageCode;
	private String pageName;
	private String pageDescription;
	private String parentCode;
	private String url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPageCode() {
		return pageCode;
	}

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageDescription() {
		return pageDescription;
	}

	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "NavigationDto [id=" + id + ", pageCode=" + pageCode + ", pageName=" + pageName + ", pageDescription="
				+ pageDescription + ", parentCode=" + parentCode + ", url=" + url + "]";
	}

}
