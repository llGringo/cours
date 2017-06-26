
public class ClassMain {

	public static void main(String[] args){

		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 123456, "France");
		Ville v2 = new Ville("Rio", 321654, "Bresil");

		System.out.println("\n v = "+v.getNom()+" ville de "+v.getNbreHabitants()+" habitants se situant en "+v.getPays());
		System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println(" v2 = "+v2.getNom()+" ville de "+v2.getNbreHabitants()+" habitants se situant en "+v2.getPays()+"\n\n");

		// interchanger Villes v1 et v2

		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;

		System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println(" v2 = "+v2.getNom()+" ville de "+v2.getNbreHabitants()+" habitants se situant en "+v2.getPays()+"\n\n");

		// changer noms des villes avec les mutateurs

		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");

		System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println(" v2 = "+v2.getNom()+" ville de "+v2.getNbreHabitants()+" habitants se situant en "+v2.getPays()+"\n\n");

	}// Fin méthode main
}// Fin classe ClassMain
