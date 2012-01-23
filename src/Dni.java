
public class Dni {
	String numero;
	String letra;

	public Dni(String dni) {
		//if (validar(dni)) {

		this.numero = new String(dni.substring(0,dni.length() -1));
		this.letra = new String(dni.substring(dni.length() - 1, dni.length()));
		/*} else {
			System.out.println("DNI erróneo");
		}*/

	}

	private boolean validar(String dni) {
		String numero = dni.substring(0, dni.length() - 1);
		String let = dni.substring(dni.length() - 1, dni.length());

		int num = new Integer(numero) % 23;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKET";
		String aux = letras.substring(num, num + 1);
		if (let.equals(aux)) {
			System.out
					.println("DNI/NIE CORRECTO !!, continue con el formulario");
			return true;
		} else {
			System.out.println("DNI/NIE erroneo, vuelva a intentarlo");
			return false;
		}

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

}
