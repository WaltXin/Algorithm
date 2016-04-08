package JavaSuperClass;

public class SubClass extends SuperClass{
	
	SubClass(){
		 //This super() function will be automatically called 
		 super();
		 System.out.println("From sub constractor");
	 }
	
	void display(){
		//can use super.invokeFromSuper too
		invokeFromSuper();
	}
	
	 public void printMethod(){
		    super.printMethod();
	    	System.out.println("From sub class");
	    }
	 
	 public static void main(String[] args){
		 SubClass sc = new SubClass();
		 sc.printMethod();
		 sc.display();
	 }
}
