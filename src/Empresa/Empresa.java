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
	public void mostrarEmpresa () {
		
		System.out.println("\n----------------------");
		
		System.out.println("Cod Empresa -> " + codEmpresa);
		System.out.println("Cines -> " + cines);
		
		System.out.println("----------------------\n");
		
	}
	
	
	
	public static Empresa crearEmpresa () {
		
		ArrayList<Cine> cines = new ArrayList<Cine>();
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		
		for (int k = 0; k < 5; k++) {
		
//			La declaramos, para que pueda luego cambiarse el valor
			Pelicula p = null;
			
			if (k == 0) {
			
				p = new Pelicula(2017, String.valueOf(k), "Terminator");
		
			} else if (k == 1) {
				
				p = new Pelicula(2023, String.valueOf(k), "Mascotas 2");
				
			} else if (k == 2) {
				
				p = new Pelicula(2012, String.valueOf(k), "Alborotado");
				
			} else if (k == 3) {
				
				p = new Pelicula(2006, String.valueOf(k), "El amigo invisible");
				
			} else if (k == 4) {
				
				p = new Pelicula(2020, String.valueOf(k), "Escuadron Suicida");
				
			}
			
			peliculas.add(p);
			
		}
		
		for (int i = 0; i < 3; i++) {
			
			ArrayList<Factura> facturas = new ArrayList<Factura>();
			
			for (int j = 0; j < 3; j++) {
				
				if (j == 0 && (j + 3) == 3) {
					
					facturas.add(new FacturaLuz(String.valueOf(j), "Iberdroga", 100.34, 23.4, false));
					facturas.add(new FacturaPelicula(String.valueOf(j + 3), "Alquiler 2o mes", 24.59, 30, peliculas.get(j)));
				
				} else if (j == 1 && (j + 3) == 4) {
					
					facturas.add(new FacturaLuz(String.valueOf(j), "Gas Natural", 39.39, 13.4, false));
					facturas.add(new FacturaPelicula(String.valueOf(j + 3), "Alquiler 3r mes", 29.99, 19, peliculas.get(j)));
					
				} else if (j == 2 && (j + 3) == 5) {
					
					facturas.add(new FacturaLuz(String.valueOf(j), "Otras...", 129.99, 9.7, false));
					facturas.add(new FacturaPelicula(String.valueOf(j + 3), "Alquiler 5o mes", 34.49, 24, peliculas.get(j)));
					
				}
				
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
