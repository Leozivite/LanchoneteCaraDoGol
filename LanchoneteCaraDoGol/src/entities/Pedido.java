package entities;

public class Pedido {
private String g;
private int preco;
public Pedido() {
	
}
public Pedido(String g, int preco) {
	this.g = g;
	this.preco = preco;
}

public String toString () {
	return String.format("%n")+"    lanch = "+g+String.format("%n")+"    preco = "+preco+String.format("%n");
}
public int intValue() {
	
	return preco;
}
}
