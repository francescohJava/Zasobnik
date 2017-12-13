
public class VyjimkaPlnyZasobnik extends Exception
{
	int velikost;
	
	VyjimkaPlnyZasobnik(int i)
	{
		velikost = i;
	}

	public String toString()
	{
		return "\nPlny zasobnik, zasobnik ma velikost: " + velikost;
	}
}
