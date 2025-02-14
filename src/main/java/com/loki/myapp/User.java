package com.loki.myapp;

import org.springframework.stereotype.Component;

@Component
public class User
{
	private UserDetails user1;
	private UserDetails user2;
	private UserDetails user3;
	
	public User()
	{
		user1 = new UserDetails(3,"Arjun","Arjun@gmail.com","Arjun","Not Rented",0,"user");
		user2 = new UserDetails(4,"Arun","Arun@gmail.com","Arun","Rented",5,"user");
		user3 = new UserDetails(5,"Anil","Anil@gmail.com","Anil","Not Rented",0,"user");
	}
	
	public Boolean match(String emailId, String password)
	{
		if(user1.getemailId().equals(emailId) && user1.getpassword().equals(password))
		{
			printDetails(user1);
			return true;
		}
		else if(user2.getemailId().equals(emailId) && user2.getpassword().equals(password))
		{
			printDetails(user2);
			return true;
		}
		else if(user3.getemailId().equals(emailId) && user3.getpassword().equals(password))
		{
			printDetails(user3);
			return true;
		}
		else
		{
			return false;
		}
	}

	private void printDetails(UserDetails user) 
	{
		System.out.println("User-ID: "+user.getuserId());
		System.out.println("User-Name: "+user.getuserName());
		System.out.println("Email-ID: "+user.getemailId());
		System.out.println("Status: "+user.getstatus());
		System.out.println("Car-Id: "+user.getcarId());
	}
	
	
	public String type(String emaiId)
	{
		if(user1.getemailId().equals(emaiId))
		{
			return user1.getType();
		}
		else if(user2.getemailId().equals(emaiId))
		{
			return user2.getType();
		}
		else if(user3.getemailId().equals(emaiId))
		{
			return user3.getType();
		}
		else
		{
			return "not user";
		}
	}
	
	public Boolean userRental(String emailId)
	{
		if(user1.getemailId().equals(emailId) && user1.getstatus().equals("Rented"))
		{
			return true;
		}
		else if(user2.getemailId().equals(emailId) && user2.getstatus().equals("Rented"))
		{
			return true;
		}
		else if(user3.getemailId().equals(emailId) && user3.getstatus().equals("Rented"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public int userstatus(String emailId)
	{
		if(user1.getemailId().equals(emailId))
		{
			return carid(user1);
		}
		else if (user2.getemailId().equals(emailId))
		{
			return carid(user2);
		}
		else if(user3.getemailId().equals(emailId))
		{
			return carid(user3);
		}
		else
		{
			return 0;
		}
	}
	
	private int carid(UserDetails user)
	{
		return user.getcarId();
	}

	public void carMap()
	{
		System.out.println("IF CAR-ID=0 NO CAR RENTED ");
		System.out.println("USER: "+user1.getuserName()+", Car-Id: "+user1.getcarId()+", Rental-status: "+user1.getstatus());
		System.out.println("USER: "+user2.getuserName()+", Car-Id: "+user2.getcarId()+", Rental-status: "+user2.getstatus());
		System.out.println("USER: "+user3.getuserName()+", Car-Id: "+user3.getcarId()+", Rental-status: "+user3.getstatus());
	}
}
