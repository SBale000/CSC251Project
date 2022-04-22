

/**
 * @author sbale000
 */
public class PolicyHolder {
	
private String firstName, lastName;
private int age, heightInches, weightLbs;

private enum Smoke {SMOKER, NON_SMOKER, NIL};
private Smoke smkStatus;
	
/**
 * 
 * @param fName policy holder's first name
 * @param lName policy holder's last name
 * @param lAge  policy holder's age
 * @param height policy holder's height in inches
 * @param weight policy holder's weight in pounds
 * @param smk policy holder's smoking status {SMOKER | NON_SMOKER}
 */

public PolicyHolder(String fName, String lName, int lAge, int height, int weight, Smoke smk) {
	firstName=fName;
	lastName=lName;
	age=lAge;
	heightInches=height;
	weightLbs=weight;
	smkStatus=smk;
}
/**
 * Default constructor
 */
public PolicyHolder() {
	this("", "", 0, 0, 0, Smoke.NIL);
}

/**
 * @param String fName
 */
public void  setFirstName(String fName) {
	firstName=fName;
}

/**
 * @param String lName
 */
public void setLastName(String lName) {
	lastName=lName;
}

/**
 * @param int lclAge in years
 */
public void setAge(int lAge) {
	age=lAge;
}

/**
 * @param int height in inches
 */
public void setHeight(int height) {
	heightInches=height;
}

/**
 * @param int weight in lbs
 */
public void setWeight(int weight) {
	weightLbs=weight;
}

/**
 * @param smokingStatus
 */
public void setSmokingStatus(Smoke smk) {
	smkStatus=smk;
}



}// end class
