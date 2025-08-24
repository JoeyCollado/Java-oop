package def;

import def.User;

public class MO {

	public static void main(String[] args) {
		//method overloading = allow us to create different variations of methods with different types
		
		
		 User user = new User();
		 user.set_name("Joey"); //set value
		 user.set_membership("Gold");
		 //invoke using enum variation
		 user.set_membership(User.Membership.Silver);
		 
		 System.out.println(user.get_name()); //get value
		 System.out.println(user.get_membership());	
		 System.out.println(user.get_membership());
	
		 
		 
	}

}
