package sample;

/*Создать класс Student как подкласс Human.
 * Поля:
 * int id (номер зачетки)
 * String groupName (название группы где он учится)
 * Методы:
 * Стандартные (методы получения и установки, toString() и т. д.
 * Объявите класс CSVStringConverter реализующий указанный интерфейс. Логика реализации следующая — на основе 
 * Студента создать строку с его CSV представлением и наоборот на основе этой строки создать Студента.
 */


public class Student extends Human implements CSVStringConverter{

	private int id;
	private String groupName;
	
	public Student(String name, String lastName, Gender gender, int id, String groupName) {
		super(name, lastName, gender);
		this.id = id;
		this.groupName = groupName;
	}

	public Student(String name, String lastName, Gender gender) {
		super(name, lastName, gender);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + " id=" + id + ", groupName=" + groupName + "]";
	}

	@Override
	public String toStringRepresentation(Student student) {
		String toCSV = Student.this.getName() + ";" + Student.this.getLastName() + ";" + Student.this.getGender() + ";" + Student.this.getId()+ ";" + Student.this.getGroupName();
		
		return toCSV;
	}

	@Override
	public Student fromStringRepresentation(String str) {
		String [] fromCSV = str.split(";"); 
		
		return new Student(fromCSV[0],fromCSV[1],Gender.valueOf(fromCSV[2]),Integer.valueOf(fromCSV[3]),fromCSV[4]);
	}
	
	
}
