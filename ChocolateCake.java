public class ChocolateCake {
    private String base;
	private int size;
	private float weight;

	// Constructor
	// To set the dimension to chocolate cake
	public ChocolateCake(String base, int size,
						float weight)
	{

		this.base = base;
		this.size = size;
		this.weight = weight;
	}

	// @Override
	// Method 1
	// To add cream to chocolate cake
	public void addCream()
	{
		System.out.println("Adding chocolate cream");
	}

	// @Override
	// Method 3
	// To bake the chocolate cake
	public void bake()
	{

		// Printing the base of the cake
		System.out.println("Baking cake with base as "
						+ this.base);

		// Calling the methods
		addCream();
		decorateCake();

		// Printing the dimension of the chocolate cake
		System.out.println("Chocolate cake with "
						+ this.size
						+ " inches and weight:"
						+ this.weight + " kg is ready");
	}

	// @Override
	// Method 2
	// To decorate the chocolate cake
	public void decorateCake()
	{

		// Print statement only
		System.out.println(
			"Cake decoration with choco chips");
	}
    
}
