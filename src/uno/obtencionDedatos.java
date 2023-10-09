package Uno;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class obtencionDedatos {

    BaseConexion MYSQL = new BaseConexion();
    public static String[] datos = new String[3];
    public static String sSQL;
    Connection cn = MYSQL.getConectarDB();

    public void ingreso(String usu, String con) {

        sSQL = "SELECT * FROM usuarios WHERE Usuario='" + usu + "' AND Contraseña='" + con + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                datos[0] = rs.getString("ID");
                datos[1] = rs.getString("Usuario");
                datos[2] = rs.getString("Contraseña");
                System.out.println(datos[0] + " " + datos[1] + " " + datos[2]);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR\n" + ex);
        }
    }
//   public void (){
//       
//   }

}
