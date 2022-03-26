package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_categoria")
    private Long idCategoria;

    @Getter @Setter
    private String descripcion;

    @Getter @Setter
    private String estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;


}
