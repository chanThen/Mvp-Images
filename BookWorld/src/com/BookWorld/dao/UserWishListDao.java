package com.BookWorld.dao;

import com.BookWorld.model.UserWishList;

public interface UserWishListDao {

	String addToWishList(UserWishList userwishList);

	UserWishList checkWishList(int userId,int bookId);

}
