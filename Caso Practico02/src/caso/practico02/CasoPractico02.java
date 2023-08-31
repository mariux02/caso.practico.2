/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.practico02;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Mariana Ulate
 */
public class CasoPractico02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID de la canción: ");
        String idCancion = scanner.nextLine();

        System.out.print("Ingrese el título de la canción: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor de la canción: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese la duración de la canción: ");
        String duracion = scanner.nextLine();

        System.out.print("Ingrese el año de creación de la canción: ");
        int anioCreacion = scanner.nextInt();

        // Se crea un objeto de la clase CancionSpotify utilizando los valores ingresados por el usuario
        CancionSpotify cancion = new CancionSpotify(idCancion, titulo, autor, duracion, anioCreacion);

        // Mostrar la información de la canción ingresada por el usuario
        System.out.println("\nInformación de la canción:");
        System.out.println("ID de la canción: " + cancion.getIdCancion());
        System.out.println("Título: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
        System.out.println("Duración: " + cancion.getDuracion());
        System.out.println("Año de creación: " + cancion.getAnioCreacion());

        scanner.close();
    }
}

