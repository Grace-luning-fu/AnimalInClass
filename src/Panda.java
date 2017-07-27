public class Panda extends Animal {

	public Panda ()
	{
	super();
	System.out.println("Now I am a Panda!");
	}

	@Override
	public String sleep() {
		return "A Panda sleeps...";
	}

	@Override
	public String eat() {
		return "A Panda eats...";
	}

	public String climb(){
		return "A Panda climbs up bamboos...";
	}
	
	public String follow(){
		return "A Panda likes to follow and hug people...";
	}

}
