package com.tienda.videojuegos.service;

import com.tienda.videojuegos.model.Videojuego;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideojuegoService {

    private final List<Videojuego> juegos = List.of(
        new Videojuego("The Legend of Zelda", "Embárcate en una aventura épica para salvar el reino de Hyrule y derrotar a Ganon.", "/img/zelda.png"),
        new Videojuego("God of War", "Acompaña a Kratos en su viaje por la mitología nórdica enfrentando dioses y monstruos.", "/img/godofwar.png"),
        new Videojuego("Minecraft", "Explora mundos infinitos, construye estructuras increíbles y sobrevive a la oscuridad.", "/img/minecraft.png"),
        new Videojuego("FIFA 23", "Vive la emoción del fútbol con los mejores equipos, estadios y modos de juego.", "/img/fifa.png")
    );

    public List<Videojuego> obtenerVideojuegos() {
        return juegos;
    }

    public List<Videojuego> buscarVideojuegos(String q) {
        String query = q.toLowerCase();
        return juegos.stream()
                .filter(v -> v.getTitulo().toLowerCase().contains(query) ||
                             v.getDescripcion().toLowerCase().contains(query))
                .collect(Collectors.toList());
    }
}
