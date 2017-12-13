
public class Zasobnik
{
	int pole[];
	int vrchzas;
	
	Zasobnik(int velikost)
	{
		pole = new int[velikost];
		vrchzas = 0;
	}
	
	public void vloz(int i)	
	throws VyjimkaPlnyZasobnik
	{
		if(vrchzas == pole.length)
		{
			throw new VyjimkaPlnyZasobnik(pole.length);
		}
		pole[vrchzas++] = i;
	}

	public int vyjmi(int i)
	throws VyjimkaPrazdnyZasobnik
	{
		if(vrchzas == 0)
		{
			throw new VyjimkaPrazdnyZasobnik();
		}
		return pole[vrchzas--];
	}
	
}
