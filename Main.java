public class Main
{
    public static void main(String[] args)
	{

		// Making cakes using interface and abstract methods
		// by creating objects here in main() method

		// Custom dimensional to both cakes are passed
		// as in arguments

		// 1. Pineapple cake
		 PineappleCake pineappleCake = new PineappleCake("vanilla", 7, 3);

		// Calling the bake() to
		// bake pineapple cake
		pineappleCake.bake();

		// 2. Chocolate cake
		ChocolateCake chocolateCake = new ChocolateCake("chocolate", 5, 2);

		// Calling the bake() to
		// bake chocolate cake
		chocolateCake.bake();
	}
}