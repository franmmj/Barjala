
public class Dni {
	String numero;
	String letra;

public Dni(String dni)
	{
	Boolean o;
	o=validar(dni);
	if (o)
		{
		this.numero=dni.substring(0,dni.length()-1);
		this.letra=dni.substring(dni.length()-1,1);
		}
	
	
	}
	

private Boolean validar(String dni) 
	{
	int numero = dni.substr(0,dni.length-1);
	char let = dni.substr(dni.length-1,1);
	numero = numero % 23;
	letra='TRWAGMYFPDXBNJZSQVHLCKET';
	char letra=letra.substring(numero,numero+1);
	if (letra!=let)
	else
	var nie = this.toUpperCase();
	    var pre = nie.substr(0, 1);
	    var prev = '0';
	    if (pre == 'X')
	       prev = '0';
	    else if (pre == 'Y')
	       prev = '1';
	    else if (pre == 'Z')
	       prev = '2';
	    numero = prev + nie.substr(1,nie.length-1);
	if (prev!=numero)
		{
		alert('DNI/NIE erroneo, vuelva a intentarlo');
		return false;
		}
	else
		{
		alert('DNI/NIE CORRECTO !!, continue con el formulario');
		return true;
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





