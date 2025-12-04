public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a*b+c;
    }

    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + 
            multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4)));
        System.out.println("log(10) + log(20) = " + 
            multadd(1.0, Math.log(10), Math.log(20)));
        System.out.println("expSum(4.2) sonucu: " + expSum(4.2));
    }
} 
