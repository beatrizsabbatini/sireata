package br.edu.utfpr.dv.sireata.InterfacesDAO;

import java.sql.SQLException;

public interface updateDAO {
	public void update(InterfaceGeneric params, String value) throws SQLException;
}
