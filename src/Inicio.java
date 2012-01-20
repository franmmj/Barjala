

import javax.swing.SwingUtilities;

import Principal.VCamarero;
import Principal.VLogin;

public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final Camarero camarero[] = new Camarero[1];
		camarero[0].setDni(new Dni("45735685r"));
		camarero[0].setNombre("Albi asdasdas");
		final Proveedor proveedor[] = new Proveedor[1];
		proveedor[0].setCif("D12345324");
		proveedor[0].setNombre("ASD SA");
		final Producto producto[] = new Producto[3];
		for(int i = 0; i< 3; i++) {
			producto[i].setId(i);
			producto[i].setNombre("producto"+i);
			producto[i].setPvp((float)(i*1.5));
			producto[i].setProveedor(proveedor[0]);
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VLogin inst = new VLogin();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

}
