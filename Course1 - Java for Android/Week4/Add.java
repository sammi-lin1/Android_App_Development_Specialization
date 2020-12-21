package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    private int num1 = 0;
    private int num2 = 0;

    //constructor
    public Add(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    //prints out result
    public String toString() {
        return String.valueOf(num1 + num2);
    }
}
