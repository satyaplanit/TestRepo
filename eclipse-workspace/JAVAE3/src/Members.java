import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Date;

public class Members extends Address {

	private String firstName, lastName, nationality;
	private Gender gender;
	private LocalDate dob;
	private String addressLine1, addressLine2, city, state, postcode, country;
	private Role role;
	private AgeGroup ageGroup;
	
	public enum Role {
        Coach,
        Player,
        Unassigned
    }

    public enum AgeGroup {
        Junior,
        Senior
    }

    public enum Gender {
        MALE,
        FEMALE
    }
    public Members() {

    }

    public Members(String firstName, String lastName, char role) {
        this.firstName = firstName;
        this.lastName = lastName;
        setRole(role);
    }

    
	public Members(String fName, String lName, char gender, String dob, String addressLine1, String addressLine2, String city, String state, String postcode, String country, String nationality) {
        this.firstName = fName;
        this.lastName = lName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.nationality = nationality;
        this.dob = convertDob(dob);
        setGender(gender);
        setRole('U');
        int age = ageCalculator(convertDob(dob));
        if (age < 25) {
            this.ageGroup = AgeGroup.Junior;
        } else {
            this.ageGroup = AgeGroup.Senior;
        }

    }
    public LocalDate convertDob(String dob) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate jDate = LocalDate.parse(dob, formatter);
        return jDate;
    }

    public int ageCalculator(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void setGender(char gender) {
        switch (gender) {
            case 'M':
                this.gender = Gender.MALE;
                break;
            case 'F':
                this.gender = Gender.FEMALE;
                break;
        }
    }

    public void setRole(char role) {
        switch (role) {
            case 'P':
                this.role = Role.Player;
                break;
            case 'C':
                this.role = Role.Coach;
                break;
            case 'U':
                this.role = Role.Unassigned;
                break;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRole() {
        return role;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }
    @Override
	public String toString() {
		return "Members [firstName=" + firstName + ", lastName=" + lastName + ", nationality=" + nationality
				+ ", gender=" + gender + ", dob=" + dob + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", state=" + state + ", postcode=" + postcode + ", country="
				+ country + ", role=" + role + ", ageGroup=" + ageGroup + "]";
	}


}
    
    