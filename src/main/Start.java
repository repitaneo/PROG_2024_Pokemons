package main;

import pokemons.*;



public class Start {

	public static void main(String[] args) {

		Pikachu pika = new Pikachu(12,"PikaPika",12323);
		System.out.println(pika.rayo());
		
		Charmander charman = new Charmander(23,"Charman",34);
		System.out.println(charman.llamarada());
		
		Squirtle squirtle = new Squirtle(31,"Tortuguita",77);
		System.out.println(squirtle.chorro(45));
		
		
		Pokemon pokemons[] = new Pokemon[3];
		pokemons[0] = pika;
		pokemons[1] = charman;
		pokemons[2] = squirtle;


		for (Pokemon p: pokemons) {
			
			System.out.println(p);
			System.out.println(p.evolucion());
			p.setEdad(p.getEdad()*2);
			System.out.println(p);
			System.out.println("---------------------");
		}
		
		
		
	}

}
