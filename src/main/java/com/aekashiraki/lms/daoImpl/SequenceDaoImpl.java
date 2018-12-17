package com.aekashiraki.lms.daoImpl;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aekashiraki.lms.dao.SequenceDao;
import com.aekashiraki.lms.model.SequenceModel;

@Repository
public class SequenceDaoImpl implements SequenceDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer nextIdCountry() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Integer idCountry = 0;
		String query = "from SequenceModel where sequenceName='C_COUNTRY_ID' ";
		try {
			SequenceModel sequenceModel = new SequenceModel();
			sequenceModel = (SequenceModel) session.createQuery(query).getSingleResult();
			idCountry = sequenceModel.getSequenceValue();
		} catch (Exception e) {
			// TODO: handle exception
			idCountry = 1;
		}
		return idCountry;
	}

	@Override
	public Integer nextIdProvince() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Integer idProvince = 0;
		String query = "from SequenceModel where sequenceName='P_PROVINCE_ID' ";
		try {
			SequenceModel sequenceModel = new SequenceModel();
			sequenceModel = (SequenceModel) session.createQuery(query).getSingleResult();
			idProvince = sequenceModel.getSequenceValue();
		} catch (Exception e) {
			// TODO: handle exception
			idProvince = 1;
		}
		return idProvince;
	}

	
}
