package partie3;

public class Exercice7 {
    public static <T extends Number>
    double somme(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static void main(String[] args) {
        System.out.println(somme(39, 22));
        System.out.println(somme(4.5, 6.7));
    }
}
