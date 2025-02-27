package Empresa;

import java.util.ArrayList;

import Factura.Factura;

public class Cine {

// ====================== ATRIBUTOS ======================
	private String nombreCine;
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	
// ====================== CONSTRUCTORES ======================
	Cine () {
		
	}
	Cine (String nombreCine, ArrayList<Factura> facturas) {
		this.nombreCine = nombreCine;
		this.facturas = facturas;
	}
	
// ====================== GETTERS & SETTERS ======================
	public String getNombreCine() {
		return nombreCine;
	}
	public void setNombreCine(String nombreCine) {
		this.nombreCine = nombreCine;
	}
	
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	
// ====================== METODOS ======================
	public void mostrarCine () {
		
		System.out.println("----------------------");
		
		System.out.println("Nombre cine -> " + nombreCine);
		System.out.println("Facturas -> " + facturas);
		
		System.out.println("----------------------");
		
	}
	
	public void obtenerFacturaLuzNoPagadas () {
	
		System.out.println("----------------------");
		
		System.out.println("Estas son las facturas de luz no pagadas");
		for (Factura f : facturas) {
			
			// Imprime las facturas
			System.out.println(f.getClass().getSimpleName());
			f.mostrarFactura();
			
		}
		
		System.out.println("----------------------");
		
	}
	
}
