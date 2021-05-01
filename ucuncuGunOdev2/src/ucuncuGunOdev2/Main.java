package ucuncuGunOdev2;

public class Main {

	public static void main(String[] args) {
		
		BaseUserManager baseUserManager = new BaseUserManager();
		baseUserManager.add();
		baseUserManager.remove();
		baseUserManager.update();
		
		System.out.println("--------------------------------------");
		
		Instructor instructor = new Instructor();
		instructor.id =1;
		instructor.firstName = "Engin ";
		instructor.lastName = "Demiroğ";
		instructor.trainingName = "Java Eğitimi";
		instructor.countOfComplatedTrainings = 1;
		instructor.countOfPassedStundent = 37;
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.list(instructor.firstName + instructor.lastName);
		instructorManager.add();
		
		System.out.println("--------------------------------------");

		Student student = new Student();
		student.firstName = "Hakan ";
		student.lastName  = "Günel"; 
		student.countOfComplatedTrainings = 1;
		student.trainingName = "Java Eğitimi";
		
		StudentManager studentManager = new StudentManager();
		studentManager.add();
		studentManager.takenCourses(student.trainingName);
		
		System.out.println("--------------------------------------");
		
		BaseUserManager[] baseUserManager2 = new BaseUserManager[] {new InstructorManager(), new StudentManager()};
		for (BaseUserManager userManager : baseUserManager2) {
			 userManager.remove();
		}

	}

}
