package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private void Consola() {
		
	
		}
	
	public static void mostrarMenu() {
		System.out.println("1.Crear reina por defecto");
		System.out.println("2.Crear reina eligiendo el color");
		System.out.println("3.Mover");
		System.out.println("4.Salir");
		
		
	}
	
	public static int  elegirOpcionMenu() {
		int entrada;
		System.out.println("Elige una de las opciones del menu anterior: ");
	
		entrada = Entrada.entero();
			
		while(entrada < 1 || entrada >4) {
			System.out.println("Elige una opcion valida: ");
			entrada = Entrada.entero();
		}
		return entrada;
		
	}
	
	public static Color elegirColor() {
		int entrada;
		System.out.println("Elige un color para la Reina: ");
		entrada = Entrada.entero();
		
		System.out.print("1.Blanca");
		System.out.print("2.Negra");
		
		while(entrada < 1 || entrada > 2) {
			System.out.println("Elige una opcion valida: ");
			entrada = Entrada.entero();			
		}
		
		if(entrada == 1) {
			return Color.BLANCO;
			
		}else {
			return Color.NEGRO;
		}
		
		
	}
	
	public static void mostrarMenuDirecciones() {
		System.out.print("1.NORTE");
		System.out.print("2.NORESTE");
		System.out.print("3.ESTE");
		System.out.print("4.SURESTE");
		System.out.print("5.SUR");
		System.out.print("6.SUROESTE");
		System.out.print("7.OESTE");
		System.out.print("8.NOROESTE");
		
	}
	
	public static Direccion elegirDireccion() {
		int entrada;
		
		System.out.println("Elige una direccion del menu anterior");
		entrada = Entrada.entero();
		
		while(entrada < 1 || entrada >8) {
			System.out.println("Elige una opcion valida: ");
			entrada = Entrada.entero();
		}
		Direccion direccionElegida = null;
		
		switch(entrada) {
		
		case 1:
			
			direccionElegida = Direccion.NORTE;
				break;
				
		case 2:
			
			direccionElegida = Direccion.NORESTE;
				break;
				
		case 3:
			direccionElegida = Direccion.ESTE;
				break;
			
		case 4:
			direccionElegida = Direccion.SURESTE;
				break;			
		case 5:
			
			direccionElegida = Direccion.SUR;
				break;	
				
		case 6:
			direccionElegida = Direccion.SUROESTE;
			
		case 7:
			direccionElegida = Direccion.OESTE;
		
		case 8:
			direccionElegida = Direccion.NOROESTE;
		}			
		
		return direccionElegida;
		
	}
	
	public static int elegirPasos(){
		int entrada;
		System.out.println("Introduce el numero de pasos deseados: ");
		entrada = Entrada.entero();
		
		return entrada;
		
	}
	
	public static void despedirse() {
		System.out.println("Hasta luego Lucas.");
	
	
	}
	
	
	
}
