package sample;

/*
 * Дополните реализацию группы Студентов возможностью сортировки 
массива студентов по фамилии.
 * Для этого в класс Группа добавьте метод sortStudentsByLastName()
 */

import java.util.Comparator;

public class StudentsLastNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}
}
