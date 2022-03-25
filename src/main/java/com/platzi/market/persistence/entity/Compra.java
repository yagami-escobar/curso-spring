package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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

    @Getter @Setter @Column(name = "id_cliente")
    private Long idCliente;

}
