/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.practico02;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana Ulate
 */
public class CancionSpotify {
    private String idCancion;  // guarda el ID  de la canción en Spotify
    private String titulo;  // guarda el título de la canción
    private String autor;  // guarda el nombre del autor
    private String duracion;  // guarda la duración de la canción
    private int anioCreacion;  // guarda el año de creación de la canción

    // Constructor para inicializar los atributos de la canción al crear un objeto
    public CancionSpotify(String idCancion, String titulo, String autor, String duracion, int anioCreacion) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = anioCreacion;
    }

    // Métodos para acceder y modificar el ID de la canción
    public String getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(String idCancion) {
        this.idCancion = idCancion;
    }

    // Métodos para acceder y modificar el título de la canción
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos para acceder y modificar el autor de la canción
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Métodos para acceder y modificar la duración de la canción
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    // Métodos para acceder y modificar el año de creación de la canción
    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
}