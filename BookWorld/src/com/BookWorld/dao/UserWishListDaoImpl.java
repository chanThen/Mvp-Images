package com.BookWorld.dao;

import com.BookWorld.model.UserWishList;
import com.BookWorld.util.HibernateUtil;

public class UserWishListDaoImpl implements UserWishListDao {

	HibernateUtil hibernateUtil =  new HibernateUtil();
	
	@Override
		public String addToWishList(UserWishList userwishList) {

		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().save(userwishList);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "Success";

}

	@Override
	public UserWishList checkWishList(int userId,int bookId) {
		hibernateUtil.openCurrentSessionwithTransaction();
		UserWishList userFavouriteList = (UserWishList) hibernateUtil.getCurrentSession().createQuery("from UserWishList where userId='"+userId+"' and bookId='"+bookId+"'").uniqueResult();
		hibernateUtil.closeCurrentSessionwithTransaction();
		return userFavouriteList;
	}
}
