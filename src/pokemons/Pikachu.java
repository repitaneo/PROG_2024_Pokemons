package pokemons;

import electricos.Electrico;

public class Pikachu extends Pokemon 
	implements Electrico {

	private int velocidad;

	
	public Pikachu(int edad,String nombre,int velocidad) {
		
		super(edad,nombre);
		setVelocidad(velocidad);
	}
	
	
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		
		if(velocidad<100) {
			this.velocidad = 100;
		}
		else this.velocidad = velocidad;
	}


	@Override
	public String evolucion() {
		return "Raichu";
	}


	@Override
	public String toString() {
		return "Pikachu [{" + velocidad + "} (" + getEdad() + ") " + getNombre() + "]";
	}


	@Override
	public int rayo() {
		
		return (int)(2*velocidad/getEdad());
	}



	
	
	
	
	
	
	
	
	
}
