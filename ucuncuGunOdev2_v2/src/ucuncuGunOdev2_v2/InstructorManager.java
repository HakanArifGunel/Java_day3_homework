package ucuncuGunOdev2_v2;

public class InstructorManager extends BaseUserManager{

	public void assignTraining(User user) {
		System.out.println(user.getTrainingName() + " " + user.getFirstName() +" " + user.getLastName()+ " üzerine atandý.");
	}
	
}
