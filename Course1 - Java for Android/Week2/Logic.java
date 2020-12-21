package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        int half = -(size+1);
        int h = (2 * size) + 1;
        int w = (2 * size) + 2;

        for(int i = 1; i <= h; i++){                                    //draws outer box
            half++;
            for (int j = 1; j <= w; j++) {
                if((j == 1 || j == w) && (i == 1 || i == h) )
                    mOut.print("+");
                else if(!(j == 1 || j == w) && (i == 1 || i == h))
                    mOut.print("-");
                else if(!(i == 1 || i == h) && (j == 1 || j == w))
                    mOut.print("|");
                else {
                    drawDiamond(size, i, j, half);
                }
            }
            mOut.println();
        }
    }

    public void drawDiamond(int size, int i, int j, int half){          //draws diamond
        int length;
        if (half <= 0){
            length = i * 2 - 2;
        } else {
            length = 2 * (i - half * 2) - 2;
        }

        int top = 1;
        int bot = size * 2 + 1;
        int mid = 1 + size;
        int right = mid + (length/2);
        int left = mid - (length/2-1);

        if (j >= left && j <= right) {
            if (j == left || j == right) {
                if (i < mid && i > top) {
                    if (j == left) {
                        mOut.print("/");
                    } else {
                        mOut.print("\\");
                    }

                } else if (i == mid) {             //midpoint
                    if (j == left) {
                        mOut.print("<");
                    } else {
                        mOut.print(">");
                    }

                } else if (i > mid && i < bot) {
                    if (j == left) {
                        mOut.print("\\");
                    } else {
                        mOut.print("/");
                    }
                }
            } else {
                if (i % 2 == 0) {                //interchanges between "=" and "-"
                    mOut.print("=");             //based on whether line is even/odd
                } else {
                    mOut.print("-");
                }
            }
        } else {
            mOut.print(" ");
        }
    }

    // TODO -- add any helper methods here

    
}
