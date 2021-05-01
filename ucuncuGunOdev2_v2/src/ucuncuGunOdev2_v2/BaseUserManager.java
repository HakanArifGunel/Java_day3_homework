package ucuncuGunOdev2_v2;

public class BaseUserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Eklendi.");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Güncellendi.");
	}

}
