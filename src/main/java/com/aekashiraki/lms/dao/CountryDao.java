package com.aekashiraki.lms.dao;

import java.util.List;

import com.aekashiraki.lms.model.CountryModel;

public interface CountryDao {

	/* Country Add */
	public void create(CountryModel countryModel);
	
	/* Country List */
	public List<CountryModel> searchAll();
	
	/* Select Country ID to Modify */
	public CountryModel searchById(Long id);
	
	/* Country Edit */
	public void update(CountryModel countryModel);
	
}
