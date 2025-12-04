public class Exercise4_3 {

    public static void zoop() { //4
        baffle(); //5
        System.out.print("You wugga "); //11
        baffle(); //12
    }

    public static void main(String[] args) { //1
        System.out.print("No, I "); //2
        zoop(); //3
        System.out.print("I "); //18
        baffle(); //19
    }

    public static void baffle() { //6, 13, 20
        System.out.print("wug"); //7, 14, 21
        ping(); //8, 15, 22
    }

    public static void ping() { //9, 16, 23
        System.out.println("."); //10, 17, 24
    }
}

/*programın çıktısı
No, I wug.
You wugga wug.
I wug.*/
