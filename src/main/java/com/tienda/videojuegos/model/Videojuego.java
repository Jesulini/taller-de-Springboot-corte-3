package com.tienda.videojuegos.model;

public class Videojuego {
    private String titulo;
    private String descripcion;
    private String imagenUrl;

    public Videojuego(String titulo, String descripcion, String imagenUrl) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }
}
