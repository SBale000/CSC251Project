/**
 * Creates an insurance Policy object underwritten by <code> providerName</code> for a PolicyHolder
 * Utilizes a "has-a" relationship between the aggregate Policy object and the PolicyHolder
 * Calculates price of policy based on PolicyHolder fields age, heightInches, weightLbs, and smkStatus
 * @author S. Bale
 *
 *
 *
 */


public class Policy {

	private int policyNum;
	private String providerName;
	private static int instanceCount=0; //Will use a static class getter to return instanceCount for max security
	private String smkStatus;
	private PolicyHolder polHolder;

	
	/**
	 * Default constructor. Increments class field instanceCount since a new instance is created
	 */
	public Policy() {
		policyNum=0;
		providerName="";
		polHolder= new PolicyHolder();
		instanceCount++;
	
	}
	
/**
 * Constructor to pass instance values as params from main routine
 * Deep-copies PolicyHolder instance passed to it for security reasons
 *  
 * @param policyNum policy holder's policy number
 * @param providerName name of insurance underwriter
 * @param polHolder policy holder's name and health data
 */

	public Policy(int policyNum, String providerName, PolicyHolder polHolder) {
		
		this.policyNum=policyNum;
		this.providerName=providerName;
		this.polHolder=new PolicyHolder(polHolder);
		instanceCount++;
	}
	
	/**
	 * Add class-level getter for instance count 
	 * @return instanceCount the total number of times a Policy constructor has been called
	 */
	public static int getInstanceCount() {
		return instanceCount;
	}
	
	/***********Setters***********/
	
	/**	
	 * @param lclPolicyNum insurance policy number
	 */
		
	public void setPolicyNum(int lclPolicyNum) {
		policyNum=lclPolicyNum;
	}
	
	/**
	 * @param lclProviderName insurance undewriter's name
	 */
	public void setProviderName(String lclProviderName) {
		providerName=lclProviderName;
	}

	/***********Getters***********/

	/**
	 * Calculate policy price based on age, BMI, and smoking status
	 * @return price the policy price
	 */
	public double getPrice() {
		final double BASE_PRICE=600.00;
		final double ADDL_FEE_AGE=75.00;
		final double ADDL_FEE_SMOKING=100.00;
		final double ADDL_FEE_PER_BMI=20.00;
		final int AGE_THRESH=50;
		final int BMI_THRESH=35;
		double bmi=polHolder.getBMI();
		int age=polHolder.getAge();
		double excessBMI=Double.max(bmi-BMI_THRESH, 0.00); //Calculate amount of policyholder's BMI above 35
		
		double price=(age>AGE_THRESH) 
						? BASE_PRICE+ADDL_FEE_AGE //add additional fee if over age 50
						: BASE_PRICE ; //otherwise just base price
		
		
		price +=  ADDL_FEE_PER_BMI*excessBMI;
		
		if (polHolder.getSmkStatus().equalsIgnoreCase("smoker"))
				price += ADDL_FEE_SMOKING;
		return price;
	}
	
	/**
	 * Deep-copy for security reasons
	 * @return new copy of PolicyHolder instance
	 */
	public PolicyHolder getPHolder() {
		return new PolicyHolder(polHolder);
	}
	
	

	@Override
	public String toString() {
		String str=
				"\nPolicy number: " + policyNum +
				"\nProvider name: " + providerName +
				"\nPolicy price: $" + String.format("%,.2f", getPrice());
		return str;


	
  
} //End class
