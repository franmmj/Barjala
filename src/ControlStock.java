
public class ControlStock {
	int id;
	String nombre;
	int stockMaximo;
	int stockMinimo;
	int stockActual;
	float precioCompra;
	Proveedor proveedor;
	
public ControlStock()
	{
	
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getStockMaximo() {
	return stockMaximo;
}

public void setStockMaximo(int stockMaximo) {
	this.stockMaximo = stockMaximo;
}

public int getStockMinimo() {
	return stockMinimo;
}

public void setStockMinimo(int stockMinimo) {
	this.stockMinimo = stockMinimo;
}

public int getStockActual() {
	return stockActual;
}

public void setStockActual(int stockActual) {
	this.stockActual = stockActual;
}

public float getPrecioCompra() {
	return precioCompra;
}

public void setPrecioCompra(float precioCompra) {
	this.precioCompra = precioCompra;
}

public Proveedor getProveedor() {
	return proveedor;
}

public void setProveedor(Proveedor proveedor) {
	this.proveedor = proveedor;
}


}
