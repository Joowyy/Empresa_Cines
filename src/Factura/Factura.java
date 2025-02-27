package Factura;

public abstract class Factura {

// ====================== ATRIBUTOS ======================
	protected String idFactura;
	protected String concepto;
	protected double cantidad;
	
// ====================== CONSTRUCTORES ======================
	Factura () {
		
	}
	Factura(String idFactura, String concepto, double cantidad) {
		this.idFactura = idFactura;
		this.concepto = concepto;
		this.cantidad = cantidad;
	}
	
// ====================== GETTERS & SETTERS ======================
	public String getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
// ====================== ATRIBUTOS ======================
	public abstract void mostrarFactura ();
}
