package partie2;

class AuthentificationException extends Exception {
    public AuthentificationException(String message) {
        super(message);
    }
}
public class Exercice5 {
    static class Login {
        public void login(String username,String password) throws AuthentificationException {
            if (!username.equals("admin") || !password.equals("1234")) {
                throw new AuthentificationException("Identifiants incorrects");
            }
            System.out.println("Connexion réussie");
        }
    }
    public static void main(String[] args) {
        Login l = new Login();
        try {
            l.login("user", "0000");
        } catch (AuthentificationException e) {
            System.out.println(e.getMessage());
        }
    }
}