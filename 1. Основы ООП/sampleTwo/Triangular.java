package sampleTwo;
/*
 * Описать класс Треугольник. В качестве свойств возьмите длины сторон треугольника. 
Реализуйте метод, который будет возвращать площадь этого треугольника. Создайте 
несколько объектов этого класса и протестируйте их
 */
public class Triangular {

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangular(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public Triangular() {
		super();
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double calculateArea() {
		double p = (sideA + sideB + sideC) / 2;
        double S = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
        return S;
	}
	
	@Override
	public String toString() {
		return "Площадь треугольника по формуле Герона " + calculateArea();
	}
}
