package sample;

public class Veterinarian {
	private String name;

	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void treatment(Animal animal) {
		if (animal instanceof Cat theCat) {
			System.out.println("Veterinar " + getName() + " лечит кота по имени " + theCat.getName());
		}
		if (animal instanceof Dog theDog) {
			System.out.println("Veterinar " + getName() + " лечит собаку по имени " + theDog.getName());
		}
		
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}
	
}
