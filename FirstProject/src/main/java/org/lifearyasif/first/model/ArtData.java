package org.lifearyasif.first.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Version;

import org.lifearyasif.first.base.DomainObject;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("GENERIC")
public class ArtData implements DomainObject {
	
	private Long id;
	private byte[] picture;
	private Integer version;
	
	public ArtData() {
	}
	
	public ArtData(byte[] picture) {
	this.picture = picture;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
	return id;
	}
	
	public void setId(Long id) {
	this.id = id;
	}
	
	public byte[] getPicture() {
	return picture;
	}
	
	public void setPicture(byte[] picture) {
	this.picture = picture;
	}
	
	@Version
	public Integer getVersion() {
	return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
}