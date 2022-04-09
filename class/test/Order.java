package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Order {

private String name; //�Ƹ޸�ī�� īǪġ��
private char size; //R�� L
private boolean takeAway; ///true or false
private boolean cream; ///true or false
private int qty; //����
private final int priceR = 3000;///constant
private final int priceL = 4000;

public Order(String n, char s, boolean t, boolean c, int q) //constuctor
{
  name = n;
  size = s;
  takeAway = t;
  cream = c;
  qty = q;
}

public String getName() {
	 return name;
	}

	public String getSizeString() {
	 if(size == 'R')
	  return "Regular";
	 else 
	  return "Large";
	}

	public char getSize() {
	 return size;
	}

	public char getTake() {
	 if (takeAway)
	  return 'T'; //take away
	 else
	  return 'D'; //dine in
	}
	public char getCream() { ///string �̸� �ؿ�""�����(ex "c")
		 if(cream)
		   return 'C';
		 else 
		   return 'N';
		}

		public int getQty() {
		   return qty;
		}

		public int getTotal() {
		 if (size == 'R')
		   return priceR * qty;
		 else 
		   return priceL * qty;
		}
		}
