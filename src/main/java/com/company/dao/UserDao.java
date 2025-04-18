package com.company.dao;

public interface UserDao {

	boolean isValidUser(String userId, String password);

	boolean add(String userId, String email, String password);

}
