package handson5;

public class CompareUtil {
    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5, 5));
        System.out.println(isEqual("Hello", "World"));
        System.out.println(isEqual(3.14, 3.14));

        // Test case tambahan Double & Character
        System.out.println(isEqual(9.81, 9.81));
        System.out.println(isEqual('A', 'A'));
    }
}