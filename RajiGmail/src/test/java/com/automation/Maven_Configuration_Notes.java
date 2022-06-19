package com.automation;

public class Maven_Configuration_Notes {

	public static void main(String[] args) {
		
		/* Maven
		 * 
		 *  Maven does not need any CODE, we only need is "Configuration" of Maven 
		 * 	to execute  BACTH FILES in different ways.
		 * 
		 * 1. "EclipseIDE-->testng.xml"
		 * 2. "EclipseIDE-->Pom.xml-->testng.xml"
		 * 3. "cmd-->Pom.xml-->testng.xml"
		 * 4. "cmd-->Pom.xml-->testng.xml"
		 *
		 */
		
		
		/* 1. "EclipseIDE-->testng.xml"
		 * 
		 * We already KNOW, how to execute BATCH FILE "testng.xml" through EclipseIDE.
		 * "EclipseIDE-->testng.xml"
		 *
		 */


		
		/* 2. "EclipseIDE-->Pom.xml-->testng.xml" method
		 * 
		 * One more Approach is "EclipseIDE-->Pom.xml-->testng.xml", meaning 
		 * EclipseIDE, we are going to INVOKE "testng.xml" file through "Pom.xml" 
		 * 
		 * 
		 * in this method we CAN NOT EXECUTE "testng.xml" file through "Pom.xml" directly,
		 * we need "PlugIns". 
		 * 
		 * 
		 * How to INVOKE "testng.xml" file through "Pom.xml"?
		 * 
		 * Open "Pom.xml" file from NAvigator(deprecated)
		 * 
		 * Go all the way down to end of the </dependencies> tag,
		 * 
		 * Write a "Build" tag, type in 'bu', hit ctrl space bar select  "<build>", both
		 * begin and close tags will be displayed <build> </build>
		 * 
		 * inside the "<build>", type 'plu', hit hit ctrl space bar select "<plugins>" both
		 * begin and close tags will be displayed <plugins></plugins>,
		 * 
		 * Inside the <plugins> we need 2 plugins,
		 * 
		 * WHY 2 PLUGINS ARE REQUIRED?
		 * 
		 * To EXECUTE "testng.xml" file through "Pom.xml", we need 2 plugins
		 * 
		 *   1. Complier plugin
		 *   2. Surefire plugin
		 *   
		 *   1. Complier plugin
		 * 
		 * Go to "mavenrepository.com", search for "Compiler Plugin",
		 * 
		 *   Look for " Apache Maven Compiler Plugin" and click on it
		 *   
		 *   click on latest version, and COPY the 'dependency', 
		 *   
		 *   Go to "Pom.xml" file, type '<plu', hit hit ctrl space bar select "<plugin>" both
		 * 	 begin and close tags will be displayed <plugin></plugin>,
		 *   Now PASTE the COPIED <dependency> inside the <plugin> tag, 	
		 *   Now REMOVE both the <dependency></dependencies> tags, why because they are NOT 
		 *   <dependency> anymore.
		 *   
		 *   Now at the END of the </version> TAG, type in '<conf', 
		 *   hit ctrl space bar and select <configuration>, both the <configuration></configuration> 
		 *   tags will be displayed.
		 *   
		 *   Now inside the <configuration> tag, type in '<sour', 
		 *   hit ctrl space bar and select <source>, both the <source></source> 
		 *   tags will be displayed.
		 *   between the <source> Tags MENTION the "JAVA VERSION NUMBER" which you are using, 
		 *   Mine is "jdk11", "<source> 11 <source>"
		 *   
		 *   Now inside the <source> tag, type in '<targ', 
		 *   hit ctrl space bar and select <target>, both the <target></target> 
		 *   tags will be displayed.
		 *   between the <target> Tags MENTION the "JAVA VERSION NUMBER" which you are using, 
		 *   Mine is "jdk11", <target> 11 <target>
		 *   
		 *   
		 *   
		 *    2. Surefire plugin
		 *   
		 * Go to "mavenrepository.com", search for "Surefire plugin",
		 * 
		 *   Look for "Maven Surefire Plugin" and click on it
		 *   
		 *   click on latest version, and COPY the 'dependency', 
		 *   
		 *   Go to "Pom.xml" file, type '<plu', hit hit ctrl space bar select "<plugin>" both
		 * 	 begin and close tags will be displayed <plugin></plugin>,
		 *   Now PASTE the COPIED <dependency> inside the <plugin> tag, 	
		 *   Now REMOVE both the <dependency></dependencies> tags, why because they  
		 *   are NOT <dependency> anymore, they are 'plugins'
		 *  
		 *   Now at the END of the </version> TAG, type in '<conf', 
		 *   hit ctrl space bar and select <configuration>, both the <configuration></configuration> 
		 *   tags will be displayed,
		 *   
		 *   Now inside the <configuration> tag, type in '<suit', 
		 *   hit ctrl space bar and select <suiteXmlFiles>, both the <suiteXmlFiles></suiteXmlFiles> 
		 *   tags will be displayed.
		 *   
		 *  Now inside the <suiteXmlFiles> tag, type in '<suit', 
		 *  hit ctrl space bar and select <suiteXmlFiles>, both the <suiteXmlFiles></suiteXmlFiles> 
		 *  tags will be displayed.
		 *  
		 *  Now inside the <suiteXmlFiles> tag, type in '<suit', 
		 *  hit ctrl space bar and select <suiteXmlFile>, both the <suiteXmlFile></suiteXmlFile> 
		 *  tags will be displayed, between the tag place "testng.xml" file
		 *  "<suiteXmlFile>testng.xml</suiteXmlFile>",
		 *  
		 *  Now "testng.xml" is EXECUTABLE through "pom.xml" file.
		 *  
		 *  OPEN "pom.xml", hit on RUN button from the top, "Run as" wndow opens, 
		 *  from that select "Maven Test", click ok  
		 *  
		 *  */
		
		

		/* 3. "cmd-->Pom.xml-->testng.xml"  Method
		 * 
		 * An other Approach is RUNNING "Pom.xml" file through "COMMAND PROMPT",
		 * "cmd-->Pom.xml-->testng.xml"
		 * 
		 * 
		 * To Execute through "cmd" you need MAVEN software and CONFIGURE it,
		 * 
		 * Go to 'Google' and search for "maven download for windows", 
		 * click on Download Apache Maven, from //maven.apache.org › download 
		 * On this Website, scroll down, from "Files" section select "Binary zip archive",
		 * click on "apache-maven-3.8.5-bin.zip" link, as soon as click it will be down loaded 
		 * Go to Downloads on your system and "extract all" and unzip it, double click on the
		 * unzip folder, opens in other window, COPY the "apache-maven-3.8.5" Folder, 
		 * paste it in your Automation Software folder which is in "C: drive"
		 * double Click on the 'apache-maven-3.8.5' and then click on 'bin', 
		 * then from the 'bin'window COPY the LOCATION PATH from top and, see below
		 * C:\AutomationSoftware\apache-maven-3.8.5\bin, then set this in the "ENVIRONMENT LEVEL"
		 * 
		 *  How to set "ENVIRONMENT LEVEL"?
		 *   
		 *  Search ENVIRONMENT on the WINDOWS(AT THE BOTTOM of YOUR COMPUTER)   
		 * "Edit the Environment System Variable" pops up, click on it,
		 * 'System Properties' window opens, 
		 * click on 'Environment Variable" tab, Environment Variable window opens,
		 * Go to "system Variables" section and look for "path", 
		 * Select "path", then click on 'Edit', 'Edit Environment Variable" window opens,
		 * Now Click on "New", place the COPIED BIN path link in there, 
		 * 
		 * C:\AutomationSoftware\apache-maven-3.8.5\bin,
		 * 
		 * Click on ok, then ok, then ok
		 * 
		 * 
		 * Now go to EclipseIDE,Right click on "pom.xml" file, select "Properties",
		 * "Properties" window opens, 
		 * on the LOCATION filed C:\AutomationWorkSpace\RajiGmail\pom.xml click on the ARROW, 
		 * it will take us to the Location of the Pom.xml which is in C: drive 
		 * In C: drive, on the url bar type in "cmd" hit enter, COMMOND PROMPT window opens.
		 * Type in 'mvn -version'(no quotes used in Command Prompt), 
		 * if it displays the SAME VERSION that is showing on the 
		 * "Properties" window then it is SUCCESSFULLY DOWN LOADED and CONFIGURED.
		 * 
		 * In the next line TYPE in 'mvn test'(this test comes from when you hit on RUN from 
		 * pom.xml file it will ask you to select which type of RUN you want,
		 * we need Maven Test, so the 'test' given in command prompt), hit on ENTER
		 * 
		 * 'mvn' stands for MAVEN it always looks for pom.xml file,
		 * pom.xml file is located in 'Rajigmail',
		 * 
		 * 'test' is to execute test scripts
		 * 
		 * Internally what will happen is 'mvn' finds out the pom.xml file,
		 * from  pom.xml file it finds out the 'testng.xml' file and starts the EXECUTION
		 *if it is passed then it will show as "Build Success" 
		 * 
		 * 
		 * 
		 * */
		
	}

}
