
public class Ville {
	
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;

	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;



	public Ville(){
		System.out.println("Cr�ation d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;
	}


	//Constructeur avec parametres
	public Ville(String pNom, int pNbre, String pPays)
	{
		System.out.println("Creation d'une ville avec des parametres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;

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

	public static int getNbreInstancesBis(){
		return nbreInstancesBis;
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
		this.setCategorie();
	}

	// Dedinir categorie de la ville
	protected void setCategorie(){

		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categorie[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

		int i = 0;
		while(i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;
		this.categorie = categorie[i];
	}

	// retourner description de la ville
	public String decrisToi(){
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants + " habitant(s) => elle est donc de categorie : " + this.categorie;
	}

	//retour de comparaison des villes
	public String comparer(Ville v1){
		String str = new String();

		if(v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNom() + " est une ville plus peuplee que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peuplee que " + v1.getNom();

		return str;
	}
}
