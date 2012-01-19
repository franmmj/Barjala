
public class LineaPedido {
	ControlStock item;
	int cantidad;
	float subtotal;
	
public LineaPedido()
	{
	
	}

public ControlStock getItem() {
	return item;
}

public void setItem(ControlStock item) {
	this.item = item;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public float getSubtotal() {
	return subtotal;
}

public void setSubtotal(float subtotal) {
	this.subtotal = subtotal;
}


}
