package com.aekashiraki.lms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "P_PROVINCE")
public class ProvinceModel {
	
	private Long id;
	private Long countryId;
	private String code;
	private String name;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "P_PROVINCE")
	@TableGenerator(name = "P_PROVINCE", table = "S_SEQUENCE", pkColumnName = "SEQUENCE_NAME", pkColumnValue = "P_PROVINCE_ID", valueColumnName = "SEQUENCE_VALUE", allocationSize = 1, initialValue = 0)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "COUNTRY_ID")
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
	@Column(name = "CODE")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
