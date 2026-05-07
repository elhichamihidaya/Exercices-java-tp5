package partie3;

public class Exercice6 {
    public static <T> void afficherTableau(T[] tableau) {
        for (T element : tableau) {
            System.out.println(element);
        }
    }
    public static <T> T getPremier(T[] tableau) {
        return tableau[0];
    }
    public static void main(String[] args) {
        Integer[] tab = {0, 4, 3, 9};
        afficherTableau(tab);
        System.out.println("Premier : "+ getPremier(tab));
    }
}
