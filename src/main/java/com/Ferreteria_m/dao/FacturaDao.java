package com.Ferreteria_m.dao;

import com.Ferreteria_m.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository <Factura,Long> {
     
}