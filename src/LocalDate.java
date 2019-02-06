import java.util.Scanner;
public class LocalDate {
    public static void main(String[] args){



        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the current day");
        int dayTill = reader.nextInt();
        System.out.println("Enter the month you would like to know in number form");
        int month = reader.nextInt();
        if (month == 1){
            System.out.println("The month is january");
            System.out.println("The amount of days till january are:" + (31 - dayTill));
        }
        else if (month == 2){
            System.out.println("The month is february");
            System.out.println("The amount of days till february are:" + (28 -dayTill));
        }
            else if (month == 3){
            System.out.println("The month is March");
            System.out.println("The amount of days till march are:" + (31 - dayTill));
        }
        else if (month == 4){
            System.out.println("The month is April");
            System.out.println("The amount of days till april are:" + (30 - dayTill));
        }
        else if (month == 5){
            System.out.println("The month is may");
            System.out.println("The amount of days till may are:" + (31 - dayTill));
        }
        else if (month == 6){
            System.out.println("The month is june");
            System.out.println("The amount of days till june are:" + (30 - dayTill));
        }
        else if (month == 7){
            System.out.println("The month is july");
            System.out.println("The amount of days till july are:" + (31 - dayTill));
        }
        else if (month == 8){
            System.out.println("The month is august");
            System.out.println("The amount of days till august are:" + (31 - dayTill));
        }
        else if (month == 9){
            System.out.println("The month is september");
            System.out.println("The amount of days till september are:" + (30 - dayTill));
        }
        else if (month == 10){
            System.out.println("The month is october");
            System.out.println("The amount of days till october are:" + (30 - dayTill));
        }
        else if (month == 11){
            System.out.println("The month is november");
            System.out.println("The amount of days till november are:" + (30 - dayTill));
        }
        else if (month == 12){
            System.out.println("The month is december");
            System.out.println("The amount of days till december are:" + (31 - dayTill));
        }
        else {
            System.out.println("Goodbye");

        }

    }

}





