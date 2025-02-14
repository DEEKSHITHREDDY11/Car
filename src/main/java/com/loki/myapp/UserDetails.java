package com.loki.myapp;

import org.springframework.stereotype.Component;

@Component
public class UserDetails 
{
	private int userId;
	private String userName;
	private String emailId;
	private String password;
	private String status;
	private int carId;
	private String type;
	

	public UserDetails() {}
	
	public UserDetails(int userId,String userName,String emailId,String password,String status,int carId,String type)
	{
		this.userId=userId;
		this.userName=userName;
		this.emailId=emailId;
		this.password=password;
		this.status=status;
		this.carId=carId;
		this.type=type;
	}


	public int getuserId() 
	{
		return userId;
	}
	public void setuserId(int userId) 
	{
		this.userId = userId;
	}
	
	
	public String getuserName() 
	{
		return userName;
	}
	public void setuserName(String userName) 
	{
		this.userName = userName;
	}
	
	
	public String getemailId() 
	{
		return emailId;
	}
	public void setemailId(String emailId) 
	{
		this.emailId = emailId;
	}
	
	
	public String getpassword() 
	{
		return password;
	}
	public void setpassword(String password) 
	{
		this.password = password;
	}
	
	
	public String getstatus()
	{
		return status;
	}
	public void setstatus(String status)
	{
		this.status = status; 
	}
	
	public int getcarId()
	{
		return carId;
	}
	public void setcarId(int carId)
	{
		this.carId = carId; 
	}
	
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
}
