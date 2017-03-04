
public class Teachers extends People {

	int yearsOfExperiance;

	public Teachers(String firstName, String lastName, String birthday, int yearsOfExperiance) {
		super(firstName, lastName, birthday);
		this.yearsOfExperiance = yearsOfExperiance;
	}

	public int getYearsOfExperiance() {
		return yearsOfExperiance;
	}

	public void setYearsOfExperiance(int yearsOfExperiance) {
		if (yearsOfExperiance > 0 && yearsOfExperiance < 40) {
			this.yearsOfExperiance = yearsOfExperiance;
		} else {
			System.out.println("Error in years of experiance");
		}
	}
}
