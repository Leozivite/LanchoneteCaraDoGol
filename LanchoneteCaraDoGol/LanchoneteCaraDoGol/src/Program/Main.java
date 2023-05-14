package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.calculos;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
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

	sc.close();
	}

}
