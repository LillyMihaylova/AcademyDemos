
public class Students extends People {

	double gpa;

	public Students(String firstName, String lastName, String birthday, double gpa) {
		super(firstName, lastName, birthday);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if (gpa > 2 && gpa < 6) {
			this.gpa = gpa;
		} else {
			System.out.println("Error in GPA");
		}
	}
}
