package numerodecimalembinario;

import java.util.Scanner;

public class Numerodecimalembinario {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int numero;

System.out.println("Digite algum numero: "); 

numero = ler.nextInt();

String Binario = Integer.toBinaryString (numero);

System.out.println("0 numero digitado em binario é: " +Binario);

String hex = Integer.toHexString(numero);

System.out.println("0 numero em hex eh: " + hex);
    }
}