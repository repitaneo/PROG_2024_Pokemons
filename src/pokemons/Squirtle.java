package pokemons;

import acuatico.Agua;

public class Squirtle extends Pokemon
	implements Agua {

	private int caparazon;

	
	
	
	public Squirtle(int edad, String nombre, int caparazon) {
		super(edad, nombre);
		setCaparazon(caparazon);
	}
	
	
	
	
	public int getCaparazon() {
		return caparazon;
	}
	public void setCaparazon(int caparazon) {
		if(caparazon<25) {
			this.caparazon = 25;
		}
		else this.caparazon = caparazon;
	}




	@Override
	public String toString() {
		return "Squirtel [{" + caparazon + "} (" + getEdad() + ") " + getNombre() + "] ";
	}




	@Override
	public String evolucion() {
		return "Wartortle";
	}




	@Override
	public float chorro(int salinidad) {
		return salinidad/2*getEdad();
	}
	
	
	
}
