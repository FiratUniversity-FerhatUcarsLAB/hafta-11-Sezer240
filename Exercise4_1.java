import java.util.Scanner;
 public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       System.out.print("Lutfen gunu giriniz(Carsamba, Cumartesi vb.): ");
       String day=input.next();
       System.out.print("Lutfen ayin kaçinci gunu oldugunu giriniz(16,24 vb): ");
       int date=input.nextInt();
       System.out.print("Lutfen hangi ayda oldugunuzu giriniz(Mayis, Aralik vb.): ");
       String month=input.next();
       System.out.print("Lutfen hangi yilda oldugunuzu giriniz: ");
       int year=input.nextInt();

        
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);

        input.close();
    }
} 
