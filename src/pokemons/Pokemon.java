package pokemons;

public abstract class Pokemon {

	private int edad;
	private String nombre;
	
	
	public Pokemon(int edad,String nombre) {
		
		this.nombre = nombre;
		setEdad(edad);
	}
	
	
	// a implementar en las clases derivadas
	public abstract String evolucion();
	
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		
		if(edad<=0) {
			this.edad = 1;
		}
		else this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	
	@Override
	public String toString() {
		return "Pokemon [(" + edad + ") " + nombre + "]";
	}
	
	
	
	
	
	
	
}
