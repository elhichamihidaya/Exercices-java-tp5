package partie2;

class EmailInvalideException extends Exception {
    public EmailInvalideException(String message) {
        super(message);
    }
}
class AgeInvalideException extends Exception {
    public AgeInvalideException(String message) {
        super(message);
    }
}
public class Exercice4 {
    static class Utilisateur {
        public void inscrire(String email, int age)throws EmailInvalideException,AgeInvalideException {
            if (!email.contains("@")) {
                throw new EmailInvalideException("Email invalide");
            }
            if (age < 18) {
                throw new AgeInvalideException("Age invalide");
            }
            System.out.println("Inscription reussie");
        }
    }
    public static void main(String[] args) {
        Utilisateur u = new Utilisateur();
        try {
            u.inscrire("testgmail.com", 15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}