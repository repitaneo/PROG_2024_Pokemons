package pokemons;

public class Squirtle extends Pokemon {

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
		return "Squirtel [{" + caparazon + "} (" + getEdad() + ") " + getNombre() + "]";
	}




	@Override
	public String evolucion() {
		return "Wartortle";
	}
	
	
	
}
