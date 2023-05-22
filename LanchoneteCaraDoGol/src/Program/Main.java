package Program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Enums;
import entities.Pedido;
import entities.calculos;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter ldtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm/ss");
		LocalDateTime D04 = LocalDateTime.now();
		calculos order = new calculos(new Date(), Enums.PAGAMENTO_PENDENTE);
		double troco = 0;
		int w = 0;
		int preco = 0;
		int soma = 0;
		String g = "";
		String L = "S";
		String La = "";
		List<Pedido> list = new ArrayList<Pedido>();
		System.out.println("voce deseja pedir um lanche?");
		String pedido = sc.nextLine().toUpperCase();
		if (pedido.equals("S") || pedido.equals("SIM")) {

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

			}
			for (Pedido n : list) {
				soma += n.intValue();
			}
			System.out.println(list.toString());
			System.out.println("valor total a pagar = " + soma);
			System.out.println("Hora do pedido " + D04.format(ldtf1));
			System.out.print("troco para ? ");
			troco = sc.nextDouble();
			while (w != 0) {
				if (soma < troco) {
					System.out.println("pagamento confirmado");
					w = 1;
					order.setStatus(Enums.HA_CAMINHO);
				}
				else  {
					System.out.printf("troco invalido %ntente novamente");
					w = 0;
				}
				
			}
			System.out.printf("pedido feito aquarde%ndeseja ver o status?%n");
			L = sc.nextLine().toUpperCase();
			if(L.equals("S")||L.equals("SIM")) {
				System.out.println(order);
			}
			Thread.sleep(100000); 
			order=new calculos( new Date(),Enums.PEDIDO_ENTREGUE);
			System.out.println(order);
		}
		
		//CALCULE O VALOR DE UM LANCHE.
		
		System.out.printf("%nvoce deseja calcular o valor de um lanche? ");
		La = sc.nextLine().toUpperCase();
		
		if (La.equals("S") || La.equals("SIM")) {
			System.out.print("qual o preço de  quilo de pao ");
			double kpao = sc.nextDouble();
			System.out.print("qual o preço da peça do quilo da carne? ");
			double kcarne = sc.nextDouble();
			System.out.print("qual e o preço do mole do alface? ");
			double kalface = sc.nextDouble();
			System.out.print("qual e o preço d 20 quilo do tomate? ");
			double ktomate = sc.nextDouble();
			System.out.print("qual e o preço do quilo da batata?  ");
			double kbatata = sc.nextDouble();
			System.out.print("qual o preço do quilo do queijo? ");
			double kqueijo = sc.nextDouble();
			System.out.print("qual o preço da caixa de ovo? ");
			double Covo = sc.nextDouble();
			System.out.print("qual o preço do quilo do presunto? ");
			double kpresunto = sc.nextDouble();
			System.out.print("qual o preço do quilo do bacon? ");
			double kbacon = sc.nextDouble();
			System.out.println("qual lanche voce deseja saber o preco");
			calculos cal = new calculos(kpao, kcarne, kalface, ktomate, kbatata, kqueijo, Covo, kpresunto, kbacon);
			sc.nextLine();
			String lanch = sc.nextLine().toUpperCase();
			cal.qualLanch(lanch);
		} else {
			System.out.println("FIM DO PROGRAMA");
		}

		sc.close();
	}

}
