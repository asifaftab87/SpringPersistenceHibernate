package org.lifearyasif.first.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("THUMBNAIL")
public class ArtData_Thumbnail extends ArtData {
	
	public ArtData_Thumbnail(byte[] picture) {
		this.setPicture(picture);
	}
	
	public ArtData_Thumbnail() {
	}
}