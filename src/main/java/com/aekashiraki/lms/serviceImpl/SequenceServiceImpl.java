package com.aekashiraki.lms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aekashiraki.lms.dao.SequenceDao;
import com.aekashiraki.lms.service.SequenceService;


@Service
@Transactional
public class SequenceServiceImpl implements SequenceService {
	
	@Autowired
	private SequenceDao sequenceDao;

	@Override
	public Integer nextIdCountry() {
		// TODO Auto-generated method stub
		return this.sequenceDao.nextIdCountry();
	}

	@Override
	public Integer nextIdProvince() {
		// TODO Auto-generated method stub
		return this.sequenceDao.nextIdProvince();
	}
	
	
}
