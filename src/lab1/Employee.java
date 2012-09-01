package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;

    public Employee(String firstName, String lastName, String ssn) {
        
        //Validate firstName, lastName, ssn
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //validate firstName
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //validate firstName
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
   
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        //validate Social Security Number
        this.ssn = ssn;
    }
    
    public void employeeOrientation(String cubeID){
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeID);
    }
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
            metDeptStaff = true;
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
            reviewedDeptPolicies = true;
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
       //Validate input
            this.cubeId = cubeId;
            this.movedIn = true;
        
    }
    
    public String getStatus() {
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete.";
        } else {
            return "Orientation in progress...";
        }
    }
}
