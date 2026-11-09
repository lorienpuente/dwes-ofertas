package com.cpifppiramide.lorien.rest;


import com.cpifppiramide.lorien.dao.DAOFactory;
import com.cpifppiramide.lorien.entities.Oferta;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfertasRestController {

    @GetMapping("/api/ofertas")
    List<Oferta> getAll(){
        return DAOFactory.getInstance().getDaoOfertas().getAll();
    }

    @PostMapping("/api/ofertas")
    Oferta save(@RequestBody Oferta oferta){
        DAOFactory.getInstance().getDaoOfertas().save(oferta);
        return oferta;
    }

    @PutMapping("/api/ofertas/{titulo}")
    Oferta update(@RequestBody Oferta oferta, @PathVariable String titulo) {
        DAOFactory.getInstance().getDaoOfertas().update(oferta, titulo);
        return oferta;
    }

    @DeleteMapping("/api/ofertas/{titulo}")
    String delete( @PathVariable String titulo) {
        DAOFactory.getInstance().getDaoOfertas().delete(titulo);
        return "Oferta borrada";
    }
}
