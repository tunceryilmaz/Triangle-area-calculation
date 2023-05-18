import java.util.Scanner;
        public class Main {

            public static void main(String[]args){
            Scanner input =new Scanner(System.in);
            int a,b;
            double u,c,Cevre,Alan;

                System.out.print("birinci dik kenarını gir:" );
                a = input.nextInt();
                System.out.print("ikinci dik kenarını gir:" );
                b = input.nextInt();
                c = Math.sqrt(a*a + b*b);
                System.out.println("hipotenüs:"+ c);

                u= (a+b+c)/2;
                Cevre=2*u;
                Alan=Math.sqrt(u* ((u - a)* (u - b) * (u - c)));
                System.out.println("ÇEVRE UZUNLUĞU :"+Cevre);
                System.out.println("ALAN :"+Alan);

            }
}