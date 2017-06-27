
public class Capitale extends Ville {
	private String monument;

	// constructeur par default
	public Capitale(){
		//mo cle appelle le constructeur de la classe mere
		super();
		monument = "aucun";
	}

	//Constructeur d'initialisation de Capitale
	public Capitale(String nom, int hab, String pays, String monument){
		super(nom, hab, pays);
		this.monument = monument;
	}


	//description d'une capitale

	/**
    	* Description d'une capitale
    	* @return String retourne la description de l'objet
  	*/

	public String decrisToi(){
		String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";
		System.out.println("Invocation de super.decrisToi()");

		return str;
	}

	//**********************accesseurs************************
	/**
    	* @return le nom du monument
  	*/
	public String getMonument(){
		return monument;
	}

	//*********************mutateurs***********************
	public void setMonument(String monument){
		this.monument = monument;
	}
}
