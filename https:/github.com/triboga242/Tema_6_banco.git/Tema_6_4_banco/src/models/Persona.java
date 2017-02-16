package models;

public class Persona {

	private int dni;
	private Cuenta[] cuentas=new Cuenta[3];
	private boolean esMoroso;

	public boolean isEsMoroso() {
		return esMoroso;
	}

	public void setEsMoroso(boolean esMoroso) {
		this.esMoroso = esMoroso;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public Persona(int dni, Cuenta[] cuentas) {
		super();
		this.dni = dni;
		this.cuentas = cuentas;
	}

	public boolean esMoroso(Cuenta[] cuentas){
		for (int i=0; i<cuentas.length-1;i++){
			if ( cuentas[i].esMoroso() ==true) {
				this.esMoroso=(true);
				}
		}
		return esMoroso;
	}
	
	
	
	public void nuevaCuenta(Object cuenta) {
			Cuenta []aux=new Cuenta[cuentas.length];
			
			for (int j=0;j<cuentas.length;j++)
			{
						aux[j]=cuentas[j];		
			}
		    
			if (cuentas.length < 3) {
			
			this.cuentas=new Cuenta [cuentas.length+1];
			for (int j=0;j<aux.length;j++)
			{
								cuentas[j]=aux[j];
			}
			this.cuentas[cuentas.length-1]=(Cuenta) cuenta;
		} else {
			System.out.println("Demasiadas cuentas");
		}
			
	}
	//@Override
	//public String toString(){
	//	String s= ;
	//	return s;
	//}
}
