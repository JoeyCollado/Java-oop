package def;

public class User {
   String _name;
   private String _membership;

   //1
   void set_name(String name) { //set method, give value
	   _name = name;
	   System.out.println("we can customize set values as extra processing");
   }
   
   String get_name() { //get method, get value
   	return _name;
   }
   //2
   void set_membership(String membership) {
	   _membership = membership; //setter
	   
   }
   
   //method overload
   void set_membership(Membership membership) { //type, variableName, the type we are using is enum
	   //converting enum value
	   _membership = membership.name();
   }
   
   public enum Membership {
	   Bronze, Silver, Gold;
   }

   
   String get_membership() { //getter
	   return _membership;
   }
}

