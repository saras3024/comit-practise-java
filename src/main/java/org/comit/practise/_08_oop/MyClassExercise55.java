package org.comit.practise._08_oop;

import java.util.Arrays;

//import java.util.Scanner;
/* Write a Java program to create a "Product" class with an id, name and quantity attributes. 
 * Also, create a class called "Inventory" with an array of products,
 *  a method to add and remove products from the array and another to check for low inventory. */
class Product{
	String name;
	int quantity ;
	int id;
	
	public Product(int id, String name, int quantity) {
		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

}




class Inventory
{
	Product[] products = new Product[10];;
	
	
  
public void addItem(Product product)
{
	for(int i = 0; i < products.length; ++i)
	{
		if(products[i] == null) 
		{
		products[i] = product;
		break;
		}	
	}
	
}
public void removeItem(int index) 
	{
	System.out.println("The removed item name is : " + products[index].getName());
		products[index] = null;
	
	}


void checkInventory() {
	
	for (Product p: products) {
		
		if (p!=null && p.getQuantity()<25) {
			System.out.printf("The Inventory is low for product: %s, quantity %d%n", p.getName(), p.getQuantity());
		}
	}
}
public void display() {
	System.out.println(Arrays.toString(products));
	
}

/*public void display() {
for(Product p1 : products)
{
	System.out.println(p1.getName());
}

	
	
}	*/

}

public class MyClassExercise55 {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		Inventory inv = new Inventory();
		
		
		Product pdt1  = new Product(100, "Pen", 10);
		Product pdt2  = new Product(101, "Pencil", 15);
		Product pdt3  = new Product(102, "Eraser", 13);
		Product pdt4  = new Product(103, "Crayons", 14);
		Product pdt5  = new Product(104, "Sketch", 20);
		Product pdt6  = new Product(105,  "Monitor", 10);
		
		
		inv.addItem(pdt1);
		inv.addItem(pdt2);
		inv.addItem(pdt3);
		inv.addItem(pdt4);
		inv.addItem(pdt5);
		inv.addItem(pdt6);
		
		inv.removeItem(4);
		
		
		inv.checkInventory();
		inv.display();
		

		
		
	//	inv.addOrRemoveProducts();
		
		
	}


}



/*	public void addOrRemoveProducts() {
System.out.println("Do you want to add or remove products");
System.out.println("Enter only add / remove");

String userInput = input.nextLine();

System.out.println("How many products do you want to " + userInput);
int num = input.nextInt();
input.nextLine();


String[] product = new String[num];


if(userInput.equalsIgnoreCase("add")) {
	for(int i = 0; i < num; ++i)
	{
		System.out.println("Enter product " + (i+ 1) + " name : ");
		product[i] = input.nextLine();
	}
		}

else {
	String[] removeItem = new String[num];
	for(int i = 0; i < num; ++i)
	{
		
		System.out.println("Enter product number" + (i+ 1) + " name to remove : ");
		 removeItem[i] = input.nextLine();
	}
	for(String compare1 : product) {
		{
			for(String compare2 : removeItem) {
				if(!(compare1.equals(compare2))) {
					System.out.println(compare1);
				}
			}
		}
		
			
		
	}
	
	
		}

} */