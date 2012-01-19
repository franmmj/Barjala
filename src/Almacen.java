import java.util.*;
public class Almacen {
	Date fechaUltimaReposicion;
	Mercaderia mercaderia[];
	Inmovilizado inmovilizado[];
	
public Almacen()
	{
	
	}

public Date getFechaUltimaReposicion() {
	return fechaUltimaReposicion;
}

public void setFechaUltimaReposicion(Date fechaUltimaReposicion) {
	this.fechaUltimaReposicion = fechaUltimaReposicion;
}

public Mercaderia[] getMercaderia() {
	return mercaderia;
}

public void setMercaderia(Mercaderia[] mercaderia) {
	this.mercaderia = mercaderia;
}

public Inmovilizado[] getInmovilizado() {
	return inmovilizado;
}

public void setInmovilizado(Inmovilizado[] inmovilizado) {
	this.inmovilizado = inmovilizado;
}


}
