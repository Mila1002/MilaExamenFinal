package app.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	//Atributo
    protected Connection miConexion;

    //Método para abrir la conexion
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda?useUnicode=true&useJDBCCompliantTimezoneShift=true&use"
        		+ "LegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false",
                "root", "Curso2019$");

    }

    public Connection getMiConexion() {
        return miConexion;
    }

    public void cerrarConexion() throws SQLException {
        miConexion.close();
    }

}
