package com.truper.examen.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.examen.entity.Ordenes;
import com.truper.examen.model.Orden;
import com.truper.examen.service.iface.IProductosService;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {

	@Autowired
	private IProductosService iProductosService;
	
	@PostMapping("/orden-compra")
	public ResponseEntity<String> guardarOrdenCompra(@RequestBody Orden orden) {
		iProductosService.guardarOrdenCompra(orden);
		return new ResponseEntity<>("Guardado Exitoso", HttpStatus.CREATED);
	}
	
	@GetMapping("/orden-compra/{ordenId}")
	public ResponseEntity<Optional<Ordenes>> obtenerOrdenes(@PathVariable Integer ordenId) {
		return new ResponseEntity<>(iProductosService.obtenerOrden(ordenId), HttpStatus.OK);
	}
	
	
}
