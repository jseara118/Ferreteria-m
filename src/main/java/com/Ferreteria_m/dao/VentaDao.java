package com.Ferreteria_m.dao;

import com.Ferreteria_m.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository <Venta,Long> {
     
}