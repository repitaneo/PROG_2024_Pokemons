package main;

import pokemons.*;



public class Start {

	public static void main(String[] args) {

		Pikachu pika = new Pikachu(12,"PikaPika",12323);
		Charmander charman = new Charmander(23,"Charman",34);
		Squirtle squirtle = new Squirtle(31,"Tortuguita",77);

		Pokemon pokemons[] = new Pokemon[3];
		pokemons[0] = pika;
		pokemons[1] = charman;
		pokemons[2] = squirtle;

		for (int i=0;i<pokemons.length;i++) {
			
			System.out.println(i);
			System.out.println(pokemons[i]);
			System.out.println(pokemons[i].evolucion());
		}
		
		
		
		
		
	}

}
