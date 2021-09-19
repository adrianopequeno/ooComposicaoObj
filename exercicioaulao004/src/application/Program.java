package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {
	
	public static void main(String arg[]) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product p = new Product("TV", 1000.00);	
		//OrderItem oi1 = new OrderItem(2, 1000.00, p);
		Client cli = new Client("Adriano", "eu-a@hotmail.com", sdf.parse("13/05/1987"));
		
		System.out.println(cli);
		
		sc.close();
	}
}
