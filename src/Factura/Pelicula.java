package Factura;

public class Pelicula {

// ====================== ATRIBUTOS ======================
	private int año;
	private String idPelicula;
	private String nombrePelicula;
	
// ====================== CONSTRUCTORES ======================
	public Pelicula() {
		
	}
	public Pelicula(int año, String idPelicula, String nombrePelicula) {
		this.año = año;
		this.idPelicula = idPelicula;
		this.nombrePelicula = nombrePelicula;
	}
	
// ====================== GETTERS & SETTERS ======================
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	public String getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(String idPelicula) {
		this.idPelicula = idPelicula;
	}
	
	public String getNombrePelicula() {
		return nombrePelicula;
	}
	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

// ====================== METODOS ======================
	public void mostrarPelicula () {
		
		System.out.println("----------------------");
		System.out.println("ID Pelicula -> " + idPelicula);
		System.out.println("Año Pelicula -> " + año);
		System.out.println("Nombre -> " + nombrePelicula);
		System.out.println("----------------------");
		
	}
	
}
