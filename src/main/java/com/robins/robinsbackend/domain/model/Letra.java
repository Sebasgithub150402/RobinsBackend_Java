package com.robins.robinsbackend.domain.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name="letras")
public class Letra extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "dias_por_anho")
    private Integer diasPorAnho;

    @NotNull
    @Column(name = "plazo_tasa")
    private Integer plazoTasa;

    @NotNull
    @Column(name = "tipo_tasa")
    private Boolean tipoTasa;

    @NotNull
    @Column(name = "porcentaje_tasa")
    private Float porcentajeTasa;

    @Null
    @Column(name = "periodo_capital")
    private Integer periodoCapital;

    @NotNull
    @Column(name = "fecha_descuento")
    private Date fechaDescuento;

    @NotNull
    @Column(name = "fecha_giro")
    private Date fechaGiro;

    @NotNull
    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @NotNull
    @Column(name = "valor_nominal")
    private Float valorNominal;

    @NotNull
    private Float retencion;

    @NotNull
    @Column(name = "tipo_moneda")
    private Boolean tipoMoneda;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuarios_id", nullable = false)
    private Usuario usuario;
}
