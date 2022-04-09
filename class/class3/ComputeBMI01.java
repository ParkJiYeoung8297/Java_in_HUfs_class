package class3;

public class ComputeBMI01 {

	public static void main(String[] args) {
		double weight;
		int feet, inches;
		
		weight = 140;
		feet = 6;
		inches = 25;
		
		int height = feet * 12 + inches;
		double BMI = weight * 703 / (height * height);
		System.out.println("Body mass index: " + BMI);

	}

}
