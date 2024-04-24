import java.util.Scanner;
public class MainPersona {
public static void main(String[] args) {
Scanner p1 = new Scanner(System.in);
System.out.println("ingresa tu nombre:");
String nombre=p1.next();
System.out.println("Escribe tu apellido");
String apellido=p1.next();
System.out.println("ingresa tu edad");
int edad=p1.nextInt();
System.out.println("Escribe tu altura");
double altura=p1.nextDouble();

Persona th = new Persona ();
th.nombre=nombre;
th.apellido=apellido;
th.edad=edad;
th.altura=altura;

th.mostrarNombre();
th.mostrarApellido();
th.mostrarEdad();
th.mostrarAltura();
    }
}