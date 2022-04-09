package finaltest;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
System.out.print("How many customers?");
		int n=input.nextInt();
		Customer [] cus = new Customer[n];
    double total=0.0; 
		int index=0;
     double max=0;
		 for(int i =0;i<n;i++){
			 int ii=i+1;
		   System.out.print("Customer "+ ii +" name: ");
			 String name=input.next();
			 System.out.print("Price that the customer pay: ");
			 double price=input.nextDouble();
			 cus[i] = new Customer(name, price);
			 total+=price;
			 if (price>=max){
				index=i;
			 max = Math.max(max, price);
		 }
			
		 }
	System.out.println("The customer with the highest price is "+cus[index].getName());
			 System.out.print("The total sales is : "+total);
	}
}


class Customer{
    private String name; //customer name
    private double price; //price that a customer pay
    
    public Customer(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name; 
    }

    public void setPrice(double price) {
        this.price = price;
    }
}