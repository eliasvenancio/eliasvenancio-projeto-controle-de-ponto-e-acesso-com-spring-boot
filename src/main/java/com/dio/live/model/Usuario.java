package com.dio.live.model;

import lombok.*;
import org.hibernate.annotations.LazyToOne;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private long id;
    @ManyToOne
    private CategoriaUsuario CategoriaUsuario;
    private String nome;
    @ManyToOne
    private String empresa;
    @ManyToOne
    private NivelAcesso NivelAcesso;
    @ManyToOne
    private JornadaTrabalho JornadaTrabalho;
    private BigDecimal Tolerancia;
    private LocalDateTime InicioJornada;
    private LocalDateTime FinalJornada;
}
