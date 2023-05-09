package entities;

public class calculos {
	private double kpao;
	private double kcarne;
	private double kalface;
	private double ktomate;
	private double kbatata;
	private double kqueijo;
	private double Covo;
	private double kpresunto;
	private double kbacon;

	public calculos(double kpao, double kcarne, double kalface, double ktomate, double kbatata, double kqueijo,
			double Covo, double kpresunto, double kbacon) {

		this.kpao = kpao;
		this.kcarne = kcarne;
		this.kalface = kalface;
		this.ktomate = ktomate;
		this.kbatata = kbatata;
		this.kqueijo = kqueijo;
		this.Covo = Covo;
		this.kpresunto = kpresunto;
		this.kbacon = kbacon;

	}

	public void qualLanch(int lanch) {

		switch (lanch) {
		case 1:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50));
			break;

		case 2:
			System.out.printf("%.2f ",(kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + kbacon / 100));
			break;
		case 3:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30));
			break;

		case 4:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + kqueijo / 25));
			break;

		case 5:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kqueijo / 25));
			break;

		case 6:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kbacon / 100));
			break;
		case 7:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50  + kqueijo / 25 + kpresunto / 34));
			break;
		case 8:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + kqueijo / 25 + kpresunto / 34 + kbacon / 100));
			break;
		case 9:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + kqueijo / 25 + kbacon / 100));
			break;
		case 10:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kqueijo / 25 + kpresunto / 34));
			break;
		case 11:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kqueijo / 25 + kbacon / 100));
			break;
		case 12:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kqueijo / 25 + kbacon / 100 + kpresunto / 34));
			break;
		case 13:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kqueijo / 25 + kpresunto / 34 + kcarne / 35));
			break;
		case 14:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kqueijo / 25 + kpresunto / 34 + kcarne / 35 + kbacon / 100));
			break;
		case 15:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kqueijo / 25 + kpresunto / 34 + kcarne / 35 + kbacon / 100 + Covo / 12 / 30));
			break;
		case 16:
			System.out.printf("%.2f", (kpao / 30 + kqueijo / 25+ kqueijo / 25 + kpresunto / 34 + kpresunto / 34));
			break;
		case 17:
			System.out.printf("%.2f", (kpao / 30 + kqueijo / 25+ kqueijo / 25 + kpresunto / 34 + kpresunto / 34 + Covo / 12 / 30));
			break;
		case 18:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + kpresunto / 34));
			break;
		case 19:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + Covo / 12 / 30 + kpresunto / 34));
			break;
		case 20:
			System.out.printf("%.2f", (kpao / 30 + kcarne / 35 + kalface / 40 + ktomate / 1000 + kbatata / 50 + kbacon / 100 + kpresunto / 34));
			break;
		}
	}
}
