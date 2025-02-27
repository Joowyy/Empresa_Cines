package Empresa;

import java.util.ArrayList;

public class Empresa {

// ====================== ATRIBUTOS ======================
	private ArrayList<Cine> cines = new ArrayList<Cine>();
	private String codEmpresa;
	
// ====================== CONSTRUCTORES ======================
	Empresa () {
		
	}
	Empresa (ArrayList<Cine> cines, String codEmpresa) {
		this.cines = cines;
		this.codEmpresa = codEmpresa;
	}
	
// ====================== GETTERS & SETTERS ======================
	public ArrayList<Cine> getCines() {
		return cines;
	}
	public void setCines(ArrayList<Cine> cines) {
		this.cines = cines;
	}
	
	public String getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	
// ====================== METODOS ======================
	
}
