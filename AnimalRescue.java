
public class AnimalRescue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalRescueCompany comp = new AnimalRescueCompany("JoinRescue");
		Animal cat = new Animal("brave", 1, "Mixed", "cat");
		Hamster hm = new Hamster ( "Brown", 1, "brown", "hamster");
		cat.panic();
		cat.hungry();
	
		hm.play();
				
		Feeder feed1 = new Feeder("John", "Help Animal");
		
		Feeder feed2 = new Feeder("Alice", "Shelter Animal");
		
		feed1.displayAdoptAnimal(cat);
		System.out.println("Feeder 1 aqddopted " + feed1.displayAdoptAnimal(cat));
		
		
		comp.employFeeder(feed1);
		comp.employFeeder(feed2);

		comp.displayFeeders();
		
		
		
	}

}
