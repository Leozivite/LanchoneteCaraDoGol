package Program;



import java.util.Locale;
import java.util.Scanner;

import entities.Pedido;
import entities.calculos;

public class Main  {

	public static void main(String[] args) throws InterruptedException {
		String La="N";
		int x=0;
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);	
		Pedido ped=new Pedido();
		System.out.println("voce deseja pedir um lanche?");
		String pedido = sc.nextLine().toUpperCase();
		while (x==0) {if (pedido.equals("S") || pedido.equals("SIM")) {
			ped.pedidof();
			x=1;
		}
		else if (pedido.equals("N") || pedido.equals("NAO")) {
			x=1;
		}
		else {
			System.out.println("SIM ou NAO?");
			pedido = sc.nextLine().toUpperCase();
		}
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
