package entities;

import java.util.Date;



public class calculos {
	public double pao;
	public double carne;
	public double alface;
	public double tomate;
	public double batata;
	public double queijo;
	public double ovo;
	public double presunto;
	public double bacon;
    private Date now;
    private Enums status;
	public calculos(double kpao, double kcarne, double kalface, double ktomate, double kbatata, double kqueijo,
			double Covo, double kpresunto, double kbacon) {

		pao = kpao / 30;
		carne = kcarne / 16;
		alface = kalface / 40;
		tomate = ktomate / 1000;
		batata = kbatata / 50;
		queijo = kqueijo / 25;
		ovo = Covo / 360;
		presunto = kpresunto / 34;
		bacon = kbacon / 10;
        
	}
	
	

	public calculos(Date now, Enums status) {
		this.now = now;
		this.status = status;
	} 
	
	public void setStatus(Enums status) {
		this.status = status;
	}



	public void qualLanch(String lanch) {

		if (lanch.equals("H") || lanch.equals("HAMBURGUER")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata));
		}else if (lanch.equals("HB") || lanch.equals("HAMBURBACON")) {
			System.out.printf("%.2f ", (pao + carne + alface + tomate + batata + bacon));
		} else if (lanch.equals("E") || lanch.equals("EGGSBURGUER")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo));
		}else if (lanch.equals("X") || lanch.equals("XBURGUER")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo));
		}else if (lanch.equals("EX") || lanch.equals("EGGSXBURGUER")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo));
		}else if (lanch.equals("EB") || lanch.equals("EGGSBACON")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + bacon));
		} else if (lanch.equals("XS") || lanch.equals("XSALADA")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo + presunto));
		} else if (lanch.equals("XSB") || lanch.equals("XSALADABACON")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo + presunto + bacon));
		} else if (lanch.equals("XB") || lanch.equals("XBACON")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo + bacon));
		} else if (lanch.equals("EXS") || lanch.equals("EGGSXSALADA")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + presunto));
		} else if (lanch.equals("EXB") || lanch.equals("EGGSXBACON")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + bacon));
		} else if (lanch.equals("XT") || lanch.equals("XTUDO")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + bacon + presunto));
		} else if (lanch.equals("A") || lanch.equals("AMERICANO")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + presunto + carne));
		} else if (lanch.equals("MF") || lanch.equals("MATAFOME")) {
			System.out.printf("%.2f",(pao + carne + alface + tomate + batata + ovo + queijo + presunto + carne + bacon));
		} else if (lanch.equals("DXT") || lanch.equals("DUPLOXTUDO")) {
			System.out.printf("%.2f",(pao + carne + alface + tomate + batata + ovo + queijo + presunto + carne + bacon + ovo));
		} else if (lanch.equals("MQ") || lanch.equals("MISTO QUENTE")) {
			System.out.printf("%.2f", (pao + queijo + queijo + presunto + presunto));
		} else if (lanch.equals("PRES") || lanch.equals("PRENSADO")) {
			System.out.printf("%.2f", (pao + queijo + queijo + presunto + presunto + ovo));
		} else if (lanch.equals("P") || lanch.equals("PRESSBURGUER")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + presunto));
		} else if (lanch.equals("EP") || lanch.equals("EGGSPRESSBURGUER")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + presunto));
		} else if (lanch.equals("EPB") || lanch.equals("EGGSPRESSBACON")) {
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + bacon + presunto));
		} else {System.out.printf("NAO TEMOS ESSE LANCHE NO CARDAPLIO");
		
		}
	}



	@Override
	public String toString() {
		return  String.format("    Status do pedido%n   hora = ") + now + String.format("%n   status = ") + status;
	}
	
}