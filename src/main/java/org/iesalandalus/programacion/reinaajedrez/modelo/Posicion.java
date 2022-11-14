package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private int fila;
	private char columna;
	
	
	public Posicion(int fila, char columna) {
		
		this.setFila(fila);
		this.setColumna(columna);
		
		
	}
	
	public Posicion(Posicion posicion) {
		this.setFila(posicion.getFila());
		this.setColumna(posicion.getColumna());
	}
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		
		if(fila >= 1 && fila <= 8) {
		this.fila = fila;
		}
		else {
		   throw new IllegalArgumentException("la fila es incorrecta");
		}
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if(columna >= 'a' && columna <= 'h' ) {
			this.columna = columna;
		}
		else {
			throw new IllegalArgumentException("la columna es incorrecta");
		}
	}
	
	
	
}
