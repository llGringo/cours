
public class Ville {
	private String nomVille;
	private String nomPays;
	private int nbreHabitants;

	public Ville(){
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}


	//Constructeur avec parametres
	public Ville(String pNom, int pNbre, String pPays)
	{
		System.out.println("Creation d'une ville avec des parametres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;

	}

	// *************************Accesseurs*****************
	public String getNom(){
		return nomVille;
	}

	public String getPays(){
		return nomPays;
	}

	public int getNbreHabitants(){
		return nbreHabitants;
	}


	//*************************Mutateurs********************
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}

	public void setNomPays(String pPays)
	{
		nomPays = pPays;
	}

	public void setNbreHabitants(int nbre)
	{
		nbreHabitants = nbre;
	}
}
