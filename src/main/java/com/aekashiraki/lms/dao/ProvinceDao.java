package com.aekashiraki.lms.dao;

import java.util.List;

import com.aekashiraki.lms.model.ProvinceModel;


public interface ProvinceDao {

	/* Province Add */
	public void create(ProvinceModel provinceModel);
	
	/* Province List */
	public List<ProvinceModel> searchAll();
	
	/* Select Province ID to Modify */
	public ProvinceModel searchById(Long id);
	
	/* Province Edit */
	public void update(ProvinceModel provinceModel);
	
	
	
}
