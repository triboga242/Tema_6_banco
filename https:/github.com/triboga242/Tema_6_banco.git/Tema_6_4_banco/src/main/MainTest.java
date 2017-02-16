package main;
import models.Cuenta;
import models.Persona;
public class MainTest {

	public static void main(String[] args) {

		Cuenta a1= new Cuenta(123456, 0);
		Cuenta a2= new Cuenta(456789, 0);
		Cuenta dePepe[]={a1,a2};
	    
		
		Persona a= new Persona(123, dePepe);	
			
			
			a2.ingreso(700);
			
			System.out.println("Es moroso?" + a. esMoroso(dePepe)); 


			a1.ingreso(1100);
			a2.gasto(750);
			
			System.out.println("Es moroso?" + a. esMoroso(dePepe)); 
			a.nuevaCuenta(new Cuenta(000000,0));
			
			a.nuevaCuenta(new Cuenta(111111, 0));
			
		}
}
