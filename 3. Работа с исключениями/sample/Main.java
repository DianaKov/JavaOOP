package sample;

public class Main {

	public static void main(String[] args) {

		StudentDataSaveService  sdss = new StudentDataSaveService ();
		Student st1 = sdss.reader();
		
		Student student1 = new Student ("Diana", "Kovalevska", Gender.Woman, 1, "JavaOOP");
		Student student2 = new Student ("Dasha", "Volkova", Gender.Woman, 2, "JavaOOP");
		Student student3 = new Student ("Max", "Matveev", Gender.Men, 3, "JavaOOP");
		Student student4 = new Student ("Alex", "Volkov", Gender.Men, 4, "JavaOOP");
		Student student5 = new Student ("Alina", "Voloshuna", Gender.Woman, 5, "JavaOOP");
		Student student6 = new Student ("Evgen", "Tkachenko", Gender.Men, 6, "JavaOOP");
		Student student7 = new Student ("Svetlana", "Kovalevska", Gender.Woman, 7, "JavaOOP");
		Student student8 = new Student ("Ivan", "Ivanov", Gender.Men, 8, "JavaOOP");
		Student student9 = new Student ("Vlad", "Topalov", Gender.Men, 9, "JavaOOP");
		Student student10 = new Student ("Karina", "Sicorskaa", Gender.Woman, 10, "JavaOOP");
		Student student11 = new Student ("Alla", "Spasskaya", Gender.Woman, 11, "JavaOOP");
		
		Group groupJavaOOP = new Group();
		groupJavaOOP.setGroupName("JavaOOP");
		
		try {
			groupJavaOOP.addStudent(student1);
			groupJavaOOP.addStudent(student2);
			groupJavaOOP.addStudent(student3);
			groupJavaOOP.addStudent(student4);
			groupJavaOOP.addStudent(student5);
			groupJavaOOP.addStudent(student6);
			groupJavaOOP.addStudent(student7);
			groupJavaOOP.addStudent(student8);
			groupJavaOOP.addStudent(student9);
			groupJavaOOP.addStudent(student10);
			//groupJavaOOP.addStudent(student11); 
		} catch (GroupOverflowException e) {
			//В случае добавления 11 студента возбужденно пользовательское исключение
			e.printStackTrace();
		}
		
		String inCSVForm = st1.toStringRepresentation(st1);
		System.out.println(inCSVForm);
		
		Student st2 = st1.fromStringRepresentation(inCSVForm);
		System.out.println(st2.toString());
		
		try {
			Student student = groupJavaOOP.searchStudentByLastName("Matveev");
			System.out.println(student);	
		}catch (StudentNotFoundException e) {
			e.printStackTrace();
		}   
		
		groupJavaOOP.sortStudentsByLastName();/

		StudentDataSaveService sds = new StudentDataSaveService();
		try {
			groupJavaOOP.addStudent(sds.reader());
			groupJavaOOP.addStudent(student1);
		} catch (GroupOverflowException e) {
			System.out.println("Your group " + groupJavaOOP.getGroupName());
		}
		
		System.out.println(groupJavaOOP.removeStudentByID(2));
		System.out.println(groupJavaOOP);
	
	}
}
