package Program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.Pedido;
import entities.calculos;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		String La = "N";
		boolean q = true;
		String email;
		String senha = "sss";
		 Conta conta =new Conta();
		String senha2 = "fdaefe";
		int x = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calculos calc=new calculos();
		Pedido ped = new Pedido();
		System.out.println("LLLL            AAA      NN   NN    CCCCCCC  HH    HH     OOOOO     NN   NN  EEEEEE TTTTTTTTT  EEEEEE                ");
		System.out.println("LLLL           AA AA     NNN  NN   CCC       HH    HH   OO     OO   NNN  NN  EE     TTTTTTTTT  EE                    ");
		System.out.println("LLLL          AA   AA    NNNN NN  CCC        HHHHHHHH  OO       OO  NNNN NN  EEEEEE    TTT     EEEEEE                ");
		System.out.println("LLLL         AAAAAAAAA   NN NNNN  CCC        HHHHHHHH  OO       OO  NN NNNN  EE        TTT     EE                    ");
		System.out.println("LLLLLLLLL   AAAA   AAAA  NN  NNN   CCC       HH    HH   OO     OO   NN  NNN  EE        TTT     EE                    ");
		System.out.println("LLLLLLLLL  AAAA     AAAA NN   NN    CCCCCCC  HH    HH     OOOOO     NN   NN  EEEEEE    TTT     EEEEEE                ");
	    System.out.println();
	    System.out.println("        CCCCCCC       AAA       RRRRRR          AAA                DDDDDDD     OOOOO                                 ");                           
	    System.out.println("       CCC           AA AA      RR   RR        AA AA               DD    DD  OO     OO                               ");
	    System.out.println("      CCC           AA   AA     RRRRRR        AA   AA              DD    DD OO       OO                              ");
	    System.out.println("      CCC          AAAAAAAAA    RR   RR      AAAAAAAAA             DD    DD OO       OO                              ");
	    System.out.println("       CCC        AAAA   AAAA   RR    RR    AAAA   AAAA            DD    DD  OO     OO                               ");
	    System.out.println("        CCCCCCC  AAAA     AAAA  RR     RR  AAAA     AAAA           DDDDDDD     OOOOO                                 ");
	    System.out.println("                                                                                                                     ");
	    System.out.println("                                  GGGGGGGG     OOOOO    LLLL                                                         ");
	    System.out.println("                                  GG         OO     OO  LLLL                                                         ");
	    System.out.println("                                  GG        OO       OO LLLL                                                         ");
	    System.out.println("                                  GG   GGG  OO       OO LLLL                                                         ");
	    System.out.println("                                  GG    GG   OO     OO  LLLLLLLLL                                                    ");
	    System.out.println("                                  GGGGGGGG     OOOOO    LLLLLLLLL                                                    ");
	    System.out.println();
	    int digito=0;
	    while(q) {
			try {
				senha = "sss";
				System.out.println("digite 1 para (criar conta) ");
				System.out.println("digite 2 para (fazer Login) ");
				sc = new Scanner(System.in);
				digito = sc.nextInt();
				if (digito == 1) {
					System.out.println();
					System.out.println();
					System.out.println("Preencha os campos");
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Email: ");
					email = sc.nextLine();
					while (!senha.equals(senha2)) {
						System.out.print("  digite a senha: ");
						senha = sc.nextLine();
						System.out.print("confirme a senha: ");
						senha2 = sc.nextLine();
						if (!senha.equals(senha2)) {
							System.out.println("senha incorreta tente novamente");
						}
					}
					conta = new Conta(email, nome, senha);
					if (conta.verificarConta() == 0) {
						conta.salvarConta();
						q = false;
					} else {
						System.out.println("conta ja existente");
					}
				}
				if (digito == 2) {
					System.out.println("email: ");
					sc.nextLine();
					email = sc.nextLine();
					System.out.println("senha:  ");
					senha=sc.nextLine();
					conta= new Conta(email, senha);
					if( conta.verificarConta()==1) {
						q=false;
					}
					else {
						System.out.println("conta inesistente");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("Erro tente novamente");
				q = true;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("BEM VINDO " + conta.getName());
		System.out.println();
		System.out.println();
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

		if (pedido.equals("Calcular Lanche")) {
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
		}
		sc.close();
	}

}
