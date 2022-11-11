import java.util.Scanner;
public class {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner( System.in );
		int i, t[];
		 t = new int[10];
		 for (i=0;i<10;i++){
		 System.out.print("Introduzca numero: ");
		 t[i]=teclado.nextInt();
		 }
		 System.out.println("El resultado es:");
		 for (i=0;i<=4;i++){
		 System.out.println (t[i]); 
		 System.out.println(t[9-i]); 
		 }
	}
}