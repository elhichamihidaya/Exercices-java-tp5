package partie3;
import java.util.List;
import java.util.ArrayList;

public class Exercice12 {
    public static void afficherNombres(List<? extends Number> liste) {
        for (Number n : liste) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        
        l1.add(9);
        l1.add(15);

        List<Double> l2 = new ArrayList<>();

        l2.add(1.2);
        l2.add(3.4);

        afficherNombres(l1);
        afficherNombres(l2);
    }
}