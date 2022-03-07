package com.truper.examen.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.examen.entity.Ordenes;
import com.truper.examen.model.Orden;
import com.truper.examen.repository.iface.IProductosRepository;
import com.truper.examen.service.iface.IProductosService;

@Service
public class ProductosServiceImpl implements IProductosService {

	@Autowired
	private IProductosRepository iProductosRepository;
	
	@Override
	public void guardarOrdenCompra(Orden orden) {
		Ordenes ordenes = new Ordenes();
		BeanUtils.copyProperties(orden, ordenes);
		iProductosRepository.save(ordenes);
	}

	@Override
	public Optional<Ordenes> obtenerOrden(Integer ordenId) {		
		return iProductosRepository.findById(ordenId);
	}

}
