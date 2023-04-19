package curso_java;

import java.util.Scanner;

public class lesson11 {
    public static void main(String[] args){
        int i, numero, total = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o número");
        numero = teclado.nextInt();

        for(i = 1; i <= 10; i++){
            total = numero * i;
            System.out.println("Número: "+numero+" x "+ i +" = "+total);
        }
    }
}
