package com.aekashiraki.lms.service;

import java.util.List;

import com.aekashiraki.lms.model.ProvinceModel;


public interface ProvinceService {

	/* Province Add */
	public void create(ProvinceModel provinceModel);
	
	/* Province List */
	public List<ProvinceModel> searchAll();
	
	/* Select Province ID to Modify */
	public ProvinceModel searchById(Long id);
	
	/* Province Edit */
	public void update(ProvinceModel provinceModel);
	
	
	
}
