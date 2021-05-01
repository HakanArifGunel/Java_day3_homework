package ucuncuGunOdev2_v2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"Engin", "Demiro�", "Java E�itimi");
		BaseUserManager baseUserManager = new BaseUserManager();
		baseUserManager.add(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.assignTraining(instructor);
		
		System.out.println("---------------------------------------");
		
		Student student = new Student(2, "Hakan", "G�nel", "Java E�itimi");
		student.setTakenCourseName("Java E�itimi");
		baseUserManager.add(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.performance(student, student);
			
		
	}

}
