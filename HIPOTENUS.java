import java.util.Scanner ;
public class HIPOTENUS {
    public static void main(String[] args) {
        int  a, b ;
        double c;
        Scanner giriş = new Scanner (System.in) ;
        System.out.print("Kısa kenar uzunluğunu giriniz :" );
        a = giriş.nextInt() ;
        System.out.print("Dik kenar uzunluğunu giriniz :" ) ;
        b = giriş.nextInt() ;
        c = Math.sqrt((a*a) + (b*b)) ;
        System.out.println("Hipotenüs uzunluğu değeriniz : " + c) ;
    }
}