package handson4;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void showTypes() {
        System.out.println(first.getClass().getName() + " & " + second.getClass().getName());
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Satu");
        p1.showTypes();

        Pair<Double, Boolean> p2 = new Pair<>(3.14, true);
        p2.showTypes();
    }
}