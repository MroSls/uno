package Uno;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseConexion {

    Connection SQLConexion;

    public BaseConexion() {

        String host = "localhost", puerto = "3306", nameBD = "usuarios", usuario = "root", pass = "", driver = "com.mysql.cj.jdbc.Driver";

        String databaseURL = "jdbc:mysql://" + host + ":" + puerto + "/" + nameBD + "?useSSL=false";

        try {
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL, usuario, pass);
            System.out.println("Base de datos conectada");
        } catch (Exception ex) {
            System.out.println("La base de datos no se a encontrado\n" + ex);
        }
    }

    public Connection getConectarDB() {
        return SQLConexion;
    }
}
