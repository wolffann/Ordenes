package com.truper.examen.repository.iface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.examen.entity.Ordenes;

public interface IProductosRepository extends JpaRepository<Ordenes, Integer>{

}
