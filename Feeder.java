
public class Feeder  {

	Hamster hm = new Hamster();
	String feedername;
	String organization;
	
	public Feeder(String name, String company)
	{
		this.feedername = name;
		this.organization = company;
		
		
		
	}
	void feedHamster(Hamster h)
	{
		System.out.println("I am feeding "+ h.name);
	}
	
	String displayAdoptAnimal(Animal m)
	
	{
		String ms;
		ms = "Type is " +m.getType()+"\n" + "Age is "+ m.getAge();
		ms = ms + m.getName();
		return ms;
		
	}
	
	String getFeederInfo()
	{
		String n;
		
		n = "Name is : "+ feedername + "\nOrganization is :"+ organization;
		return n;
		
	}
	
}
