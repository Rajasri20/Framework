package com.automation;

public class Jenkins_Notes {
	
	/* Jenkins 
	 * 
	 * Jenkins is not part of the Frame work it is a separate concept.
	 * 
	 * Any kind of script can be RUN on Jenkins, irrespective of Script whether it is 
	 * a normal script or frame work one just place the script in 'testng.xml file'
	 * 
	 * RUNNING THE pom.xml file through jenkins
	 * 
	 * path to C:\AutomationWorkSpace\RajiGmail\pom.xml, right click on pom.xml, properties,
	 * select this path on window 
	 * 
	 * Advantages of Jenkins is "SCHEDULING THE JOBS and EMAIL NOTIFICATION "
	 * 
	 * 
	 * 
	 * 1. SCHEDULING THE JOBS
	 * 
	 * I want to execute the JOBS on so and so DATE and so and so TIME
	 * 
	 * 
	 * 
	 * 2. EMAIL NOTIFICATION
	 * 
	 * Once we Execute our Automation Scripts send an EMAIL NOTIFICATION to Higher Management
	 * 
	 * 
	 * */
	
	/* Download and Configure Jenkins */
	  
	 /* go to https://www.jenkins.io/download/
	 * 
	 * Under Downloading Jenkins,
	 *  
	 * under Download Jenkins 2.332.3 LTS for:
	 * 
	 * clcik on (.war)file to download, which is Generic Java Package(.war)
	 * 
	 * .war meaning "Web Archive"
	 * 
	 * Copy jenkin.war from your Downloads folder,C: drive, Automation software folder  
	 * and and create a new folder and Paste, where all your Automation software is there 
	 * 
	 * 
	 * */
	
	/* How to Start Jenkins server */
	
	/* Go to jenkin.war file location(to C: drive, Automation software folder and jenkins)
	 * 
	 * click on the top bar, and type cmd and press Enter,
	 *  
	 * Command Prompt window Opens, now type in java-jar jenkins.war now press Enter, 
	 * 
	 * jenkins server starts and it will take some time to start 
	 * 
	 *  now open any web browser, paste this link http://localhost:8080/, and press enter,
	 *   
	 *  "8080" is the default port number, 
	 *   
	 *  that means "jenkins is up and running in my local system" 
	 *  
	 *  after this, on the Browser it will show complete location of the password
	 *  
	 *  C:\Users\rames\.jenkins\secrets\initialAdminPassword
	 *  
	 *  go to your system C: drive, users, rames, .jenkins, secrets, initialAdminPasswords,
	 *  right click on initialAdminPasswords select 'open with' 
	 *  and select notepad, password is generated for the very first time,
	 *  
	 *     ec3697b8035249d2af9fe02827065612, copy this and paste in the webpage, 
	 *     click on continue, in the next page select "Installed suggested plugins" 
	 *     
	 *     aFTER THIS FOLLOW THE NOTES ON pdf TO CONFIGURE.
	 *     
	 *     rUNNING THE pom.xml file through jenkins,
	 *     
	 *     1st create a job and hit on Build now
	 *     
	 * 
	 * */
	

}
