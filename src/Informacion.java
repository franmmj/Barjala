

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
	
			productos[0] = new Producto();
			productos[0].setId(0);
			productos[0].setNombre("Pepsi");
			productos[0].setPvp((float)(1));
			productos[0].setProveedor(proveedores[0]);
			productos[1] = new Producto();
			productos[1].setId(1);
			productos[1].setNombre("Pepsi Light");
			productos[1].setPvp((float)(1));
			productos[1].setProveedor(proveedores[0]);
			productos[2] = new Producto();
			productos[2].setId(2);
			productos[2].setNombre("Fanta Naranja");
			productos[2].setPvp((float)(1));
			productos[2].setProveedor(proveedores[0]);
			productos[3] = new Producto();
			productos[3].setId(3);
			productos[3].setNombre("Fanta Limon");
			productos[3].setPvp((float)(1));
			productos[3].setProveedor(proveedores[0]);
			productos[4] = new Producto();
			productos[4].setId(4);
			productos[4].setNombre("Nestea");
			productos[4].setPvp((float)(1.2));
			productos[4].setProveedor(proveedores[0]);
			productos[5] = new Producto();
			productos[5].setId(5);
			productos[5].setNombre("Aquarius");
			productos[5].setPvp((float)(1.2));
			productos[5].setProveedor(proveedores[0]);
			productos[6] = new Producto();
			productos[6].setId(6);
			productos[6].setNombre("DYC");
			productos[6].setPvp((float)(2.5));
			productos[6].setProveedor(proveedores[0]);
			productos[7] = new Producto();
			productos[7].setId(7);
			productos[7].setNombre("JB");
			productos[7].setPvp((float)(3));
			productos[7].setProveedor(proveedores[0]);
			productos[8] = new Producto();
			productos[8].setId(8);
			productos[8].setNombre("Legendario");
			productos[8].setPvp((float)(3.5));
			productos[8].setProveedor(proveedores[0]);
			productos[9] = new Producto();
			productos[9].setId(9);
			productos[9].setNombre("Bacardi");
			productos[9].setPvp((float)(3));
			productos[9].setProveedor(proveedores[0]);
			for(int i = 10; i<24; i++) {	
				productos[i] = new Producto();
				productos[i].setId(i);
				productos[i].setNombre("Producto");
				productos[i].setPvp((float)(3));
				productos[i].setProveedor(proveedores[0]);
			}
	}
	}
	

