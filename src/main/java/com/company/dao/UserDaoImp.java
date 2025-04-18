package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImp implements UserDao {

	@Override
	public boolean isValidUser(String userId, String password) {
		String query = "Select * from users WHERE username = ? AND password = ? ";
		try(Connection conn = DBUtil.getConnection(); PreparedStatement prepStat = conn.prepareStatement(query)){
			prepStat.setString(1,userId);
			prepStat.setString(2,password);
			ResultSet resSet =  prepStat.executeQuery();
			
//			System.out.println("Query Run Success");
			return resSet.next();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean add(String userId, String email, String password) {
		String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
		try(Connection conn = DBUtil.getConnection(); PreparedStatement prepStat = conn.prepareStatement(query)){
			prepStat.setString(1,userId);
			prepStat.setString(2,password);
			prepStat.setString(3, email);
			int res = prepStat.executeUpdate();
			return res>0;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
