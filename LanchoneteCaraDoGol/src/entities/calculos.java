package entities;

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

	public void qualLanch(int lanch) {

		switch (lanch) {
		case 1:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata));
			break;

		case 2:
			System.out.printf("%.2f ", (pao + carne + alface + tomate + batata + bacon));
			break;
		case 3:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo));
			break;

		case 4:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo));
			break;

		case 5:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo));
			break;

		case 6:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + bacon));
			break;
		case 7:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo + presunto));
			break;
		case 8:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo + presunto + bacon));
			break;
		case 9:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + queijo + bacon));
			break;
		case 10:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + presunto));
			break;
		case 11:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + bacon));
			break;
		case 12:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + bacon + presunto));
			break;
		case 13:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + queijo + presunto + carne));
			break;
		case 14:
			System.out.printf("%.2f",(pao + carne + alface + tomate + batata + ovo + queijo + presunto + carne + bacon));
			break;
		case 15:
			System.out.printf("%.2f",(pao + carne + alface + tomate + batata + ovo + queijo + presunto + carne + bacon + ovo));
			break;
		case 16:
			System.out.printf("%.2f", (pao + queijo + queijo + presunto + presunto));
			break;
		case 17:
			System.out.printf("%.2f", (pao + queijo + queijo + presunto + presunto + ovo));
			break;
		case 18:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + presunto));
			break;
		case 19:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + presunto));
			break;
		case 20:
			System.out.printf("%.2f", (pao + carne + alface + tomate + batata + ovo + bacon + presunto));
			break;
		}
	}
}
