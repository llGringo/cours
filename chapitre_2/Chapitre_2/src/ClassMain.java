
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

		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis());

		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");

		System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println(" v2 = "+v2.getNom()+" ville de "+v2.getNbreHabitants()+" habitants se situant en "+v2.getPays()+"\n\n");

		// comparaison

		Ville V = new Ville("Lyon", 654, "France");
		Ville V2 = new Ville("Lille", 123, "France");

		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis());

		// System.out.println(V.comparer(V2));

		//System.out.println(V.decrisToi());

		v1.setNom("Marseille");
		v1.setNbreHabitants(1236);
		v1.setNomPays("France");

		v2.setNom("Rio");
		v2.setNbreHabitants(321654);
		v2.setNomPays("Bresil");

		System.out.println("\n\n" + v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi() + "\n\n");
		System.out.println(v1.comparer(v2));

		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis());

		// test heritage 

		Capitale cap = new Capitale("Paris", 654987, "France", "la tour Eiffel");
		System.out.println("\n" + cap.decrisToi());

	}// Fin m�thode main
}// Fin classe ClassMain
