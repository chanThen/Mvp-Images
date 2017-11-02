package com.BookWorld.service;

import com.BookWorld.dao.UserWishListDao;
import com.BookWorld.dao.UserWishListDaoImpl;
import com.BookWorld.model.UserWishList;

public class UserWishListServiceImpl implements UserWishListService{

	UserWishListDao userwishlistdao = new UserWishListDaoImpl();
	@Override
	public String addToWishList(UserWishList userwishList) {
		
		return userwishlistdao.addToWishList(userwishList);
	}
	@Override
	public UserWishList checkWishList(int userId,int bookId) {
		
		return userwishlistdao.checkWishList(userId,bookId);
	}

}
