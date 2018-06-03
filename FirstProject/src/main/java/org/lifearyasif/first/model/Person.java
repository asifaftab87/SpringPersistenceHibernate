package org.lifearyasif.first.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.lifearyasif.first.base.DomainObject;

public class Person implements DomainObject, Serializable {

	private static final long serialVersionUID = 6008686143389567989L;

	public Person() {}
	
	@Id
	@GeneratedValue
	private Long id;
	private Integer version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Version
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}

}
