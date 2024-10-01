public class PineappleCake {
    private String base;
	private int size;
	private float weight;

	// Constructor
	// To set the dimension to pineapple cake
	public PineappleCake(String base, int size,
						float weight)
	{

		this.base = base;
		this.size = size;
		this.weight = weight;
	}

	// @Override
	// Method 1
	// To add cream to pineapple cake
	public void addCream()
	{

		System.out.println("Adding white cream");
	}

	// @Override
	// Method 2
	// To decorate the pineapple cake
	public void decorateCake()
	{

		System.out.println(
			"Cake decoration with pineapple pieces");
	}


// @Override
// Method 3
// To bake the pineapple cake
public void bake()
{

	System.out.println("Baking cake with base as "
					+ this.base);
	addCream();
	decorateCake();

	System.out.println("Pineapple cake with " + this.size
					+ " inches and weight:" + this.weight
					+ " kg is ready");
}

}
