package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.Electrodomestico;



public class Controller {
	
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion,horas;
		
		System.out.println("De que electrodomestico quiere calcular el consumo?");
		System.out.println("1.Frigo 2.Vitro 3.Micro 4.Lavadora");
		opcion=sc.nextInt();
		System.out.println("cuantas horas?");
		horas=sc.nextInt();
		
		

	
       Electrodomestico miElectrodomestico=new Electrodomestico("tipo", "marca",0.256);
     
      
      miElectrodomestico.getConsumo(horas, opcion);
      
      
       
     mostrarElectrodomestico();
      
   
     
     
	}

	
	static void mostrarElectrodomestico(){
		
		System.out.println("tipo de electrodomestico");
		String tipo=sc.next();
		
		System.out.println("marca de electrodomestico");
		String marca=sc.next();
		
		System.out.println("consumo en w de electrodomestico");
		double potencia=sc.nextDouble();
		
		Electrodomestico miElectrodomestico=new Electrodomestico(tipo, marca,potencia);
		
	   System.out.println(miElectrodomestico.toString());
		
	}
	
		
	}
    

