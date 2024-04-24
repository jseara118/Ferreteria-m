package com.Ferreteria_m.service.impl;

import com.Ferreteria_m.dao.CategoriaDao;
import com.Ferreteria_m.domain.Categoria;
import com.Ferreteria_m.service.CategoriaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {

        List<Categoria> lista = categoriaDao.findAll();
        if (activos) {
            //Remover los elementos inactivos
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> buscarPorDescripcion(String descripcion) {
        return categoriaDao.findByDescripcion(descripcion);
    }
}
