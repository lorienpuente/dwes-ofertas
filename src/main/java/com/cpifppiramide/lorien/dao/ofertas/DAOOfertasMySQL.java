package com.cpifppiramide.lorien.dao.ofertas;

import com.cpifppiramide.lorien.db.DBConnection;
import com.cpifppiramide.lorien.entities.Oferta;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOOfertasMySQL implements DAOOfertas{
    @Override
    public List<Oferta> getAll() {
        String query = "select * from oferta";
        List<Oferta> ofertas = new ArrayList<>();
        try {
            PreparedStatement statement = DBConnection.getInstance().prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Oferta oferta = new Oferta(rs.getString("titulo"), rs.getString("descripcion"));
                ofertas.add(oferta);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ofertas;
    }

    @Override
    public void save(Oferta oferta) {
        String query = "insert into oferta values (?,?)";
        try {
            PreparedStatement statement = DBConnection.getInstance().prepareStatement(query);
            statement.setString(1, oferta.getTitulo());
            statement.setString(2,oferta.getDescripcion());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Oferta oferta, String titulo) {

        

    }

    @Override
    public void delete(String titulo) {

    }
}
