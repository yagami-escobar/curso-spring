package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_compra")
    private Long idCompra;

    @Getter @Setter
    private Date fecha;

    @Getter @Setter @Column(name = "medio_pago")
    private String medioPago;

    @Getter @Setter
    private String comentario;

    @Getter @Setter
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> comprasProductos;



}
