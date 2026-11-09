package com.cpifppiramide.lorien.dao;

import com.cpifppiramide.lorien.dao.ofertas.DAOOfertas;
import com.cpifppiramide.lorien.dao.ofertas.DAOOfertasMySQL;
import com.cpifppiramide.lorien.dao.ofertas.DAOOfertasRAM;

public class DAOFactory {

    private static DAOFactory daoFactory;
    private DAOOfertas daoOfertas;

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null) daoFactory = new DAOFactory();
        return daoFactory;
    }

    public DAOOfertas getDaoOfertas(){
        if(daoOfertas == null) daoOfertas = new DAOOfertasMySQL();
        return daoOfertas;
    }


}
