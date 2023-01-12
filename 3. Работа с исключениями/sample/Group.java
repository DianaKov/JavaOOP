package sample;

/*
 * Создать класс Group
 * Поля:
 * String groupName (название)
 * Student[] studens = new Student[10]; (массив из 10 студентов)
 * Методы:
 * Стандартные (методы получения и установки, toString() и т. д.)
 * public void addStudent(Student student) throws GroupOverflowException (метод добавления студента в группу. В случае 
добавления 11 студента должно быть возбужденно пользовательское исключение)
 * public Student searchStudentByLastName(String lastName) throws StudentNotFoundException (метод поиска студента в группе. 
Если студент не найден должно быть возбужденно пользовательское исключение)
 * public boolean removeStudentByID(int id) (метод удаления студента по номеру зачетки, вернуть true если такой студент был и он 
был удален и false в противном случае
 */

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	
	private String groupName;
	private final Student[] studens;
	
	public Group() {
		super();
		studens = new Student[10];
	}

	public Group(String groupName, Student[] studens) {
		super();
		this.groupName = groupName;
		this.studens = studens;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudens() {
		return studens;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", studens=" + Arrays.toString(studens) + "]";
	} 
	
	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < studens.length; i++) {
			if (studens[i] == null) {
				studens[i] = student;
				return;
			}
		}
		throw new GroupOverflowException();
	}
	
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (int i = 0; i < studens.length; i++) {
			if (studens[i] != null) {
				if (studens[i].getLastName().equals(lastName)) {
					return studens[i];
				}
			}
		}
		throw new StudentNotFoundException ();
	}
	
	public boolean removeStudentByID(int id) {
		for (int i = 0; i < studens.length; i++) {
			if (studens[i] != null) {
				if(studens[i].getId() == id) {
					studens[i] = null;
					return true;
				}
			}
		} 
		return false;
	}
	
	public void sortStudentsByLastName() {
		Arrays.sort(this.getStudens(), Comparator.nullsLast(new StudentsLastNameComparator()));
	}
		
}
