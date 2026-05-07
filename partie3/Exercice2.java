package partie3;

public class Exercice2 {
    static class Paire<T, U> {
        T premier;
        U second;
        public Paire(T premier, U second) {
            this.premier = premier;
            this.second = second;
        }

        public void afficherPaire() {
            System.out.println("Premier : " + premier);
            System.out.println("Second : " + second);
        }
    }

    public static void main(String[] args) {

        Paire<String, Integer> p =new Paire<>("Age", 20);
        p.afficherPaire();
    }
}