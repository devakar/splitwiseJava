package splitWise;

import java.awt.List;
import java.util.ArrayList;
import java.util.Enumeration;

public class Group {
	private int groupID;
	private String groupName;
	private ArrayList<User> users;

	
	public Group(int groupID, String groupName) {
		this.groupID=groupID;
		this.groupName=groupName;
		this.users=new ArrayList<User>();
	}
	
	public void addUser(User u) {
		users.add(u);
	}
	
	public ArrayList<User> getUsers(){
		return users;
	}
	
	public void groupView() {
		for(User u: users) {
			u.userView();
		}
	}
}
