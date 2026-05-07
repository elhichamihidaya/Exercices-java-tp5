package partie1;

public class Exercice10 {
	static class CompException {
		public static void verifierAge(int age) throws Exception {
			if (age < 18) {
				throw new Exception("Age inferieur a 18");
			}
			System.out.println("Age valide");
		}
	}
	static class CompRuntimeException{
		public static void verifierAge(int age) {
			if (age < 18) {
				throw new RuntimeException("Age inferieur a 18");
			}
			System.out.println("Age valide");
		}
	}
	public static void main(String[] args){
		try {
			CompException.verifierAge(11);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			CompRuntimeException.verifierAge(8);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
