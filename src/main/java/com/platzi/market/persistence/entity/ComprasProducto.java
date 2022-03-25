package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @Getter @Setter  @Column(name = "id_compra")
    private Long IdCompra;

    @Getter @Setter @Column(name = "id_producto")
    private Long IdProducto;

    @Getter @Setter
    private Long cantidad;

    @Getter @Setter
    private Float total;

    @Getter @Setter
    private String estado;




}
