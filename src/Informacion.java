

public class Informacion {
	public static Camarero[] camareros;
	public static Proveedor[] proveedores;
	public static Producto[] productos;
	
	Informacion() {
		camareros = new Camarero[1];
		camareros[0] = new Camarero();
		camareros[0].setDni(new Dni("45735685R"));
		camareros[0].setNombre("Albi asdasdas");
		proveedores = new Proveedor[1];
		proveedores[0] = new Proveedor();
		proveedores[0].setCif("D12345324");
		proveedores[0].setNombre("ASD SA");
		productos = new Producto[3];
		for(int i = 0; i< 3; i++) {
			productos[i] = new Producto();
			productos[i].setId(i);
			productos[i].setNombre("producto"+i);
			productos[i].setPvp((float)(i*1.5));
			productos[i].setProveedor(proveedores[0]);
		}
	}
	
}
