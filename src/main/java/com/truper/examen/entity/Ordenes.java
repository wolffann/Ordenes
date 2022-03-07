package com.truper.examen.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ORDENES")
public class Ordenes {

	@Id
	@GeneratedValue
	private Integer ordenId;
	
	private Integer sucursalId;
	
	private Date fecha;
	
	private Double total;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenes")
	private List<Productos> productos;
	
	@ManyToOne
	@JoinColumn(name="FK_SUCURSALES", nullable = false, updatable = false)
	private Sucursales sucursales;
	
}
