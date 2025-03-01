package Factura;

public class FacturaLuz extends Factura {

// ====================== ATRIBUTOS ======================
	private double consumo; //Kilowatios consumidos
	private boolean pagado; //True = pagado
	
// ====================== CONSTRUCTORES ======================
	public FacturaLuz() {
		
	}
	public FacturaLuz(String idFactura, String concepto, double cantidad, double consumo, boolean pagado) {
		super(idFactura, concepto, cantidad);
		this.consumo = consumo;
		this.pagado = pagado;
	}
// ====================== GETTERS & SETTERS ======================
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	
// ====================== METODOS ======================
	@Override
	public void mostrarFactura () {
		
		System.out.println("\n----------------------");
		System.out.println("ID Factura -> " + idFactura);
		System.out.println("Concepto -> " + concepto);
		System.out.println("Cantidad -> " + cantidad);
		System.out.println("Consumo KW -> " + consumo);
		System.out.println("Factura pagada -> " + pagado);
		System.out.println("----------------------");
		
	}
	
	
	
}
