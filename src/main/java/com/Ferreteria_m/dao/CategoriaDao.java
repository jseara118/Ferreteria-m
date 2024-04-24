package com.Ferreteria_m.dao;

import com.Ferreteria_m.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

    List<Categoria> findByDescripcion(String descripcion);

}
