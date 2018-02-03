
public class AnimalsClient {
	public static void main(String[] args) {
		Mammals newMammals = new Mammals();
		Fish newFish = new Fish();
		Birds newBirds = new Birds();
		
		newMammals.getFood();
		newMammals.getOffsprings();
		newMammals.run();
		newMammals.getDiet();
		newMammals.getSpecies();
		newMammals.getExample();
		System.out.println("");
		
		newFish.camo();
		
		newBirds.migrate();
	}
}
