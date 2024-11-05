import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Enter a number");
        int first = In.readInt();

        Out.println("Enter another number");
        int sec = In.readInt();

        Out.println("Enter the last number");
        int third = In.readInt();

        int max = first;

        if (sec > max) {
             max = sec;
        }

        if (third > max) {
            max = third;
        }

        Out.println("The maximum is " + max);
        
    }
}
