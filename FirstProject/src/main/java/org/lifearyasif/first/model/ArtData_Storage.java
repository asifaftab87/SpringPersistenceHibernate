package org.lifearyasif.first.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STORAGE")
public class ArtData_Storage extends ArtData {
	
	public ArtData_Storage(byte[] picture) {
		this.setPicture(picture);
	}
	
	public ArtData_Storage() {
	}
}