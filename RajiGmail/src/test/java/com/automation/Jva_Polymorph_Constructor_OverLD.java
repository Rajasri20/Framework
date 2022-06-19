package com.automation;

public class Jva_Polymorph_Constructor_OverLD {
	
	/* Polymorphism */
	
	// Using SAME NAME to indicate a different Implementations
	
	// 1. Compiletime or Static or Early 
	// 2. Runtime or Dynamic or Late
	
	// 1. Compiletime Polymorphism or Static Polymorphism or Early Binding
	//  	A. Overloading
	// 			a. Constructor Overloading
	// 			b. Method Overloading
	
	// a. Constructor Overloading
	// Difine more 1 Constructor with the "SAME NAME" in the Same CLass 
	// BUT with DIFFRENT NUMBER or TYPE of parameters or Sometimes BOTH 
	
	// b. Method Overloading
	// Difine more than 1 Method with the "SAME NAME" in the Same CLass but with 
	// DIFFRENT NUMBER or DIFFERENT TYPE of parameters or Sometimes BOTH
	
	
	
	// 2. Runtime Polymorphism or Dynamic Polymorphism or Late Binding
		// A. Overriding
	
	// A Method Redefined in SUB CLASS is called Overriding
	
		// Overriding is applicable to "Methods" only
	
	
	/*a. Constructor Overloading*/
	
	// 1st CREATE A CLASS
	
	/* WHAT DO WE WRITE INDSIDE THE CLASS*/
	
		// VARIABLES TO STORE THE DATA
		// CONSTRUCTORS TO INITIALIZATION AND
		// METHODS TO MANIPULATE THE DATA
	

	// Below line Defines a VARIABLE  
	private int index;   
	// "Private" is a Access Modifier, limited to this pariticular CLASS only, TO impelement Encaptulation(Security is the benenfit)
	// I want to store "int" type values, "index" is a VARIABLE, which is type of "int". 
	
	/* Below is Writing the CONSTRUCTOR */
	
		// CONSTRUCTOR is for "Initialization", it will initialize the ABOVE "int" value
	
	public Jva_Polymorph_Constructor_OverLD() { 
		
		// "public" is a Access Modifier, "Jva_Polymorph_Test" is the Name of the CONSTRUCTOR 
		// it must be SAME as CLASS NAME, and it should be Enclosed with "Paranthesis()"
		
		index = 0; 
		// Initialized the "int" value
		// "index = 0;" IS  A "ZERO ARGUMENT CONSTRUCTOR"  
	}
	
	// IF YOU WANT TO INITIALIZE THE INDEX WITH YOUR OWN SET OF VALUES, YOU CAN WRITE 1 MORE CONSTRUCTOR
	
	public Jva_Polymorph_Constructor_OverLD(int indx) {
		
		// "public" is a Access Modifier, "Jva_Polymorph_Test" is the Name of the CONSTRUCTOR 
		// it must be SAME as CLASS NAME, and it should be Enclosed with "Paranthesis()"
		
		index = indx; 
		// Initialized the "int" value with index
		// In this CONSRUCTOR if you give "index = 0;" OR ZERO ARGUMENT CONSTRUCTOR, you will get ERROR
		// message, YOU NEED TO THINK OF WHAT ARE THE POSSIBLE WAYS TO "INITIALIZE" the "Index" variable
		// "GIVE A PROVISION TO ACCEPT THE VALUES FROM OUTSIDE"
		// To initialize the "index" varible so write "int", VARIABLE its up to you but it SHOUL BE
		// DIFFERENT from the 1st one.
		// It looks like this "public Jva_Polymorph_Test(int indx){"
		// Whatever Value we Receive as "indx" will be ASSIGNED to "index"
		// "index = indx;" IS A "ONE ARGUMENT CONSTRUCTOR"
	}
	
	public Jva_Polymorph_Constructor_OverLD(double indx) {
		index = (int)indx;
		
		// "GIVE A PROVISION TO ACCEPT THE VALUES FROM OUTSIDE FOR "double""
		// For "double" type of value we need to CONVERT it as "int" and assign the value
		// "index = (int)indx;"
	}
	

	public void display() { // METHOD to display in CONSOLE
		
	System.out.println("Index ="+index); 
	// "Index =" meaning it will display 'index' value as it is. 
	// Because it is enclosed with DOUBLE QUOTES 
	}
	
	// MAIN METOHD FOR EXECUTION 
	
	public static void main(String[] args) {
		
		Jva_Polymorph_Constructor_OverLD t1 = new Jva_Polymorph_Constructor_OverLD(); // Instance Creation
		
		// If there is no value passed into the Constructor's parameter(in PANETHESIS) it will INVOKE the 
		// "ZERO ARGUMENT CONSTRUCTOR", the first one on top, DISPLAYS the Index value as ZERO.
		// Ex: Jva_Polymorph_Test t1 = new Jva_Polymorph_Test();
		// if you pass any value in the Constructor's parameter(PANETHESIS),
		// BASED on YOUR VALUE it will execute that CONSTRUCTOR 
		// ex: Jva_Polymorph_Test t1 = new Jva_Polymorph_Test(99); 2nd will be executed, 99 is int value
		// ex: Jva_Polymorph_Test t1 = new Jva_Polymorph_Test(99.99); 3rd will be executed, 99 is int value
		
		t1.display();
		
	}
}
