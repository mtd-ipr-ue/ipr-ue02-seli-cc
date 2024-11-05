import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Type in a month (1-12)");
        int month = In.readInt();

        Out.println("Type in a year");
        int year = In.readInt();

        int daysmonth = 0;

        if (month < 1 || month > 12) {
            Out.println("Invalid month!! >:((");
        } else {

            boolean leapyear = (year % 4 == 0 || year % 400 == 0);
            
            
            

            switch (month) {
                case 1: 
                case 3:
                case 5: 
                case 7: 
                case 8: 
                case 10: 
                case 12: 

               daysmonth = 31;
                break;

                case 4: 
                case 6: 
                case 9: 
                case 11:


                daysmonth = 30;
                break;

                case 2:
                if (leapyear) {
                    daysmonth = 29;
                
                } else {
                    daysmonth = 28;

                }

                break;
            }
        }

        
                Out.println("The month has " +  daysmonth  + " days!");
    }

}
