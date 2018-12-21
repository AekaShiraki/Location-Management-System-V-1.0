package com.aekashiraki.lms.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aekashiraki.lms.dao.ProvinceDao;
import com.aekashiraki.lms.model.ProvinceModel;

@Repository
public class ProvinceDaoImpl implements ProvinceDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	/* Province Add */
	@Override
	public void create(ProvinceModel provinceModel) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(provinceModel);
	}

	/* Province List */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProvinceModel> searchAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<ProvinceModel> provinceModelList = new ArrayList<ProvinceModel>();
		provinceModelList = session.createQuery(" from ProvinceModel").list();
		return provinceModelList;
	}

	/* Select Province ID to Modify */
	@Override
	public ProvinceModel searchById(Long id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String query = "select b from ProvinceModel b where b.id=" + id + "";
		ProvinceModel provinceModel = new ProvinceModel();
		provinceModel = (ProvinceModel) session.createQuery(query).getSingleResult();
		return provinceModel;
	}

	/* Province Edit */
	@Override
	public void update(ProvinceModel provinceModel) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(provinceModel);
	}
	

}
