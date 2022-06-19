package com.automation;

public class Jva_PolyMor_PayTMSignIn_Mthod_OvrLd {
	
	/* Requirement is LogInto PayTM in 2ways one with UserName and Password. 2nd with OTP */
	
	public static void login(String userName, String password) { //login method is overloaded
		
		System.out.println("PayTM LogIn with userName and Password");
	}

	public static void login(int OTP) {
		
		System.out.println("PayTM LogIn with OTP");
	}
}
