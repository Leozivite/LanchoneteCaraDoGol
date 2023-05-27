package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Pedido {
	private String g;
	private int preco;

	public Pedido() {

	}

	public Pedido(String g, int preco) {
		this.g = g;
		this.preco = preco;
	}

	public String toString() {
		return String.format("%n") + "    lanch = " + g + String.format("%n") + "    preco = " + preco
				+ String.format("%n");
	}

	public int intValue() {

		return preco;
	}

//pedido
	public void pedidof() {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter ldtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime D04 = LocalDateTime.now();
		calculos order = new calculos(new Date(), Enums.PAGAMENTO_PENDENTE);
		double troco = 0;
		int x = 1;
		int w = 0;
		int soma = 0;
		String L = "S";
		List<Pedido> list = new ArrayList<Pedido>();

		while (L.equals("S") || L.equals("SIM")) {
			if (L.equals("status")) {
				System.out.println(order);
			}
			D04 = LocalDateTime.now();
			System.out.println("qual lanche voce deseja pedir? ");
			g = sc.nextLine().toUpperCase();
			if (g.equals("H") || g.equals("HAMBURGUER")) {
				preco = 8;
			} else if (g.equals("HB") || g.equals("HAMBURBACON")) {
				preco = 11;
			} else if (g.equals("E") || g.equals("EGGSBURGUER")) {
				preco = 10;
			} else if (g.equals("X") || g.equals("XBURGUER")) {
				preco = 11;
			} else if (g.equals("EX") || g.equals("EGGSXBURGUER")) {
				preco = 12;
			} else if (g.equals("EB") || g.equals("EGGSBACON")) {
				preco = 13;
			} else if (g.equals("XS") || g.equals("XSALADA")) {
				preco = 12;
			} else if (g.equals("XSB") || g.equals("XSALADABACON")) {
				preco = 14;
			} else if (g.equals("XB") || g.equals("XBACON")) {
				preco = 13;
			} else if (g.equals("EXS") || g.equals("EGGSXSALADA")) {
				preco = 13;
			} else if (g.equals("EXB") || g.equals("EGGSXBACON")) {
				preco = 14;
			} else if (g.equals("XT") || g.equals("XTUDO")) {
				preco = 16;
			} else if (g.equals("A") || g.equals("AMERICANO")) {
				preco = 16;
			} else if (g.equals("MF") || g.equals("MATAFOME")) {
				preco = 18;
			} else if (g.equals("DXT") || g.equals("DUPLOXTUDO")) {
				preco = 20;
			} else if (g.equals("MQ") || g.equals("MISTO QUENTE")) {
				preco = 11;
			} else if (g.equals("PRES") || g.equals("PRENSADO")) {
				preco = 13;
			} else if (g.equals("P") || g.equals("PRESSBURGUER")) {
				preco = 10;
			} else if (g.equals("EP") || g.equals("EGGSPRESSBURGUER")) {
				preco = 12;
			} else if (g.equals("EPB") || g.equals("EGGSPRESSBACON")) {
				preco = 14;
			} else {
				System.out.println("NAO TEMOS ESSE LANCHE NO CARDAPLIO");
				preco = 0;
			}

			list.add(new Pedido(g, preco));

			System.out.println("Deseja pedir outro lanche? ");
			L = sc.nextLine().toUpperCase();
			if (!L.equals("S") && !L.equals("SIM") && !L.equals("N") && !L.equals("NAO")) {
				System.out.println("SIM OU NAO? ");
				L = sc.nextLine().toUpperCase();
			}
		}
		for (Pedido n : list) {
			soma += n.intValue();
		}
		System.out.println(list.toString());
		System.out.println("valor total a pagar = " + soma);
		System.out.println("Hora do pedido " + D04.format(ldtf1));
		System.out.print("troco para ? ");

		
			try {
				troco = sc.nextDouble();
				while (w != 0) {
					if (soma < troco) {
						System.out.println("pagamento confirmado");
						w = 1;
						order.setStatus(Enums.HA_CAMINHO);
					} else {
						System.out.printf("troco invalido %ntente novamente");
						w = 0;
					}
					
				}
				System.out.printf("pedido feito aquarde%n");

				order = new calculos(new Date(), Enums.PEDIDO_ENTREGUE);
				System.out.println(order);

			} catch (InputMismatchException e) {
				System.out.println("Troco invalido , pedido cancelado ");
				
			
		}

	}

}
