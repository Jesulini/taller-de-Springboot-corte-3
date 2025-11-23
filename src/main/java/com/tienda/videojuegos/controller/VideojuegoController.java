package com.tienda.videojuegos.controller;

import com.tienda.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VideojuegoController {

    private final VideojuegoService servicio;

    public VideojuegoController(VideojuegoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("videojuegos", servicio.obtenerVideojuegos());
        return "index";
    }

    @GetMapping("/catalogo")
    public String catalogo(@RequestParam(required = false) String q, Model model) {
        if (q != null && !q.isEmpty()) {
            model.addAttribute("videojuegos", servicio.buscarVideojuegos(q));
            model.addAttribute("query", q);
        } else {
            model.addAttribute("videojuegos", servicio.obtenerVideojuegos());
        }
        return "catalogo";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
}
