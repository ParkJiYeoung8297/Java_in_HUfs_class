package section04;

public class Testing {

	public static void main(String[] args) {
		double item = 1; double sum = 0;
		while (item != 0) { // No guarantee item will be 0
		  sum += item; ///sum=sum+item
		  item -= 0.1; ///// item=item-0.1
		/////�̷��� �ϸ� ���� Ÿ�� �ʰ��� ����� �ȳ���
		///����� �� �ؿ� ���� �׸�� ���α׷� ������
		///�׷��� ���⿡ ����Ʈ ���ָ�
		  System.out.println(item);
		}
		
		System.out.println(sum);

	}

}
