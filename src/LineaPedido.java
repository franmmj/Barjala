

public class LineaPedido {
	Producto item;
	int cantidad;
	float subtotal;
	
public LineaPedido(Producto item, int cantidad)
	{
	this.item = item;
	this.cantidad = cantidad;
	this.subtotal = item.getPvp() * cantidad;
	}

public ControlStock getItem() {
	return item;
}

public void setItem(Producto item) {
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


public Object[] getRow(){
	return new Object[]{cantidad, item.nombre, item.pvp, subtotal};
	}
}
