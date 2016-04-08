package JavaSuperClass;
/****
 * 
 * @author xinwei.xiong
 * 1. If sub_class extends from super class, sub_class can use super.method to invoke the super class's function and variables
 * 2. If super class has constructor, sub_class will call the constructor in sub_class's constructor by using super()
 * 3. Super will be automatically added in the sub_class's constructor. 
 */


public class SuperClass {
	
	SuperClass(){
		System.out.println("From super constructor");
	}
	
    public void printMethod(){
    	System.out.println("From super class");
    }
    
    void invokeFromSuper(){
    	System.out.println("Invoke form super");
    }
}
