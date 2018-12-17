package com.aekashiraki.lms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "C_COUNTRY")
public class CountryModel {
	
	private Long id;
	private String code;
	private String name;
	private Integer citizenQty;
	private String continent;
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "C_COUNTRY")
	@TableGenerator(name = "C_COUNTRY", table = "S_SEQUENCE", pkColumnName = "SEQUENCE_NAME", pkColumnValue = "C_COUNTRY_ID", valueColumnName = "SEQUENCE_VALUE", allocationSize = 1, initialValue = 0)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	@Column(name = "CITIZEN_QTY")
	public Integer getCitizenQty() {
		return citizenQty;
	}
	public void setCitizenQty(Integer citizenQty) {
		this.citizenQty = citizenQty;
	}
	
	@Column(name = "CONTINENT")
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}

}
