
public class VytZasobnika
{

	public static void main(String[] args)
	{
		Zasobnik maleCisla = new Zasobnik(10);
		
		try
		{
			maleCisla.vloz(5);
			System.out.println(maleCisla.vyjmi());
		}
		catch(VyjimkaPlnyZasobnik vyj)
		{
			System.out.println(vyj);
		}
		catch(VyjimkaPrazdnyZasobnik vyj)
		{
			System.out.println(vyj);
		}

	}

}
