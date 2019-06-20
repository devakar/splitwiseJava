package splitWise;

import java.util.ArrayList;

public class Bill {
	private int billID;
	private Group group;
	private float amount;
	private User user;
	private ArrayList<User> users;
	
	public Bill(int billID, float amount, Group g, User u, ArrayList<User> users) {
		this.billID=billID;
		this.amount=amount;
		this.group=g;
		this.user=u;
		this.users=users;
	}
	
	public void splitBill() {
		int n=users.size();
		float amountPerHead=amount/n;
		//user.addExpense(amount-amountPerHead, users);
		for(User u: users ) {
			if(u.getUserID()!=user.getUserID()) {
				System.out.println(u.getUserName()+ "     "+ user.getUserName() + "    " + amountPerHead);
				u.addExpense(-1*amountPerHead, user);
				user.addExpense(amountPerHead, u);
			}
			
		}
	}
	
}
