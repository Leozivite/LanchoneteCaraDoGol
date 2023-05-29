package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Pedido;
import entities.calculos;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		String La = "N";
		int x = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calculos calc=new calculos();
		Pedido ped = new Pedido();
		System.out.println("voce deseja pedir um lanche?");
		String pedido = sc.nextLine().toUpperCase();
		while (x == 0) {
			if (pedido.equals("S") || pedido.equals("SIM")) {
				ped.pedidof();
				x = 1;
			} else if (pedido.equals("N") || pedido.equals("NAO")) {
				x = 1;
			} else {
				System.out.println("SIM ou NAO?");
				pedido = sc.nextLine().toUpperCase();
			}
		}
		// CALCULE O VALOR DE UM LANCHE.

		System.out.printf("%nvoce deseja calcular o valor de um lanche? ");
		x = 0;

		La = sc.nextLine().toUpperCase();

		if (La.equals("S") || La.equals("SIM")) {
			calc.calclanch();
		}
		if (!La.equals("S") && !La.equals("SIM") && !La.equals("N") && !La.equals("NAO")) {
			System.out.print("SIM OU NAO ? ");
		}
		if (La.equals("N") && !La.equals("NAO")) {
			System.out.println("FIM DO PROGRAMA");
			x = 1;
		}
		sc.close();
	}

}
