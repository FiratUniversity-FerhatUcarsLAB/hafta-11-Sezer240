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
       if(day.equalsIgnoreCase("Pazartesi") ||
          day.equalsIgnoreCase("Sali") ||
          day.equalsIgnoreCase("Carsamba") ||
          day.equalsIgnoreCase("Persembe") ||
          day.equalsIgnoreCase("Cuma") ||
          day.equalsIgnoreCase("Cumartesi") ||
          day.equalsIgnoreCase("Pazar")){

            System.out.print("Lutfen ayin kaçinci gunu oldugunu giriniz(16,24 vb.): ");
            int date=input.nextInt();
            if(date >=1 && date <= 31){
            System.out.print("Lutfen hangi ayda oldugunuzu giriniz(Mayis, Aralik vb.): ");
            String month=input.next();
            if(month.equalsIgnoreCase("Ocak") ||
               month.equalsIgnoreCase("Subat") ||
               month.equalsIgnoreCase("Mart") ||
               month.equalsIgnoreCase("Nisan") ||
               month.equalsIgnoreCase("Mayis") ||
               month.equalsIgnoreCase("Haziran") ||
               month.equalsIgnoreCase("Temmuz") ||
               month.equalsIgnoreCase("Agustos") ||
               month.equalsIgnoreCase("Eylul") ||
               month.equalsIgnoreCase("Ekim") ||
               month.equalsIgnoreCase("Kasim") ||
               month.equalsIgnoreCase("Aralik")){

                System.out.print("Lutfen hangi yilda oldugunuzu giriniz: ");
                int year=input.nextInt();

                printAmerican(day, date, month, year);
                printEuropean(day, date, month, year);
            }else{
                System.out.println("Turkce karakter kullanmayin.");
            }
            }else{
                System.out.println("Ne zamandan beri bir ay 1-31 araliginin disinda :D");
            }
       }else{
        System.out.println("Turkce karakter kullanmayin.");
       } input.close();
    }
} 
