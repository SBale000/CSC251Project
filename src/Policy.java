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
	private String firstName;
	private String lastName;
	
	private int age;
	private int heightInches;
	private int weightLbs;
	private String smokingStatus;
	
	private static final double BASE_FEE=600.00;
	
	
	private double addlFee;
	
	/**
	 * Default constructor
	 */
	public Policy() {
		policyNum=0;
		providerName="";
		firstName="";
		lastName="";
		age=-1;
		heightInches=-1;
		weightLbs=-1;
		smokingStatus="";
	}
	
/**
 * Constructor to pass instance values as params from main routine 
 * @param instcPolicyNum entered by user as int
 * @param instcProviderName entered by user as String
 * @param instcFirstName entered by user as String
 * @param instcLastName entered by user as String
 * @param instcAge entered by user as int
 * @param instcHeight entered by user as int, in inches
 * @param instcWeight entered by user as int, in lbs
 * @param instcSmokingStatus one of ['smoker' || 'non-smoker'], entered by user
 */
	public Policy(int instcPolicyNum, String instcProviderName, String instcFirstName, String instcLastName, int instcAge, int instcHeight, 
			int instcWeight, String instcSmokingStatus) {
		
		policyNum=instcPolicyNum;
		providerName=instcProviderName;
		firstName=instcFirstName;
		lastName=instcLastName;
		age=instcAge;
		heightInches=instcHeight;
		weightLbs=instcWeight;
		smokingStatus=instcSmokingStatus;
		
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
	 * @param String lclFirstName
	 */
	public void  setFirstName(String lclFirstName) {
		firstName=lclFirstName;
	}
	
	/**
	 * @param String lclLastName
	 */
	public void setLastName(String lclLastName) {
		lastName=lclLastName;
	}
	
	/**
	 * @param int lclAge in years
	 */
	public void setAge(int lclAge) {
		age=lclAge;
	}
	
	/**
	 * @param int lclHeight in inches
	 */
	public void setHeight(int lclHeight) {
		heightInches=lclHeight;
	}
	
	/**
	 * @param int lclWeight in lbs
	 */
	public void setWeight(int lclWeight) {
		weightLbs=lclWeight;
	}
	
	/**
	 * @param lclSmokingStatus
	 */
	public void setSmokingStatus(String lclSmokingStatus) {
		smokingStatus=lclSmokingStatus;
	}
	
	/**
	 * Create getters
	 * @return int
	 */
	public int getPolicyNum() {
		return policyNum;
	}
	
	/**
	 * @return String
	 */
	public String getProviderName() {
		return providerName;
	}
	
	/**
	 * @return String
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @return String
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @return int in years
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @return int height
	 */
	public int getHeight() {
		return heightInches;
	}
	/**
	 * @return int in lbs
	 */
	public int getWeight() {
		return weightLbs;
	}
	
	/**
	 * @return String
	 */
	public String getSmokingStatus() {
		return smokingStatus;
	}
	
	/**
	 * Create method-scoped vars of age, height, weight from getters to prevent using stale instance state data
	 * @return double
	 */
	public double getBMI() {
		int heightSquared=getHeight()*getHeight();
		int lclWeight=getWeight();
		double bmi=0;
		//blah
		return bmi;
		
	}
	
  
} //End class
