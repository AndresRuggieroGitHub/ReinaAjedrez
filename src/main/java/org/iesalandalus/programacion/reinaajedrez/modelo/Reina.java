package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	public Color color;
	public Posicion posicion;
	
	
	public Reina(){
		color = color.BLANCO;
		posicion = new Posicion(1, 'd');
	
	}

	
	
	public Reina(Color color, Posicion posicion){
		
		this.color = color;
		this.posicion = posicion;
		
		
	}
	
	
	public Color getColor() {
		return color;
	}
	
	
	private void setColor(Color color) {
		if (posicion == null) {
			throw new NullPointerException ("ERROR: No es posible copiar una posición nula.");
				
		}
		
		this.color = color;
	}
	
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException ("ERROR: No es posible copiar un color nulo.");
				
		}
		
		this.posicion = posicion;
	}
	
	
	
	
}
