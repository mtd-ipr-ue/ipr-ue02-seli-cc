import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        
        Out.println("Enter a coordinate x");
        double x = In.readDouble();

        Out.println("Enter a coordinate y");
        double y = In.readDouble();

        double r = 4.0; 

        double distance = Math.pow(x, 2) + Math.pow(y, 2);

        if (distance <= r * r) {
            Out.println("The coordinate is in the green area :3");
           
        }  else {
            Out.println("The coordinate is NOT in the green area >:(");
    
        }
    }
}
