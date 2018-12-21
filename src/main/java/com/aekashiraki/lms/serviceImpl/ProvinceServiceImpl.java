package com.aekashiraki.lms.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aekashiraki.lms.dao.ProvinceDao;
import com.aekashiraki.lms.model.ProvinceModel;
import com.aekashiraki.lms.service.ProvinceService;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceDao provinceDao;
	
	/* Province Add */
	@Override
	public void create(ProvinceModel provinceModel) {
		// TODO Auto-generated method stub
		this.provinceDao.create(provinceModel);
	}

	/* Province List */
	@Override
	public List<ProvinceModel> searchAll() {
		// TODO Auto-generated method stub
		return this.provinceDao.searchAll();
	}

	/* Select Province ID to Modify */
	@Override
	public ProvinceModel searchById(Long id) {
		// TODO Auto-generated method stub
		return this.provinceDao.searchById(id);
	}

	/* Province Edit */
	@Override
	public void update(ProvinceModel provinceModel) {
		// TODO Auto-generated method stub
		this.provinceDao.update(provinceModel);
	}

}
