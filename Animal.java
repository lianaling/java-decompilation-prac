
public class Animal {
	
	int age;
	String type;
	String name;
    String color;
    
    public Animal() {};
  
    public Animal(String n,  int ag, String colour, String type)
    {
    	this.age = ag;
    	this.name = n;
    	this.color = colour;
    	this.type = type;
    	
    }
    void asSleep(){
        System.out.println("Want to sleep.");
    }
    void panic(){
        System.out.println("Looking for cover");
    }
    void hungry(){
        System.out.println("Need food.");
    }

   int getAge()
   {
	   return this.age;
	   
   }
   
   void setType(String t)
   {
	   this.type = t;
	   
	   
   }
   
   String getType()
   {
	   return this.type;
	   
   }
   String getName()
  {
	   
	return this.name;   
	   
  }
    
    
}
