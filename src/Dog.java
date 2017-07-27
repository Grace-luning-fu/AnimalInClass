
/*
* All Dogs are Animals but all Animals are not Dogs
*/


public class Dog extends Animal {
	
	public Dog()
	{
	super();
	System.out.println("Now I am a Dog!");
	}

	@Override
	public String sleep() {
		return "A Dog sleeps...";
	}

	@Override
	public String eat() {
		return "A Dog eats...";
	}

	public String fetch(){
		return "A dog fetches balls...";
	}
	
	public String play(){
		return "A dog plays with cats...";
	}


}
