package section06;

public class MyFirstArray {

	public static void main(String[] args) {
		double[] myList = new double[10];

		myList[0] = 5.6;
		myList[1] = 4.5;
		myList[2] = 3.3;
		myList[3] = 13.2;
		myList[4] = 4;
		myList[5] = 34.33;
		myList[6] = 34;
		myList[7] = 45.45;
		myList[8] = 99.993;
		myList[9] = 11123;
		
		System.out.println(myList.length);
		System.out.println(myList[2]);
		myList[2] = myList[0] + myList[1];
		System.out.println(myList[2]);
		
		for (int i=0; i<myList.length; i++) {
			System.out.println(myList[i]);
		}
   
	}

}
