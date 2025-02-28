package Empresa;

import java.util.ArrayList;

import Factura.Factura;
import Factura.FacturaLuz;
import Factura.FacturaPelicula;
import Factura.Pelicula;

public class Empresa {

// ====================== ATRIBUTOS ======================
	private ArrayList<Cine> cines = new ArrayList<Cine>();
	private String codEmpresa;
	
// ====================== CONSTRUCTORES ======================
	public Empresa () {
		
	}
	public Empresa (String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public Empresa (ArrayList<Cine> cines, String codEmpresa) {
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
	public static Empresa empresaPrueba () {
		
		ArrayList<Cine> cines = new ArrayList<Cine>();
		Pelicula p = new Pelicula();
		
		for (int i = 0; i < 3; i++) {
			
			ArrayList<Factura> facturas = new ArrayList<Factura>();
			
			for (int j = 0; j < 3; j++) {
				
				facturas.add(new FacturaLuz(String.valueOf(j), "Medicamentos", 100.34, 23.4, false));
				facturas.add(new FacturaPelicula(String.valueOf(j + 3), "Alquiler", 24.59, 7, p));
		
			}
			
			Cine cPrueba = new Cine("Cine_" + String.valueOf(i + 1), facturas);
			cines.add(cPrueba);
		
		}
		
		Empresa ePrueba = new Empresa(cines, "1");
		return ePrueba;
	}
	
	@Override
	public String toString () {
		
		return "Empresa{CodEmpresa -> " + codEmpresa + " Cines -> " + cines + "}";
		
	}
	
}
