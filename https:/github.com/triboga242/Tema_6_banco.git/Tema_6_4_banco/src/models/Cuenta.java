package models;

public class Cuenta {

	private int num;
	private float saldo;
	private boolean moroso;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cuenta(int num, float saldo) {
		super();
		this.num = num;
		this.saldo = saldo;
	}

	public  boolean esMoroso (){
		if (saldo<0){
			moroso=true;
		}
		return moroso;
	}
	public boolean esMoroso(Cuenta[] cuentas){
		for (int i=0; i<cuentas.length;i++){
			if ( cuentas[i].esMoroso() ==true) {
				this.moroso=(true);
				}
		}
		return moroso;
	}
	public void ingreso( float cantidad){
		this.saldo+=cantidad;
	}
	public void gasto (float cantidad){
		this.saldo-=cantidad;
	}
}
