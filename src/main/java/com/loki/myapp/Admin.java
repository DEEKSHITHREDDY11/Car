package com.loki.myapp;

import org.springframework.stereotype.Component;


@Component
public class Admin 
{
	private UserDetails admin1;
	private UserDetails admin2;
	
	public Admin()
	{
		admin1 = new UserDetails(1,"Loki","Loki@gmail.com","Loki","Rented",1,"admin");
		admin2 = new UserDetails(2,"Rowdy","Rowdy@gmail.com","Rowdy","Not Rented",0,"admin");
	}
	
	public Boolean match(String emailId, String password)
	{
		if(admin1.getemailId().equals(emailId) && admin1.getpassword().equals(password))
		{
			adminDetails(admin1);
			return true;
		}
		else if(admin2.getemailId().equals(emailId) && admin2.getpassword().equals(password))
		{
			adminDetails(admin2);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private void adminDetails(UserDetails admin)
	{
		System.out.println("User-ID: "+admin.getuserId());
		System.out.println("User-Name: "+admin.getuserName());
		System.out.println("Email-ID: "+admin.getemailId());
		System.out.println("Status: "+admin.getstatus());
		System.out.println("Car-Id: "+admin.getcarId());
	}

}