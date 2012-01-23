
import java.util.*;
public class Pedido {
	int id;
	Date Fecha;
	Proveedor proveedor;
	LineaPedido cuerpo[];
	Boolean pendiente;
	
public Pedido()
	{
	
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Date getFecha() {
	return Fecha;
}

public void setFecha(Date fecha) {
	Fecha = fecha;
}

public Proveedor getProveedor() {
	return proveedor;
}

public void setProveedor(Proveedor proveedor) {
	this.proveedor = proveedor;
}

public LineaPedido[] getCuerpo() {
	return cuerpo;
}

public void setCuerpo(LineaPedido[] cuerpo) {
	this.cuerpo = cuerpo;
}

public Boolean getPendiente() {
	return pendiente;
}

public void setPendiente(Boolean pendiente) {
	this.pendiente = pendiente;
}


}
