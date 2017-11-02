package com.BookWorld.controller;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import com.BookWorld.model.UserWishList;
import com.BookWorld.service.UserWishListService;
import com.BookWorld.service.UserWishListServiceImpl;

@Path("/wishList")
public class UserWishListController {
	
	UserWishListService userWishListService = new UserWishListServiceImpl();
	
	@Path("/addToWishList")
	@POST
	@Produces("application/json")
	public String addToWishList( UserWishList userwishList) {
		return userWishListService.addToWishList(userwishList);
	}

	@Path("/checkWishList")
	@POST
	@Produces("application/json")
	public UserWishList checkWishList( UserWishList userwishList) {
		int userId = userwishList.getUserId();
		int bookId = userwishList.getBookId();
		
		return userWishListService.checkWishList(userId,bookId);
	
	}

}



			
		
	
