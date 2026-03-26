package repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.Producto;

@Repository
public class ProductoRepository {
    private List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> findAll() {
        return listaProductos;
    }
    
    public Producto findByName(String nombre) {
        for(Producto producto : listaProductos) {
            if(producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public Producto save(Producto producto) {
        listaProductos.add(producto);
        return producto;
    }

    public void deleteByName(String nombre) {
        Producto productoBD = findByName(nombre);
        if (productoBD != null) {
            listaProductos.remove(productoBD);
        }
    }
}
