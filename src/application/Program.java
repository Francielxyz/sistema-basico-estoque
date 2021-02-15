package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de Nascimento (dd/MM/yyyy) = ");
		Date birthDate = sdf.parse(sc.next());
		
		System.out.println("Entre com os dados do Pedido");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Client client = new Client(name, email, birthDate);
		Order order = new Order(new Date(), status, client);
		
		System.out.println(" ");
		System.out.print("Quantos items existe neste pedido? ");
		Integer num = sc.nextInt();		
		
		for(int x = 1; x <= num; x++) {
			System.out.println(" ");
			System.out.println("Entre com os dados do pedido #" + x);
			System.out.print("Nome do produto: ");
			String productName = sc.next();
			System.out.print("Qual preço da " + productName + "? ");
			Double price = sc.nextDouble();
			
			
			Product product = new Product(productName, price);
			
			System.out.print("Quantidade: ");
			Integer quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("Dados dos Pedidos");
		System.out.println(order);
		
		sc.close();
	}

}
