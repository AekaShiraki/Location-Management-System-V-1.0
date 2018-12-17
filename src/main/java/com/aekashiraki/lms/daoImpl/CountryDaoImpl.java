package com.aekashiraki.lms.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aekashiraki.lms.dao.CountryDao;
import com.aekashiraki.lms.model.CountryModel;

@Repository
public class CountryDaoImpl implements CountryDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	/* Country Add */
	@Override
	public void create(CountryModel countryModel) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(countryModel);
	}

	/* Country List */
	@SuppressWarnings("unchecked")
	@Override
	public List<CountryModel> searchAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<CountryModel> countryModelList = new ArrayList<CountryModel>();
		countryModelList = session.createQuery(" from CountryModel").list();
		return countryModelList;
	}

	/* Select Country ID to Modify */
	@Override
	public CountryModel searchById(Long id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String query = "select b from CountryModel b where b.id=" + id + "";
		CountryModel countryModel = new CountryModel();
		countryModel = (CountryModel) session.createQuery(query).getSingleResult();
		return countryModel;
	}

	/* Country Edit */
	@Override
	public void update(CountryModel countryModel) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(countryModel);
	}
	

}
