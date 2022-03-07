package com.truper.examen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "PRODUCTOS")
public class Productos {
	
	@Id
	@GeneratedValue
	private Integer productoId;
	
	private Integer ordenId;
	
	private String codigo;
	
	private String descripcion;
	
	private Double precio;
	
	@ManyToOne
	@JoinColumn(name = "FK_ORDENES", nullable = false, updatable = false)
	private Ordenes ordenes;

}
