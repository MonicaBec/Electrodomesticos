package com.cursoceat.model;

public class Electrodomestico {

	
	String tipo,marca;
	double potencia;
	
	
	
	
	public Electrodomestico() {
	}

	public Electrodomestico(String tipo, String marca, double potencia) {
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
		
		
	}
	
	

	public Electrodomestico(String marca, double potencia) {
		this.marca = marca;
		this.potencia = potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	
	@Override
	public String toString() {
		return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "]";
	}
	
	
	
	public double getConsumo(int horas,int opcion) {

		double resultado=0;
		String element=null;
		
		if (opcion==1) { 
			element="Frigorifico";
			resultado=horas*0.350;       
		}else if(opcion==2) {
			element="Vitroceramica";
			resultado=horas*2.000;
		}else if (opcion==3) {
			element="Microondas";
			resultado=horas*1.500;
	    }else if(opcion==4){
	    	element="Lavadora";
	    	resultado=horas*2.200;
	    	
	    }
		System.out.println("Usar el/la "+element+" "+horas+" horas, consume "+resultado+" kw");
		return resultado;
				
		
			
		}
	
	

	
}
