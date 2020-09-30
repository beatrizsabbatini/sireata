package br.edu.utfpr.dv.sireata.InterfacesDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface readDAO {
	public InterfaceGeneric findById(int value) throws SQLException;
	public InterfaceGeneric loadObject(ResultSet resultSet) throws SQLException;
	public List<InterfaceGeneric> findAll() throws SQLException;
}
