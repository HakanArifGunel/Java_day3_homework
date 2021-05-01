package ucuncuGunOdev2_v2;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String trainingName;
	
	public User (int id, String firstName, String lastName, String trainingName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.trainingName = trainingName;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

}
