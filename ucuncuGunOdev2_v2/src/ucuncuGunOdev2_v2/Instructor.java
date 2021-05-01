package ucuncuGunOdev2_v2;

public class Instructor extends User{
	
	private int countOfPassedStudent;

	
	public Instructor(int id, String firstName, String lastName, String trainingName) {
		super(id, firstName, lastName, trainingName);
	}


	public int getCountOfPassedStudent() {
		return countOfPassedStudent;
	}


	public void setCountOfPassedStudent(int countOfPassedStudent) {
		this.countOfPassedStudent = countOfPassedStudent;
	}


}
