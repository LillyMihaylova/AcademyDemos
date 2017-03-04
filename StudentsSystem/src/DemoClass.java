
public class DemoClass {

	public static void main(String[] args) {

		String bDay = "15.01.1974";

		SchoolClass schoolClass11A = new SchoolClass("11A", 406, "Ivan", "Ivanov");

		Students stud1 = new Students("Petar", "Petrov", "02.06.2000", 4.68);
		Students stud2 = new Students("Kiril", "Dimitrov", "07.08.2000", 5.46);

		schoolClass11A.students.add(stud1);
		schoolClass11A.students.add(stud2);

		Teachers teacher1 = new Teachers("Iva", "Savova", "15.01.1974", 20);
		Teachers teacher2 = new Teachers("Kiril", "Kirilov", "15.01.1974", 30);

		schoolClass11A.teachers.add(teacher1);
		schoolClass11A.teachers.add(teacher2);

		shcoolClassGpa(schoolClass11A);
		checkBirthDayTeachers(schoolClass11A, bDay);
		overallTeachersExperiance(schoolClass11A);

	}

	private static void overallTeachersExperiance(SchoolClass schoolClass11A) {

		int years = 0;

		for (int i = 0; i < schoolClass11A.teachers.size(); i++) {
			years += schoolClass11A.teachers.get(i).yearsOfExperiance;
		}
		System.out.println("Teachers years of experiance " + years);

	}

	private static void checkBirthDayTeachers(SchoolClass schoolClass11A, String bDay) {

		for (int i = 0; i < schoolClass11A.teachers.size(); i++) {
			if (schoolClass11A.teachers.get(i).birthday.equals(bDay)) {
				System.out.print(schoolClass11A.teachers.get(i).firstName + " ");
				System.out.println(schoolClass11A.teachers.get(i).lastName);
			}
		}
	}

	private static void shcoolClassGpa(SchoolClass schoolClass11A) {

		double studentsGpa = 0;

		for (int i = 0; i < schoolClass11A.students.size(); i++) {
			studentsGpa += schoolClass11A.students.get(i).gpa;
		}
		System.out.println("Students GPA " + studentsGpa / schoolClass11A.students.size());

	}
}
