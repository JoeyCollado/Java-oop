package Default;

public class oop {
	public static void main(String[] args) {
	// introduction to OOP
	// creating an instance of a class is known as "object"
				
	// attributes = is where we can associate different variables with objects	
	// class = is like a template, ex a template of cake recipe, where we can create different type of cakes
		
	//creating simple object
	 User user = new User();
	 user.name = "joey"; //assigning values to the attributes found in User class
	 user.membership = "Gold";
	 
	 User user2 = new User(); //another instance(object) of the class created
	 user2.name = "aibert";
	 user2.membership = "Gold";
	 user2.age = 3;
	 
	 System.out.println(user.name + user.membership + user.age); //default value = 0
	 System.out.println(user2.name + user2.membership + user2.age); //assigned value = 3
	}

}
