package br.edu.utfpr.dv.sireata.InterfacesDAO;

import java.sql.SQLException;
import java.util.List;

public abstract class GenericDAO {
	
	protected saveDAO interfaceSaveDAO;
	protected readDAO interfaceReadDAO;
	protected updateDAO interfaceUpdateDAO;
	protected deleteDAO interfaceDeleteDAO;
	
	public int save(InterfaceGeneric params) throws SQLException {
		return interfaceSaveDAO.save(params);
	}
	
	public List<InterfaceGeneric> findAll() throws SQLException {
	    return interfaceReadDAO.findAll();
	  }

	  public InterfaceGeneric findById(int id) throws SQLException {
	    return interfaceReadDAO.findById(id);
	  }

	  public void update(InterfaceGeneric entity, String value) throws SQLException {
		  interfaceUpdateDAO.update(entity, value);
	  }

	  public void delete(int id) throws SQLException {
		  interfaceDeleteDAO.delete(id);
	  }

}
