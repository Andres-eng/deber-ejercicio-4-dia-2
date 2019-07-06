import java.util.Scanner;
public class Main4{
	public static void main (String []args){
		float precio;
		String placa, nombre;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		nombre=lee.next();
		System.out.println("Ingrese la placa: ");
		placa=lee.next();
		System.out.println("Ingrese el precio: ");
		precio=lee.nextFloat();
		Carro obj= new Carro(precio, placa, nombre);
		obj.Impresion();
	}
}