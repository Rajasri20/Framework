package jva.AccessModifiers_Package1;

public class B {
	
	// For Private Access Modifier 
	
	// Try to Access the m1() method from Class B, you will get an error message 
	// while invoking the m1() method  
	// because "Private Access Modifier" is limited to the same "Class only", 
	// you can not access it from another Class or Package,(i.e; from class B, package2)
	
	
	// For Default Access Modifier 
	
	// Try to Access the m1() method from Class B there wont be any error message 
	// because Default Access Modifier is limited to the 'Package', 
	// it can be accessed in Class A and from class B
	// because "Class A and Class B" both belong to same Package only.
	
	public static void main(String[] args) { // Main method for Execution point
		
		//create an instance
		
		A a = new A();
		
		a.m1();
	
	}

}
