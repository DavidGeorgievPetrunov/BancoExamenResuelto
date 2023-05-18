public class 
 {

	public static void main(String[] args) {
		
		CuentaCorriente CC = new CuentaCorriente("ES6256465847", 1000.0);
		CuentaAhorro CA = new CuentaAhorro("ES9956415656", 3010.0);
		
		System.out.println(CC.toString());
		System.out.println(CA.toString());
		
		CC.transpaso(CA, 300);
		
		System.out.println(CC.toString());
		System.out.println(CA.toString());
		
		CC.ingresar(500);
		CA.retirar(300);
		
		System.out.println(CC.toString());
		System.out.println(CA.toString());
		
		CC.CalcularInteres();
		CA.CalcularInteres();		
		
		System.out.println(CC.toString());
		System.out.println(CA.toString());

	}

}
