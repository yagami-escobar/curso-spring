package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {


    @EmbeddedId @Getter @Setter
    private ComprasProductoPK id;

    @Getter @Setter
    private Long cantidad;

    @Getter @Setter
    private Float total;

    @Getter @Setter
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;


}
