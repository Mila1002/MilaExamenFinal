package app.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.modelo.Agenda;

public class AccesoAgenda extends Conexion {

	
	
	public boolean altaContacto(Agenda a1) throws ClassNotFoundException, SQLException {
		
		
		String sql = "insert into contactos values (0, ?, ?, ?)";
		
		PreparedStatement comando;
		
		int numContactosRegistrados;
		
		abrirConexion();
		
		comando = miConexion.prepareStatement(sql);
		//comando.setInt(1, a1.getIdcontacto());
		comando.setString(1, a1.getNombre());
		comando.setString(2, a1.getEmail());
		comando.setString(3, a1.getTelefono());
		
		 numContactosRegistrados = comando.executeUpdate();
		
		cerrarConexion();
		
		return numContactosRegistrados >=1;
		
		
	}
	
	public boolean eliminarContacto(int idcontacto) throws ClassNotFoundException, SQLException {
		
		String sql = "delete  from contactos where idcontacto =?";
		
		PreparedStatement comando;
		
		int numContactosBorrados;
		
		abrirConexion();
		
		comando = miConexion.prepareStatement(sql);
		
		comando.setInt(1, idcontacto);
		
		numContactosBorrados = comando.executeUpdate();
		
		cerrarConexion();
		
		return numContactosBorrados >=1;
	}

	public boolean modificarContacto(Agenda contacto) throws ClassNotFoundException, SQLException {
	
		String sql = "Update contactos set nombre=?, email=?, telefono=? where idcontacto=? ";
		
		PreparedStatement comando;
		
		int numRegistrosModificados;
		
		abrirConexion();
		
		comando = miConexion.prepareStatement(sql);
		
		comando.setString(1, contacto.getNombre());
		comando.setString(2, contacto.getEmail());
		comando.setString(3, contacto.getTelefono());
		comando.setInt(4, contacto.getIdcontacto());
		
		numRegistrosModificados = comando.executeUpdate();
		
		cerrarConexion();
		
		return numRegistrosModificados >=1;
		
	}

	public Agenda obtenerUno (int idcontacto) throws ClassNotFoundException, SQLException {
		
		String sql = "Select idcontacto, nombre, email, telefono from contactos "
				+ "where idcontacto=?";
		
		PreparedStatement comando;
		
		ResultSet rs;
		
		Agenda a1 = null;
		
		abrirConexion();
		
		comando = miConexion.prepareStatement(sql);
		
		comando.setInt(1, idcontacto);
		
		rs = comando.executeQuery();
		
		if (rs.next()) {
			a1 = new Agenda(idcontacto, 
					rs.getString("nombre"), 
					rs.getString("email"), 
					rs.getString("telefono"));
		}
		
		cerrarConexion();
		
		return a1;
		
	}

	public List<Agenda> obtenerTodos() throws ClassNotFoundException, SQLException{
		
		String sql = "Select idcontacto, nombre, email, telefono from contactos";
		
		PreparedStatement comando;
		
		ResultSet rs;
		
		List<Agenda> contactos = new ArrayList<Agenda>();
		
		abrirConexion();
		
		comando = miConexion.prepareStatement(sql);
		
		rs = comando.executeQuery();
		
		while (rs.next()) {
			Agenda a1 = new Agenda(rs.getInt("idcontacto"), 
					rs.getString("nombre"), 
					rs.getString("email"), 
					rs.getString("telefono"));
			
			contactos.add(a1);
		}
		
		cerrarConexion();
		
		return contactos;
		
		
	}
	
}
