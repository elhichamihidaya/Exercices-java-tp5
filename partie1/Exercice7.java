package partie1;

public class Exercice7 {
	static class Calcul{
		public static void C() {
			throw new ArithmeticException("Erreur dans C");
		}
		public static void B() {
			C();
		}
		public static void A() {
			try {
				B();
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		Calcul.A();
	}
}
