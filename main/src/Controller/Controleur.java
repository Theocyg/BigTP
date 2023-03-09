package bddgraph.Controller;
import bddgraph.Model.Repository;
import bddgraph.View.Vue2;
import bddgraph.Model.Connexion;
import bddgraph.Model.Repository;
import bddgraph.View.*;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Controleur {
    public void traiterRequete(Connection conn) throws SQLException implements Vue1 {

        ResultSet rst1 = null, rst2 = null, rst3 = null;


        try {
            //Appel de la méthode getConnexio() via la classe Connexion

            //Création d'objets de la classe Vue

            //PREMIERE REQUETE
            Vue1 vue1 = new Vue1(); //Pour la première requête
            String req1 = "SELECT m.nom AS menu, GROUP_CONCAT(a.nom SEPARATOR ', ') AS aliments\n" +
                    "FROM menu m\n" +
                    "JOIN menu_aliment ma ON m.id = ma.idMenu\n" +
                    "JOIN aliment a ON ma.idAlim = a.id\n" +
                    "GROUP BY m.nom;\n";
            Repository rep1 = new Repository();
            rst1 = rep1.requete(conn, req1);
            vue1.showView(rst1);

        } catch (Exception se) {
            System.out.println(se.getMessage());
        }


    }
}
