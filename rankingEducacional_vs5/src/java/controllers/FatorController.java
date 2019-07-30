package controllers;

import dao.FatorDAO;
import interfaces.IDatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Fator;

public class FatorController {

    public FatorController() {
    }
    
    public ArrayList<Fator> listarFatores() throws SQLException {
        ArrayList<Fator> fatores;

            FatorDAO fatorDao = new FatorDAO();
            fatores = new ArrayList();
            fatores = fatorDao.select();
        
        return fatores;
    }
}

