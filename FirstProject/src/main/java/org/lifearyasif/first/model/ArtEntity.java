package org.lifearyasif.first.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ArtEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="SUB_TITLE")
	private String subTitle;
	
	@Column(name="UPLOAD_DATE")
	private Date uploadedDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DISPLAY_DATE")
	private Date displayDate;
	
	@Column(name="WIDTH")
	private Integer width;
	
	@Column(name="HEIGHT")
	private Integer height;
	
	@Column(name="MEDIA")
	private String media;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="CAPTION")
	private String caption;
	
	@Column(name="IMAGE_PATH")
	private String imagePath;
	
	@Column(name="VERSION")
	private Integer version;
	
	private ArtData_Gallery galleryPicture;
	
	private ArtData_Storage storagePicture;
	
	private ArtData_Thumbnail thumbnailPicture;
	
	@ManyToMany(mappedBy = "artEntities")
	private Set<Category> categories = new HashSet<Category>();
	
	@OneToMany
	private Set<Comment> comments = new HashSet<Comment>();
	
	public ArtEntity(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Date getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public Date getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(Date displayDate) {
		this.displayDate = displayDate;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public ArtData_Gallery getGalleryPicture() {
		return galleryPicture;
	}

	public void setGalleryPicture(ArtData_Gallery galleryPicture) {
		this.galleryPicture = galleryPicture;
	}

	public ArtData_Storage getStoragePicture() {
		return storagePicture;
	}

	public void setStoragePicture(ArtData_Storage storagePicture) {
		this.storagePicture = storagePicture;
	}

	public ArtData_Thumbnail getThumbnailPicture() {
		return thumbnailPicture;
	}

	public void setThumbnailPicture(ArtData_Thumbnail thumbnailPicture) {
		this.thumbnailPicture = thumbnailPicture;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
}
