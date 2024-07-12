class AbstractionEx1 extends Dog
{
	public static void main(String[] args) {
      
      Abstraction1 a = new Dog();
      
      a.Sound();

	}
}


abstract class Abstraction1
{
	public abstract void Sound();

}

class Dog extends Abstraction1 {

	// @Override
	public void Sound()
	{
		System.out.println("Bow Bow");
	}
}

