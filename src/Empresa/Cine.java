package Empresa;

import java.util.ArrayList;

import Factura.Factura;
import Factura.FacturaLuz;
import Factura.FacturaPelicula;

public class Cine {

// ====================== ATRIBUTOS ======================
	private String nombreCine;
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	
// ====================== CONSTRUCTORES ======================
	public Cine () {
		
	}
	public Cine (String nombreCine, ArrayList<Factura> facturas) {
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
		
		System.out.println("\n----------------------");
		
		System.out.println("Nombre cine -> " + nombreCine);
		System.out.println("Facturas -> " + facturas);
		
		System.out.println("----------------------");
		
	}
	
	public void mostrarFacturasPelicula() {
		
		System.out.println("\n----------------------");
		System.out.println("Estas son las facturas de luz no pagadas");
		
		for (Factura f : facturas) {
			
			if (f.getClass().getSimpleName().equals("FacturaPelicula")) {
				
				f.mostrarFactura();
				
			}
			
		}
		
	}
	
	public void mostrarFacturasLuz () {
		
		System.out.println("\n----------------------");
		System.out.println("Estas son las facturas de luz no pagadas");
		
		for (Factura f : facturas) {
			
			if (f.getClass().getSimpleName().equals("FacturaLuz")) {
				
				f.mostrarFactura();
				
			}
			
		}
		
	}
	
	public double totalFacturasCine () {
		double totalFacturaCine = 0.0;
		
		System.out.println("----------------------");
		
		for (Factura f : facturas) {
			
			if (f instanceof FacturaLuz) {
	            
				FacturaLuz facturaLuz = (FacturaLuz) f;
	            
	            if (facturaLuz.isPagado() == false) {
	            	
	            	totalFacturaCine += f.getCantidad();
	                
	            }
	            
	        }
			
			if (f instanceof FacturaPelicula) {

				totalFacturaCine += f.getCantidad();
	            
	        }
			
		}
		
		System.out.println("El total de facturas en el cine es -> " + totalFacturaCine);
		return totalFacturaCine;
	}
	
	public ArrayList<FacturaLuz> obtenerFacturaLuzNoPagadas () {
		ArrayList<FacturaLuz> facturasLuzNoPagadas = new ArrayList<FacturaLuz>();
		
		System.out.println("\n----------------------");
		System.out.println("Estas son las facturas de luz no pagadas");
		
		for (Factura f : facturas) {
			
	        // Verificamos si la factura es de tipo FacturaLuz usando getClass().getSimpleName()
	        if (f.getClass().getSimpleName().equals("FacturaLuz")) {
	        	
	            FacturaLuz facturaLuz = (FacturaLuz) f; // Hacemos el casting seguro
	            
	            if (facturaLuz.isPagado() == false) {
	            	
	                facturasLuzNoPagadas.add(facturaLuz);
	                facturaLuz.mostrarFactura(); // Mostrar la factura
	                
	            }
	            
	        }
	        
	    }
		
		System.out.println("----------------------");
		
		return facturasLuzNoPagadas;
	}
	
	public double calcularImporteFacturasPelicula () {
		double precioTotal = 0.0;

		for (Factura f : facturas) {

	        // Verificamos si la factura es de tipo FacturaLuz usando getClass().getSimpleName()
	        if (f.getClass().getSimpleName().equals("FacturaPelicula")) {
	        	
	        	f.mostrarFactura();
	            precioTotal += f.getCantidad();
	            
	        }
	        
	    }
		
		System.out.println("El precio total de las facturas será -> " + precioTotal);
		System.out.println("----------------------\n");
		return precioTotal;
	}
	
	@Override
	public String toString () {
		
		return nombreCine;
		
	}
	
}
