import java.util.ArrayList;

public class  PorthosCoin 
{
	private ArrayList<Portefeuille> portefeuilles;
    private static CryptoMarche porthosCoin;

	private PorthosCoin()
	{
        portefeuilles = new ArrayList<Portefeuille>();
    }

	public static CryptoMarche getInstance()
	{
		if (marche == null)
		{
			marche = new CryptoMarche();
		}
		return marche;
	}

	public void ajouter(Portefeuille p)
	{
		portefeuilles.add(p);
	}
}
