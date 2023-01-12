package sample;

public class Cat extends Animal  {
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVoice() {
        return "Кошка говорит Мяу-мяу";
    }
	
	public String eat() {
        return "Кошка кушает";
    }
	
	public String sleep() {
        return "Кошка спит";
    }

	@Override
	public String toString() {
		return "Cat [name=" + name + ", getVoice()=" + getVoice() + ", eat()=" + eat() + ", sleep()=" + sleep()
				+ ", getRation()=" + getRation() + ", getColor()=" + getColor() + ", getWeight()=" + getWeight() + "]";
	}
	
}
