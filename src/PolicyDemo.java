import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * This class will read input from a file and use the file data to create Policy objects
 * @author S. Bale
 *
 */
public class PolicyDemo {
public static void main(String[] args) throws IOException {
	
	final String FILE_NAME="include/PolicyInformation.txt" ;
		
	int policyNum=0, age=0, heightInches=0;
	double weightLbs=0.0;
	String providerName="", firstName="", lastName="", smokingStatus=""; 
	Policy policy;
	PolicyHolder pHolder;
	ArrayList<Policy> pList=new ArrayList<>(); //pList will hold all of the Policy objects

	File file = new File(FILE_NAME);
	
	
	if (!file.exists()) {
		System.out.printf("\nFile %s does not exist. Exiting.\n", file.getAbsolutePath());
		System.exit(0);
	}
	Scanner in = new Scanner(file);
	String line;
	int lineNum=1; //Will count number of lines in the input file
	
	//Iterate over file
	while (in.hasNext()) {
		
		line=in.nextLine();
		System.out.println(line);
		
		/* The following switch will determine which field to assign the file data to based on the file line number (a counter)
		 * This was an alternative way of handling the blank separator line, and your way is simpler, but I 
		 * I saw your technique after the fact and didn't want to rewrite the code.
		 */
		switch (lineNum % 9) {
			
			case 1: //Applies to line 1 since 1 % 9 == 1
				policyNum=Integer.parseInt(line);	
				break;
				
			case 2: //Applies to lineNum == 2, 11, 20, etc
				providerName=line;	
				break;
				
			case 3:
				firstName=line;
				break;
				
			case 4:
				lastName=line;
				break;
				
			case 5:
				age=Integer.parseInt(line);
				break;
				
			case 6:
				smokingStatus=line;
				break;
				
			case 7:
				heightInches=Integer.parseInt(line);
				break;
				
			case 8:
				weightLbs=Double.parseDouble(line); 
				//Create new PolicyHolder instance in order to pass to Policy constructor
				pHolder=new PolicyHolder(firstName, lastName, age, heightInches, weightLbs, smokingStatus); 
			    
				policy=new Policy(policyNum, providerName, pHolder);
				pList.add(policy);
				policy=null; pHolder=null; //Mark for GC. Maybe a small performance benefit between while loop iterations
		} //end switch
		
	lineNum++;
	} //end while
	
	int smkCount=0;
	int instcCount=Policy.getInstanceCount(); //call to static class method
	
	//Iterate over each Policy and PolicyHolder, call respective toString methods to print each instance's info, and count number of smokers
	for (Policy p: pList) {
		System.out.print(p);
		System.out.print(p.getPHolder());
		smokingStatus=p.getPHolder().getSmkStatus();
		if (smokingStatus.equalsIgnoreCase("smoker"))
			smkCount++;	
	}
	
	System.out.printf("\n\nThere were %d Policy objects created.\n\n", instcCount);
	System.out.printf("Number of policies with a smoker: %d\n", smkCount);
	System.out.printf("Number of policies with a non-smoker: %d\n", instcCount-smkCount);
	
	
in.close();
} //end main
}//end class