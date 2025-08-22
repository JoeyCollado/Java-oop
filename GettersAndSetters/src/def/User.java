package def;

public class User {
   String _name;
   String membership;

   void set_name(String name) { //set method, give value
	   _name = name;
	   System.out.println("we can customize set values as extra processing");
   }
   
 
   String get_name() { //get method, get value
   	return _name;
   }
}

//this allow us to determine what we can allow to enter or exit


//either you can use this. or _ as a prefix to differentiate terms with same name
//private = using this prefix forbid us from accessing that attribute from outside class