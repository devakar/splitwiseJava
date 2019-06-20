package client;

import java.util.ArrayList;

import splitWise.*;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User(1, "u1");
		User u2 = new User(2, "u2");
		User u3 = new User(3, "u3");
		
		Group g1 = new Group(101, "g1");
		
		g1.addUser(u1);
		g1.addUser(u2);
		g1.addUser(u3);
		
		ArrayList<User>users =  g1.getUsers();
		
		for(User user: users) {
			System.out.println(user.getUserID() +"      "+  user.getUserName());
		}
		
		Bill b1 = new Bill(1001, 300, g1, u1, users);
		b1.splitBill();
		
		u1.userView();
		u2.userView();
		u3.userView();
		
		g1.groupView();
		
		
		
		
	}

}
