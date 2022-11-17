package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	public Color color;
	public Posicion posicion;
	
	public Reina(){
		color = color.BLANCO;
		posicion = new Posicion(1, 'd');
	
	}

	public Reina(Color color){
		this.color = color;
		if(color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		if(color.toString().equalsIgnoreCase("Blanco")) {
			this.posicion = new Posicion(1, 'd');
			
		}
		else {
			this.posicion = new Posicion(8	, 'd');
		}
	}
	
		
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		
		if (pasos < 1 || pasos >7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		
		String movimientoNoValido = "ERROR: Movimiento no válido (se sale del tablero).";
		
		switch (direccion) {
			case NORTE:
				try {
					
					setPosicion(new Posicion ( posicion.getFila()+ pasos, posicion.getColumna()));
					
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;		
				
			case NORESTE:
				try {
					setPosicion(new Posicion ( posicion.getFila()+ pasos, (char)(posicion.getColumna() + pasos)));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
					
			case ESTE:
				try {
					setPosicion(new Posicion ( posicion.getFila(), (char)(posicion.getColumna()+ pasos)));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;	
				
			case SURESTE:
				try {
					setPosicion(new Posicion ( posicion.getFila()- pasos, (char)(posicion.getColumna() + pasos)));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;	
						
			case SUR:
				try {
					setPosicion(new Posicion ( posicion.getFila()- pasos, posicion.getColumna()));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
		
			case SUROESTE:
				try {
					setPosicion(new Posicion ( posicion.getFila()- pasos, (char)(posicion.getColumna()- pasos)));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
				 		
			case OESTE:
				try {
					setPosicion(new Posicion ( posicion.getFila(), (char)(posicion.getColumna()-pasos)));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
				
			case NOROESTE:
				try {
					setPosicion(new Posicion ( posicion.getFila()+ pasos, (char)(posicion.getColumna()-pasos)));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
				
		}
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
			throw new NullPointerException ("ERROR: El color no puede ser nulo.");
				
		}
		
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion + ")";
	}
	
	
	
	
}
