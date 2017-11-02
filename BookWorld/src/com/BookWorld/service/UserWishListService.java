package com.BookWorld.service;

import com.BookWorld.model.UserWishList;

public interface UserWishListService {

	String addToWishList(UserWishList userwishList);

	UserWishList checkWishList(int userId,int bookId);

}
