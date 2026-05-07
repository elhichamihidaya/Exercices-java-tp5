package partie3;
interface Calcul<T> {
    T addition(T a, T b);
}
public class Exercice3 {
    static class CalculInteger implements Calcul<Integer> {
        public Integer addition(Integer a, Integer b) {
            return a + b;
        }
    }
    static class CalculDouble implements Calcul<Double> {
        public Double addition(Double a,Double b) {
            return a + b;
        }
    }
    public static void main(String[] args) {
        CalculInteger c1 =new CalculInteger();
        System.out.println(c1.addition(4, 5));
        CalculDouble c2 =new CalculDouble();
        System.out.println(c2.addition(7.8, 10.9));
    }
}