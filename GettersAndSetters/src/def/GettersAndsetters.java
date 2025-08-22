package def;

import def.User;

public class GettersAndsetters {

	public static void main(String[] args) {
		//getters and setters = method from encapsulation that allow us access variables from outside class
		
		
		 User user = new User();
		 user.set_name("Joey"); //set value
		 user.membership = "Gold";
		 
		 System.out.println(user.get_name()); //get value
	
		 
		 
	}

}
