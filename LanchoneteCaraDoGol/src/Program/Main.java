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
           System.out.printf("Qual lanch vc deseja saber o preço? selecione um numero.%n1 hamburguer %n2 hamburbacon %n3 eggsburguer%n4 xburguer %n5 eggsxburguer %n6 eggsbacon %n7 xsalada %n8 xsaladabacon %n9 xbacon %n10 eggsxsalada %n11 eggsxbacon %n12 xtudo %n13 americano %n14 matafome %n15 duploxtudo %n16 misto quente %n17 prensado %n18 pressburguer %n19 eggspressburguer %n20 eggspressbacon %n: ");
           int  lanch = sc.nextInt();
calculos cal =new calculos(kpao,kcarne,kalface,ktomate,kbatata,kqueijo,Covo,kpresunto,kbacon );
        
		cal.qualLanch(lanch);
	}

}
