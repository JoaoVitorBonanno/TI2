import java.util.*;
class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String args[]){
		int x, y, soma;
		
		System.out.println("Primeiro Numero: ");
		x = sc.nextInt();
		System.out.println("Segundo Numero: ");
		y = sc.nextInt();

		soma = x + y;

		System.out.println("A soma dos dois numeros eh:" + soma);
		}
}