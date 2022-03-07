package com.truper.examen.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Orden implements Serializable {

	private static final long serialVersionUID = 7534644924335681379L;

	private Integer ordenId;
	
	private Integer sucursalId;
	
	private String fecha;
	
	private Double total;
	
	private List<Producto> productos;
	
}
