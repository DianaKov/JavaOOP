package sample;

/*
 *  Создать класс GroupOverflowException (наследник Exception) в качестве пользовательского исключения.
 */

public class GroupOverflowException extends Exception{

	public GroupOverflowException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupOverflowException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public GroupOverflowException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public GroupOverflowException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
