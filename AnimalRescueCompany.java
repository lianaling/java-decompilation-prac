import java.util.ArrayList;

public class AnimalRescueCompany {

	String name;
	ArrayList feederlist = new ArrayList();
	
	public AnimalRescueCompany(String n)
	{
	 
	    this.name = n;
	}
			 
				
	void employFeeder(Feeder m)
	{
		
		feederlist.add(m);
				
	}
	
	void displayFeeders()
	{
		Feeder m;
		for(int n = 0; n < feederlist.size(); n++)
		{
			
		     m = (Feeder) feederlist.get(n);
		     System.out.println(m.getFeederInfo());
			
		}
			
		
	}
	
	
}
