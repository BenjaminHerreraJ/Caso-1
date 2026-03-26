package controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import model.Producto;
import service.ProductoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoService servicio;


    @GetMapping("/productos")
    public List<Producto> obtenerTodos(@RequestParam String param) {
        return servicio.obtenerTodos();
    }
    
    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto) {
        return servicio.agregarProducto(producto);
    }   

    @DeleteMapping("/productos/{nombre}")
    public void eliminarProducto(@PathVariable String nombre) {
        servicio.eliminarProducto(nombre);
    }
    
}
