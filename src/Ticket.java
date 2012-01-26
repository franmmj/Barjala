
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Ticket {
	int id;
	List<LineaPedido> cuerpo;
	Date fecha;
	float total;
	float entregado;
	float devolucion;
	int id_terminal;
	boolean cerrado;
	
public Ticket()
	{
	id = 1;
	cuerpo = new ArrayList<LineaPedido>();
	total = 0;
	entregado = 0;
	cerrado = false;
	devolucion = 0;
	id_terminal = 0;
	}

public void anyadirLineaPedido(LineaPedido lp) {
	if(!cerrado)
	{
		cuerpo.add(lp);
		total += lp.subtotal;
	}
}

public LineaPedido obtenerLineaPedido( int i ) {
	LineaPedido aux;
	if(cuerpo.isEmpty()){
		return null;
	}else{
		aux = cuerpo.get(i);
		return aux;
	}
}

public void cerrarTicket() {
	cerrado = true;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<LineaPedido> getCuerpo() {
	return cuerpo;
}

public void setCuerpo(List<LineaPedido> cuerpo) {
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
