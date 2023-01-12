package sample;

public class Main {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat ("Корм", "Серый", 4, "Пегас");
		System.out.println(cat1);

		Dog dog1 = new Dog ("Корм", "Черный", 20, "Малыш");
		System.out.println(dog1);
		
		Veterinarian veterinarian1 = new Veterinarian ("Диана");
		veterinarian1.treatment(dog1);
		veterinarian1.treatment(cat1);
		
	}

}
