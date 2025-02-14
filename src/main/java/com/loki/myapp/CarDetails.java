package com.loki.myapp;

import org.springframework.stereotype.Component;

@Component
public class CarDetails 
{
	private int carId;
	private String carName;
	private String status;
	private int price;
	private int userId;
	
	public CarDetails() {}
	
	public CarDetails(int carId , String carName,String status,int price,int userId)
	{
		this.carId = carId;
		this.carName = carName; 
		this.status = status;
		this.price = price;
		this.userId=userId;
	}

	
	
	public int getCarId() 
	{
		return carId;
	}
	public void setCarId(int carId) 
	{
		this.carId = carId;
	}

	
	public String getCarName() 
	{
		return carName;
	}
	public void setCarName(String carName) 
	{
		this.carName = carName;
	}
	
	
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}

	
	
	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	
	
	
}
