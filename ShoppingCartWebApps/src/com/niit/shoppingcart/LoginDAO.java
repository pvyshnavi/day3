package com.niit.shoppingcart;

public class LoginDAO {
	public boolean isValidUser(String id, String pwd)
	{
		if(id.equals("niit") && pwd.equals("niit"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
