package ar.edu.unlp.info.oo2;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseAccess database;
	private boolean isLogued;
	
	public DatabaseProxy(DatabaseAccess databse) {
		this.database = database;
	}
	
	public void logIn() {
		this.isLogued = true;
	}
	
	public void logOut() {
		this.isLogued = false;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (!this.isLogued) {
			throw new RuntimeException("Acceso denegado");
		} else {
			return this.database.insertNewRow(rowData);
		}
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (!this.isLogued) {
			throw new RuntimeException("Acceso denegado");
		} else {
			return this.database.getSearchResults(queryString);
		}
	}
	
	

}
