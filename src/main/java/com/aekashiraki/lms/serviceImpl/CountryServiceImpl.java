package com.aekashiraki.lms.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aekashiraki.lms.dao.CountryDao;
import com.aekashiraki.lms.model.CountryModel;
import com.aekashiraki.lms.service.CountryService;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao countryDao;
	
	/* Country Add */
	@Override
	public void create(CountryModel countryModel) {
		// TODO Auto-generated method stub
		this.countryDao.create(countryModel);
	}

	/* Country List */
	@Override
	public List<CountryModel> searchAll() {
		// TODO Auto-generated method stub
		return this.countryDao.searchAll();
	}

	/* Select Country ID to Modify */
	@Override
	public CountryModel searchById(Long id) {
		// TODO Auto-generated method stub
		return this.countryDao.searchById(id);
	}

	/* Country Edit */
	@Override
	public void update(CountryModel countryModel) {
		// TODO Auto-generated method stub
		this.countryDao.update(countryModel);
	}

}
