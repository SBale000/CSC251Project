/**
 * Creates an insurance policy object underwritten by <code> providerName</code> for <code>firstName</code> <code> lastName</code>,
 * and is rating using <code> BASE_FEE</code> plus additional charges that are a function
 * of the policy holder's <code>age</code>, <code> heightInches</code>,<code> weightLbs</code>, and
 * <code> smokingStatus </code>
 * @author S. Bale <a href="https://github.com/SBale000">GitHub</a>
 *
 *
 *
 */


public class Policy {

	private int policyNum;
	private String providerName;

	
	private static final double BASE_FEE=600.00;
	
	
	private double addlFee;
	
	/**
	 * Default constructor
	 */
	public Policy() {
		policyNum=0;
		providerName="";
	
	}
	
/**
 * Constructor to pass instance values as params from main routine 
 * @param policyNum policy holder's policy number
 * @param providerName name of insurance underwriter

	public Policy(int policyNum, String providerName) {
		
		this.policyNum=policyNum;
		this.providerName=providerName;
		
		
	} //end default constructor
	
	/**	
	 * Create setters
	 * @param lclPolicyNum
	 */
		
	public void setPolicyNum(int lclPolicyNum) {
		policyNum=lclPolicyNum;
	}
	
	/**
	 * @param lclProviderName
	 */
	public void setProviderName(String lclProviderName) {
		providerName=lclProviderName;
	}

	
	/**
	 * Create method-scoped vars of height, weight from getters to prevent side effects
	 * @return double
	 */
	/*public int getBMI() {
		int heightSquared=getHeight()*getHeight();
		int weight=getWeight();
		final int CONV_FACTOR=703;
		return (weight*CONV_FACTOR)/heightSquared;
		
	}
	/**
	 * Calculate policy price based on age, BMI, and smoking status
	 * @return price the policy price
	 */
	/*public double getPrice() {
		final double BASE_PRICE=600.00;
		final double ADDL_FEE_AGE=75.00;
		final double ADDL_FEE_SMOKING=100.00;
		final double ADDL_FEE_PER_BMI=20.00;
		final int AGE_THRESH=50;
		final int BMI_THRESH=35;
		double excessBMI=Double.max(getBMI()-BMI_THRESH, 0.00);
		
		double price=(getAge()>50) 
						? BASE_PRICE+ADDL_FEE_AGE
						: BASE_PRICE ;
		
		
		price +=  ADDL_FEE_PER_BMI*excessBMI;
		
		if (smokingStatus.equalsIgnoreCase("smoker")) {
			price += ADDL_FEE_SMOKING;
		}
		
		return price;
	}
	
	public String toString() {
		String str=
				"\nPolicy information:\n\n" +
				"Policy number: " + policyNum +
				"\nProvider name: " + providerName +
				"\nFirst name: " + firstName +
				"\nLast name: " + lastName +
				"\nAge: " + age +
				"\nHeight in inches: " + heightInches +
				"\nWeight in pounds: " + weightLbs +
				"\nSmoking status: " + smokingStatus +
				"\nBMI: " + getBMI() +
				"\nPolicy price: $" + String.format("%,.2f",getPrice());
		return str;
		
	}
	
	//*/
	
  
} //End class
