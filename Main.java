import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Preguntas pregunta = new Preguntas();
        Listas listas = new Listas();
        System.out.println("Bienvenido al programa de recomendaciones");

        System.out.println("Conteste las siguientes preguntas con honestidad para poder realizar \n un buen trabajo de recomendaciones ");
        pregunta.genero();
        String res1 = scan.nextLine();
        

        if (res1.equals("1")) {
            System.out.println("Le recomendamos leer " + listas.ficcion());
        }

        else if (res1.equals("2")) {
            System.out.println("Le recomendamos leer " + listas.drama());
        }
        else if(res1.equals("3")) {
            System.out.println("Le recomendamos leer " + listas.cocina());
        }

        else if (res1.equals("4")) {
            System.out.println("Le recomendamos leer " + listas.historia());
        }
         scan.close();
    }
}