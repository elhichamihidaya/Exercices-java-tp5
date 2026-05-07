package partie3;
import java.util.List;
import java.util.ArrayList;

public class Exercice11 {
    public static void afficherListe(List<?> liste) {
        for (Object obj : liste) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Java");
        liste.add("C");
        afficherListe(liste);
    }
}