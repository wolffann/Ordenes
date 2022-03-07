package com.truper.examen.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sucursales {
	
	@Id
	@GeneratedValue
	private Integer sucursalId;
	
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursales")
	private List<Ordenes> ordenes;
}
