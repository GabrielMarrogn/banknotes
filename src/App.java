import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;
        int resto =0;
 
 
        int valor = sc.nextInt();
        sc.close();
 
        nota100 = valor / 100;
        resto = valor % 100;
 
        nota50 = resto / 50;
        resto = resto % 50;
 
        nota20 = resto / 20;
        resto = resto % 20;
 
        nota10 = resto / 10;
        resto = resto % 10;
 
        nota5 = resto / 5;
        resto = resto % 5;
 
        nota2 = resto / 2;
        resto = resto % 2;
 
        nota1 = resto / 1;
        resto = resto % 1;
        
        System.out.println(valor);
        System.out.println(nota100 +" nota(s) de R$ 100,00");
        System.out.println(nota50 +" nota(s) de R$ 50,00");
        System.out.println(nota20 +" nota(s) de R$ 20,00");
        System.out.println(nota10 +" nota(s) de R$ 10,00");
        System.out.println(nota5 +" nota(s) de R$ 5,00");
        System.out.println(nota2 +" nota(s) de R$ 2,00");
        System.out.println(nota1 +" nota(s) de R$ 1,00");
 
    }
}
