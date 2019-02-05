import java.util.Scanner;
public class LocalDate {
    public static void main(String[] args){



        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the current day");
        int day = reader.nextInt();



        int month = reader.nextInt();
        System.out.println("Enter the current month in number form");
        if (month == 1){
            System.out.println("The month is january");
        }
        else if (month == 2){
            System.out.println("The month is february");
            }
            else if (month == 3){
            System.out.println("The month is March");
        }
        else if (month == 4){
            System.out.println("The month is April");
        }
    }

}





