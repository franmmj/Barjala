
import java.util.*;
public class Ticket {
	int id;
	LineaPedido cuerpo[];
	Date fecha;
	float total;
	float entregado;
	float devolucion;
	int id_terminal;
	
public Ticket()
	{
	
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public LineaPedido[] getCuerpo() {
	return cuerpo;
}

public void setCuerpo(LineaPedido[] cuerpo) {
	this.cuerpo = cuerpo;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public float getTotal() {
	return total;
}

public void setTotal(float total) {
	this.total = total;
}

public float getEntregado() {
	return entregado;
}

public void setEntregado(float entregado) {
	this.entregado = entregado;
}

public float getDevolucion() {
	return devolucion;
}

public void setDevolucion(float devolucion) {
	this.devolucion = devolucion;
}

public int getId_terminal() {
	return id_terminal;
}

public void setId_terminal(int id_terminal) {
	this.id_terminal = id_terminal;
}


}
