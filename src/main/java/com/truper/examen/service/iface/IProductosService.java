package com.truper.examen.service.iface;

import java.util.Optional;

import com.truper.examen.entity.Ordenes;
import com.truper.examen.model.Orden;

public interface IProductosService {
	
	public void guardarOrdenCompra(Orden orden);
	
	public Optional<Ordenes> obtenerOrden(Integer ordenId);

}
