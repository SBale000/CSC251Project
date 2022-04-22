import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PolicyDemo {
public static void main(String[] args) throws IOException {
	
	final String FILE_NAME="include/PolicyInformation.txt" ;
		
	int policyNum=0, age=0, heightInches=0, weightLbs=0;
	String providerName="", firstName="", lastName="", smokingStatus=""; 
	Policy policy;
	ArrayList<Policy> pList=new ArrayList<>();

	File file = new File(FILE_NAME);
	
	
	if (!file.exists()) {
		System.out.printf("\nFile %s does not exist. Exiting.\n", file.getAbsolutePath());
		System.exit(0);
	}
	Scanner in = new Scanner(file);
	String line;
	int lineNum=1;
	
	while (in.hasNext()) {
		
		line=in.nextLine();
		System.out.println(line);
		
		switch (lineNum % 9) {
			
			case 1:
				policyNum=Integer.parseInt(line);	
				break;
				
			case 2:
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
				weightLbs=Integer.parseInt(line); 
			    policy=new Policy(policyNum, providerName, firstName, lastName, age, heightInches, weightLbs, smokingStatus);
				pList.add(policy);
				policy=null; //mark for gc()
		} //end switch
		
	lineNum++;
	} //end while
	
	for (Policy p: pList) {
		System.out.println(p);	
	}
	
	
in.close();
} //end main
}//end class