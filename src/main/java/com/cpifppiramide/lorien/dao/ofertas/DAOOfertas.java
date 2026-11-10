package com.cpifppiramide.lorien.dao.ofertas;

import com.cpifppiramide.lorien.entities.Oferta;

import java.util.List;

public interface DAOOfertas {

    List<Oferta> getAll();
    void save(Oferta oferta);
    void update(Oferta oferta, String titulo);
    void delete(String titulo);

    // Comentario
}
