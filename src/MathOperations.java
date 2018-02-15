import java.util.Scanner;

/**
 * 
 * @author erickrojasperez
 * Programa que realiza operaciones aritmeticas
 */

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		double number1;
		double number2;
		double suma;
		double resta;
		double multiplicacion;
		double division;
		double residuo;
		
		//*** OPERACIONES ARITMETICAS ***
		
		System.out.println("Introduzca el primer numero a evaluar: ");
		number1 = input.nextDouble();
		
		System.out.println("Introduzca el segundo numero a evaluar: \t");
		number2 = input.nextDouble();
		
		suma = number1 + number2;
		resta = number1 - number2;
		multiplicacion = number1 * number2;
		division = number1 / number2;
		residuo = number1 % number2;
		
		System.out.println("El resultado de la Suma es: " + suma);
		System.out.println("El resulato de la Resta es: " + resta);
		System.out.println("El resultado de la Multiplicación es: " + multiplicacion);
		System.out.println("El resultado de la Division es: " + division);
		System.out.println("El resultado del Residuo es: " + residuo);
		
	}

}
