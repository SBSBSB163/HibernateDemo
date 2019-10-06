package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.UserInfo;

public class UserDaoImpl implements UserInfoDao{

	@Override
	public int register(UserInfo userinfo) {
		Session session = SessionManager.getSession();
		Transaction trans = session.beginTransaction();
		int id = (int) session.save(userinfo);
		trans.commit();
		session.close();
		return id;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = SessionManager.getSession();
		Transaction trans = session.beginTransaction();
		UserInfo usertobedeleted = session.load(UserInfo.class, id);
		session.delete( usertobedeleted);
		trans.commit();
		session.close();
		
	}

	@Override
	public UserInfo updateUser(UserInfo u) {
		// TODO Auto-generated method stub
		Session session = SessionManager.getSession();
		Transaction trans = session.beginTransaction();
		session.update( u);
		trans.commit();
		session.close();
		return u;
	}

	@Override
	public UserInfo listUserById(int id) {
		// TODO Auto-generated method stub
		Session session = SessionManager.getSession();
		Transaction trans = session.beginTransaction();
		UserInfo userinfo = session.load(UserInfo.class, id);
		trans.commit();
		session.close();
		return userinfo;
	}

	@Override
	public List<UserInfo> listAllUsers() {
		Session session = SessionManager.getSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from UserInfo ");//factory method of a session object to create a query object
		List<UserInfo> userlist  = query.list();
		trans.commit();
		session.close();
		return userlist;
	}

}
