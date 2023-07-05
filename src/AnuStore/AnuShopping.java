package AnuStore;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class AnuShopping {

	public static void main(String[] args) {
		
		String id = null;
		
		String productName = null;
		int quantity = 0;
		double price = 0.0;
		double totalPrice = 0.0;
		double overAllPrice = 0.0;
		double cgst, sgst, subtotal = 0.0, discount = 0.0;
		
		char choice = '\0';
		
		System.out.println("\t\t\t------------------------------Anuradha-----------------------------------");
		System.out.println("\t\t\t\t\t     " + " " + "Metro Mall Anu Shop");
		System.out.println("\t\t\t\t\t3/98 SilverZone New Kolhapur\n");
		System.out.println("GSTIN: 03AWBPP8756K592" + "\t\t\t\t\t\t\t\tContact: (+91) 7666208711");
		
		System.out.println();
//		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String customername = sc.nextLine();
		
		List<Product> product = new ArrayList<Product>();
		
		do
		{	
			System.out.println();
			System.out.println("Enter the oroduct details: ");
			
			System.out.print("Product ID: ");
			id = sc.nextLine();
			System.out.print("Product Name: ");
			productName = sc.nextLine();
			System.out.print("Quantity: ");
			quantity = sc.nextInt();
			System.out.print("Price (per unit): ");
			price = sc.nextDouble();
			totalPrice = price * quantity;
			
			overAllPrice = overAllPrice + totalPrice;
			
		    product.add(new Product(id, productName, quantity, price, totalPrice));
		    
		    System.out.format(
		    		"******************************************************************************************\n");
		    
		    System.out.print("Want to add more items? (y or n): ");
		    System.out.println();
		    
		    
		    choice = sc.next().charAt(0);
		    sc.nextLine();
		    
			
		}while(choice == 'y' || choice == 'Y');
		
		Product.displayFormat();
		for (Product p : product) {
//			p.displayFormat();
			p.display();
			
		}
		System.out.println();
		System.out.print("\n\t\t\t\t\t\t\t\t\t           Total Amount (Rs.): " + overAllPrice );
		System.out.println();
		
		discount = overAllPrice * 2 /100;
		
		System.out.print("\n\t\t\t\t\t\t\t\t\t           Discount(Rs.): " + discount);
		System.out.println();
		
		subtotal = overAllPrice * 12 / 100;
		
		System.out.print("\n\t\t\t\t\t\t\t\t\t           SubTotal: " + subtotal);
		System.out.println();
		
		cgst = overAllPrice * 12 / 100; 
		
		System.out.print("\n\t\t\t\t\t\t\t\t\t           CGST: " + cgst);
		System.out.println();
		
		sgst = overAllPrice * 12 / 100; 
		
		System.out.print("\n\t\t\t\t\t\t\t\t\t           SGST: " + sgst);
		System.out.println();
		
		
		
		System.out.println("\n\t\t\t\t\t\t\t\t\t            Total " + (subtotal + cgst + sgst));
		System.out.println("\n\t-----------------------------------Thank You For Shopping!!---------------------------------");
		System.out.println("\t\t\t\t                      Visit Again");
		sc.close();

	}

}
