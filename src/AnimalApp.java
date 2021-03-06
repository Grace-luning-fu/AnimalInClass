/*
 * This is the application, built on Dave's App. 
 */


public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		Dog d = new Dog();
		print(d.eat());
		print(d.sleep());
		print(d.fetch());
		print(d.play());
		
		Panda p = new Panda(); 
		print(p.eat());
		print(p.sleep());
		print(p.climb());
		print(p.follow());
		
		
	}
	private static void print(String s){
		System.out.println(s);
	}
}
