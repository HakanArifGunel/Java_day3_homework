package ucuncuGunOdev2_v2;

public class Student extends User{
	
	private String takenCourseName;

	
	public Student(int id, String firstName, String lastName, String trainingName) {
		super(id, firstName, lastName, trainingName);
	}


	public String getTakenCourseName() {
		return takenCourseName;
	}


	public void setTakenCourseName(String takenCourseName) {
		this.takenCourseName = takenCourseName;
	}


}
