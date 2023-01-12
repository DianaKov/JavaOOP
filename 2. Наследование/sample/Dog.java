package sample;

public class Dog extends Animal{
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVoice() {
        return "Собака говорит Гав-Гав";
    }
	
	public String eat() {
        return "Собака кушает";
    }
	
	public String sleep() {
        return "Собака спит";
    }

	@Override
	public String toString() {
		return "Dog [name=" + name + ", getVoice()=" + getVoice() + ", eat()=" + eat() + ", sleep()=" + sleep()
				+ ", getRation()=" + getRation() + ", getColor()=" + getColor() + ", getWeight()=" + getWeight() + "]";
	}
}
