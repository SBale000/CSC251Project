

/**
 * @author S. Bale
 */
public class PolicyHolder {
	
private String firstName, lastName;
private int age, heightInches;
private double weightLbs;

private String smkStatus;
	
/**
 * 
 * @param fName policy holder's first name
 * @param lName policy holder's last name
 * @param lAge  policy holder's age
 * @param height policy holder's height in inches
 * @param weight policy holder's weight in pounds
 * @param smk policy holder's smoking status {SMOKER | NON_SMOKER}
 */

public PolicyHolder(String fName, String lName, int lAge, int height, double weight, String smk) {
	firstName=fName;
	lastName=lName;
	age=lAge;
	heightInches=height;
	weightLbs=weight;
	smkStatus=smk;
}

/**
 * Copy constructor
 * @param obj2 the original PolicyHolder instance to be copied
 */
public PolicyHolder(PolicyHolder obj2) {
	firstName=obj2.firstName;
	lastName=obj2.lastName;
	age=obj2.age;
	heightInches=obj2.heightInches;
	weightLbs=obj2.weightLbs;
	smkStatus=obj2.smkStatus;
}

/**
 * Default constructor
 */
public PolicyHolder() {
	this("", "", 0, 0, 0, "");
}

/***********Setters***********/

/**
 * @param fName first name
 */
public void  setFirstName(String fName) {
	firstName=fName;
}

/**
 * @param lName last name
 */
public void setLastName(String lName) {
	lastName=lName;
}

/**
 * @param int lAge in years
 */
public void setAge(int lAge) {
	age=lAge;
}

/**
 * @param height in inches
 */
public void setHeight(int height) {
	heightInches=height;
}

/**
 * @param weightweight in lbs.
 */
public void setWeight(double weight) {
	weightLbs=weight;
}

/**
 * @param smk smoking status
 */
public void setSmokingStatus(String smk) {
	smkStatus=smk;
}

/***********Getters***********/

/**
 * @return age in years
 */
public int getAge() {
	return age;
}

/**
 * @return heightInches height in inches
 */
public int getHeight() {
	return heightInches;
}

/**
 * @return weightLbs weight in pounds
 */
public double getWeight() {
	return weightLbs;
}

/** Calculate BMI. Prevent side-effects by calling heights & weight getters inside method
 * @return BMI 
 */
public double getBMI() {
	int heightSquared=getHeight()*getHeight();
	double weight=getWeight();
	final double CONV_FACTOR=703.0;
	return (weight*CONV_FACTOR)/heightSquared;
}

/**
 * @return smkStatus smoking status
 */
public String getSmkStatus() {
	return  smkStatus;
}


@Override
public String toString() {
	String str=String.format(
			"\nFirst name: " + firstName +
			"\nLast name: " + lastName +
			"\nAge: " + age +
			"\nHeight in inches: " + heightInches +
			"\nWeight in pounds:  %.2f" +
			"\nSmoking status: " + smkStatus +
			"\nBMI: %.2f\n", getWeight(), getBMI() );
	return str;
}// end toString
}// end class
