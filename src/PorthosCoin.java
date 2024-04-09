public class PorthosCoin extends Cryptomonnaie
{
    public PorthosCoin()
	{
        super("PTH", 1000);
    }

	public double getValeurDeJeton()
	{
		return 1000;
	}

	public String getNom()
	{
		return "PTH";
	}

	public String toString()
	{
		return "PorthosCoin";
	}
	
}