import java.util.ArrayList;
import java.util.Scanner;

import Empresa.Cine;
import Empresa.Empresa;
import Factura.Factura;
import Factura.FacturaLuz;
import Factura.FacturaPelicula;
import Factura.Pelicula;

public class Main {

	public static void main(String[] args) {
		
//		Introducimos todos los datos de una empresa entera.
		Empresa empresa = Empresa.crearEmpresa();
		
		Scanner sc = new Scanner (System.in);
		int opc;
		
		do {
			
			System.out.println("Bienvenido empleado. ¿Donde desea ir?\n\n1. Mostrar empresa y cines\n2. Mostrar facturas luz de un cine\n3. Mostrar facturas de peliculas de un cine\n4. Mostrar facturas de luz no pagadas\n5. Calcular importe facturas peliculas\n6. Calcula importe facturas de la empresa\n7. Pagar luz\n8. Salir");
			
			switch (opc = sc.nextLine().charAt(0)) {
			case '1':
				
				empresa.mostrarEmpresa();
				break;
			
			case '2':
				
				Cine cineSeleccionado2 = elegirCine(empresa);
				
				if (cineSeleccionado2 != null) {
				
					cineSeleccionado2.mostrarFacturasLuz();
					
				}
				
				break;
				
			case '3':
				
				Cine cineSeleccionado3 = elegirCine(empresa);
				
				if (cineSeleccionado3 != null) {
				
					cineSeleccionado3.mostrarFacturasPelicula();
					
				}
				
				break;
				
			case '4':
				
//				Recoge el retorno de la funcion 'elegirCine (Main)'
				Cine cineSeleccionado4 = elegirCine(empresa);
				
				if (cineSeleccionado4 != null) {
					
//					Recoge el retorno del metodo 'obtenerFacturaLuzNoPagadas (Cine)'
			        ArrayList<FacturaLuz> facturasNoPagadas = cineSeleccionado4.obtenerFacturaLuzNoPagadas();
			        
//			        Comprueba si el Array está vacia
			        if (facturasNoPagadas.isEmpty()) {
			        	
			            System.out.println("No hay facturas de luz pendientes de pago para este cine.");
			        }
			        
			    } else {
			    	
			        System.out.println("Cine no encontrado.");
			        
			    }
			    break;
				
			case '5':
				
				break;
				
			case '6':
				
				break;
				
			case '7':
				
				break;
				
			case '8':
				
				System.out.println("Saliendo del programa...");
				break;

			}
			
		} while (opc != '8');
		
//		Empresa ePrueba = Empresa.empresaPrueba();
//		
//		System.out.println(ePrueba.empresaPrueba());
		
	}
	
	public static Cine elegirCine (Empresa empresa) {
		Scanner sc = new Scanner (System.in);
		
//		'for each' que imprime
		for (Cine c2 : empresa.getCines()) {
			
			c2.mostrarCine();
			
		}
		
		System.out.println("¿Que cine quieres elegir? Introduce el nombre");
		String cineUsuario = sc.nextLine();
		
//		'for each' que comprueba
		for (Cine c : empresa.getCines()) {

			if (c.getNombreCine().equalsIgnoreCase(cineUsuario)) {

				return c;
				
			}
			
		}
		
		return null;
	}

}
