package com.cursoceat.model;

public class Lavadora extends Electrodomestico{

	int precio;
	boolean aguaCaliente;
	
	
	public Lavadora(String marca, double potencia, boolean aguaCaliente) {
		
		super(marca, potencia);
		this.aguaCaliente = aguaCaliente;
		
		aguaCaliente=false;
	}


	public Lavadora(String marca, double potencia, int precio, boolean aguaCaliente) {
		super(marca, potencia);
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public boolean isAguaCaliente() {
		return aguaCaliente;
	}


	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}


	@Override
	public String toString() {
		return "Lavadora [precio=" + precio + ", aguaCaliente=" + aguaCaliente + ", tipo=" + tipo + ", marca=" + marca
				+ ", potencia=" + potencia + "]";
	}
	
	
	
	
	
}
