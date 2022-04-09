package section04;

public class CumProd {

	public static void main(String[] args) {
		int product = 1;
		for (int i = 1; i<=20; i++) {
			product = product * 2;
			//////i가 1부터20될때까지 곱하니까 2의 20제곱임
		}
		
		System.out.println("2 ^ 20 = " + product);

	}

}
