import java.util.ArrayList;

public class Constans {
    // Final primitive variable
    public static final double PI = 3.14159;

    // Final reference - the reference cannot change, but the object can be modified
    public final ArrayList<String> LIST = new ArrayList<>();

    // Final parameter
    public void process(final int value) {
//         value = 10;  // Error: cannot reassign final parameter
    }

    // Final local variable
    public void method() {
        final int localVar = 10;
//         localVar = 20;  // Error: cannot reassign final variable
    }

    public static void main(String[] args) {
        Constans c = new Constans();
        // c.PI = 3.14;  // Error: cannot reassign final variable
        c.LIST.add("A");
        c.LIST.add("B");
        System.out.println(c.LIST);  // Output: [A, B]

        c.process(10);
        c.method();

        System.out.printf("Value of PI: %.5f\n", Constans.PI);

        // Local final variable
//        final int x = 100;
        // x = 200;  // Error: cannot reassign final variable

    }
}
