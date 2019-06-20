package splitWise;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class User {
	private String userName;
	private int userID;
	private Hashtable<User,Float> hashTable;
	
	public User(int userID, String userName) {
		this.userID=userID;
		this.userName=userName;
		this.hashTable=new Hashtable<User,Float>();
	}
	
	public int getUserID() {
		return userID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void addExpense(float amount, User user) {
		System.out.println("Add Expense     "+userName + "     " +user.getUserName()+"     "+ amount);
		hashTable.put(user, amount);
	}
	
	public void userView() {
		Enumeration<User> items = hashTable.keys();
		while(items.hasMoreElements()){
			    User user = (User)items.nextElement();
			    float amount = hashTable.get(user);
			    if(amount<0) {
			    	float absAmount =-1*amount;
			    	System.out.println(userName+" pay "+ absAmount + " to "+ user.getUserName());
			    }
			    else if(amount>0) {
			    	System.out.println(userName +" gets "+ amount + " from "+ user.getUserName());
			    }

			}
	}
}
