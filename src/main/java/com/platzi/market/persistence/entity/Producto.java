package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_producto")
    private Long idProducto;

    @Getter @Setter
    private String nombre;

    @Getter @Setter @Column(name = "codigo_barras")
    private String codigoBarra;

    @Getter @Setter @Column(name = "precio_venta")
    private Float precioVenta;

    @Getter @Setter @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    @Getter @Setter
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> comprasProductos;

}
