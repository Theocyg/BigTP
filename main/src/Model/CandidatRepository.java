package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CandidatRepository {
    Statement stmt=null;
    ResultSet result;
    public CandidatRepository() { }

    public ResultSet requete(Connection conn, String req) {
        try {
            this.stmt = (Statement) conn.createStatement();
            this.result = stmt.executeQuery(req) ;
        }
        catch(Exception e){
            System.out.println("Erreur : "+e.getMessage());
        }
        return this.result;

    }



}
