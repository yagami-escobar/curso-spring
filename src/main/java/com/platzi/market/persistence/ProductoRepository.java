package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    // GET Lista de Producto
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    // GET Lista de Productos por idCategoria
    public List<Producto> getByCategoria (Long idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    // GET Lista de Productos cuya Cantidad en Stock sea min y estado
    public Optional<List<Producto>> getEscasos(Long cantidad, boolean estado){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true)
    }

    // GET el Producto por idProducto
    public Optional<Producto> getProducto (Long idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    // SAVE Producto pasandole un Producto
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    // DELETE Producto Pasandole el idProducto
    public void delete(Long idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

}
