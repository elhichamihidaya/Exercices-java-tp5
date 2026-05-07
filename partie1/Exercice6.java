package partie1;

public class Exercice6 {
	static class Machine{
		String etat="OFF";
		public void demarrer() {
			if(etat.equals("ON")) {
				throw new IllegalStateException("la machine est deja demarree");
			}
			etat="ON";
			System.out.println("La machine est demarree");
		}
	}
	public static void main(String[] args) {
		Machine mach= new Machine();
		try {
			mach.demarrer();
			mach.demarrer();
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}
}
