package pokemons;

public class Charmander extends Pokemon {

	private int alturaLLama;

	
	public Charmander(int edad, String nombre, int alturaLLama) {
		super(edad, nombre);
		setAlturaLLama(alturaLLama);
	}
	
	
	public int getAlturaLLama() {
		return alturaLLama;
	}
	public void setAlturaLLama(int alturaLLama) {
		if(alturaLLama<10) {
			this.alturaLLama = 10;
		}
		else this.alturaLLama = alturaLLama;
	}


	@Override
	public String toString() {
		return "Charmander [{" + alturaLLama + "} (" + getEdad() + ") " + getNombre()
				+ "]";
	}


	@Override
	public String evolucion() {
		return "Charmeleon";
	}
	
	
	
	
	
	
	
	
}
