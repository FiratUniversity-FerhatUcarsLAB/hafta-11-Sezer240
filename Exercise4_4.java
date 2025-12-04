public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        //program hata vermedi, çalıştı ama hiçbir çıktı vermedi
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
        //java compile hatası verdi
        /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The operator + is undefined for the argument type(s) void, int
        at Exercise4_4.main(public class Exercise4_4.java:18)  
        bu hata kodunda da derleme problemi oluştu, void ve int toplanamaz diyor*/
    }
} 
