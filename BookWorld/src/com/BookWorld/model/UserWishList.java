package com.BookWorld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_Wishlist")
public class UserWishList {
	
	@Id
	@GeneratedValue
	@Column(name="wishListId")
	private int wishListId;
	
	@Column(name="userId")
	private int userId;

	@Column(name="bookId")
	private int bookId;

	public int getWishListId() {
		return wishListId;
	}

	public void setWishListId(int wishListId) {
		this.wishListId = wishListId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	
	
}
