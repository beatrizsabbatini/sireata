package br.edu.utfpr.dv.sireata.InterfacesDAO;

import java.sql.SQLException;

public interface saveDAO {
	public int save(InterfaceGeneric params) throws SQLException;
}
