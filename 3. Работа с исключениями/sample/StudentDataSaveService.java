package sample;

import java.util.Scanner;

/*
 * Создайте отдельный класс который реализует считывание характеристик студента с клавиатуры (имя, фамилии и т. д.). 
 * Создание и возврат студента на основе считанных данных.
 * Используете методы этого класса для считывания и добавления студента в группу.

 */

public class StudentDataSaveService {

	Scanner sc = new Scanner(System.in);

	public Student reader() {

		System.out.println("Input new student's name:");
		String name = sc.nextLine();
		System.out.println("Input new student's last name:");
		String lastName = sc.nextLine();
		System.out.println("Input new student's gender (WOMAN or MAN):");
		Gender gender = Gender.valueOf(sc.nextLine());
		System.out.println("Input new student's ID number:");
		int id = sc.nextInt();

		Student stud = new Student(name, lastName, gender, id, null);

		return stud;
	}
}
