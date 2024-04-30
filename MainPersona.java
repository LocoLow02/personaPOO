import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Persona th = new Persona();
        
        Scanner p1 = new Scanner(System.in);
        System.out.println("ingresa tu nombre:");
        th.setNombre(p1.next());
        System.out.println("Escribe tu apellido");
        th.setApellido(p1.next());
        System.out.println("ingresa tu edad");
        th.setEdad(p1.nextInt());
        System.out.println("Escribe tu altura");
        th.setAltura(p1.nextDouble());
        System.out.println(th.toString());

        th.getNombre();
        th.getApellido();
        th.getEdad();
        th.getAltura();
        
        Persona ht=new Persona();
        
        Scanner p2 = new Scanner(System.in);
        System.out.println("Persona 2: ingresa tu nombre:");
        ht.setNombre(p2.nextLine());
        System.out.println("Escribe tu apellido");
        ht.setApellido(p2.next());
        System.out.println("ingresa tu edad");
        ht.setEdad(p2.nextInt());
        System.out.println("Escribe tu altura");
        ht.setAltura(p2.nextDouble());
        System.out.println(ht.toString());

        ht.getNombre();
        ht.getApellido();
        ht.getEdad();
        ht.getAltura();
    }
}