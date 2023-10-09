package Uno;
import Uno.BaseConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

public class Llenar {
    
    public void Rellenar(String tabla, String valor, JComboBox combo){
        String sql="select * from "+tabla;
        Statement st;
        BaseConexion conec=new BaseConexion();
        Connection conexion = conec.getConectarDB();
        try {
            st=conexion.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                combo.addItem(rs.getString(valor));
                System.out.println("Informacion encontrada");
            }
        } catch (SQLException e) {
            System.out.println("No se encontro informacion"+e);
        }
    }
}
