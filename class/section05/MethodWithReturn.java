package section05;

public class MethodWithReturn {

	public static void main(String[] args) {///void�� return ���x
		System.out.println("Sum from 1 to 10 is " + sum(1, 10));
		System.out.println("Sum from 20 to 30 is " + sum(20, 30));
		System.out.println("Sum from 35 to 45 is " + sum(35, 45));
	}
	
	////int:return value type    sum:method name
	public static int sum(int i1, int i2) { //void�ܴ̿� return ��� �ʼ�
	//int���� double,char� ��밡��(�޼ҵ� Ÿ�԰� return Ÿ���� ���ƾ��� int �� return�� ���� int ���̾����)
		int sum=0;
		for (int i=i1 ; i<=i2;i++){
			sum+=i;
		}
		return sum;  ////sum�� �̸��� public static int num�̶��ϸ� return num; �ؾ���
		////break �� �ݺ��� Ż���̰� return�� �޼ҵ� Ż���̴�
	}
}
