package service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import model.Producto;
import repository.ProductoRepository;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository repositorio;

    public List<Producto> obtenerTodos() {
        return repositorio.findAll();
    }

    public Producto agregarProducto(Producto producto) {
        return repositorio.save(producto);
    }

    public void eliminarProducto(String nombre) {
        repositorio.deleteByName(nombre);
    }
}
