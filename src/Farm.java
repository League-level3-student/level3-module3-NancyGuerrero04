import java.util.ArrayList;

public class Farm extends Animal{
public static void main(String[] args) {
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	Cow cow = new Cow(); 
	Pig pig = new Pig();
	Doggo doggo = new Doggo(); 
	Chicken chicken = new Chicken(); 
	Sheep sheep = new Sheep();
	Horse horse = new Horse();
	
	animalList.add(cow);
	animalList.add(pig);
	animalList.add(doggo);
	animalList.add(chicken);
	animalList.add(sheep);
	animalList.add(horse);
	
	for (int i = 0; i < animalList.size(); i++) {
		Animal animal = animalList.get(i);
		animal.makeNoise();
		animal.personality();
		
		
	}

}
}