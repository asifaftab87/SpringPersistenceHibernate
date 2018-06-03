package org.lifearyasif.first.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GALLERY")
public class ArtData_Gallery extends ArtData {
	
	public ArtData_Gallery(byte[] picture) {
		this.setPicture(picture);
	}
	
	public ArtData_Gallery() {
	}
}