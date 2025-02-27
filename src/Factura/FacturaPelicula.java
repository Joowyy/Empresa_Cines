package Factura;

public class FacturaPelicula extends Factura{

// ====================== ATRIBUTOS ======================
	private int diasAlquiler;
	private Pelicula pelicula;
	
// ====================== CONSTRUCTORES ======================
	FacturaPelicula () {

	}
	FacturaPelicula (String idFactura, String concepto, double cantidad) {
		super(idFactura, concepto, cantidad);
	}
	FacturaPelicula(String idFactura, String concepto, double cantidad, int diasAlquiler, Pelicula pelicula) {
		super(idFactura, concepto, cantidad);
		this.diasAlquiler = diasAlquiler;
		this.pelicula = pelicula;
	}
	
// ====================== GETTERS & SETTERS ======================
	public int getDiasAlquiler() {
		return diasAlquiler;
	}
	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
// ====================== METODOS ======================
	@Override
	public void mostrarFactura () {
		
		System.out.println("----------------------");
		System.out.println("ID Factura -> " + idFactura);
		System.out.println("Concepto -> " + concepto);
		System.out.println("Cantidad -> " + cantidad);
		System.out.println("Dias alquiler -> " + diasAlquiler);
		System.out.println("Nombre pelicula ->" + pelicula);
		System.out.println("----------------------");
		
	}
	
}
