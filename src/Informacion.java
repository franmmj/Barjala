

public class Informacion {
	public Camarero[] camareros;
	public Proveedor[] proveedores;
	public Producto[] productos;
	
	Informacion() {
		camareros = new Camarero[4];
		camareros[0] = new Camarero();
		camareros[0].setDni(new Dni("45735685R"));
		camareros[0].setNombre("Camarero 1");
		camareros[1] = new Camarero();
		camareros[1].setDni(new Dni("30968143T"));
		camareros[1].setNombre("Camarero 2");
		camareros[2] = new Camarero();
		camareros[2].setDni(new Dni("30968144R"));
		camareros[2].setNombre("Camarero 3");
		camareros[3] = new Camarero();
		camareros[3].setDni(new Dni("30428133F"));
		camareros[3].setNombre("Camarero 4");
		proveedores = new Proveedor[1];
		proveedores[0] = new Proveedor();
		proveedores[0].setCif("D12345324");
		proveedores[0].setNombre("ASD SA");
		productos = new Producto[24];
		for(int i = 0; i<24; i++) {
			productos[i] = new Producto();
			productos[i].setId(i);
			productos[i].setNombre("producto"+i);
			productos[i].setPvp((float)((i+1)*1.5));
			productos[i].setProveedor(proveedores[0]);
		}
	}
	
}
