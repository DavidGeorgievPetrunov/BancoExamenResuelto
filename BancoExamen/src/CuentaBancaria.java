
public abstract class CuentaBancaria {

	String iban;
	Double saldo;
	static double interesAnualBasico = 12.5;
	
	public CuentaBancaria(	String iban, Double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}

//	No voy a crear el set InteresAnualBascio porque es una constante
	
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public static double getInteresAnualBasico() {
		return interesAnualBasico;
	}
	
	public void ingresar(double saldo) {
		this.saldo = this.saldo + saldo;
	}
	
	public void retirar(double saldo) {
		this.saldo = this.saldo - saldo;
	}
	
	public void transpaso(CuentaBancaria Cuenta, double saldo) {
		retirar(saldo);
		Cuenta.ingresar(saldo);
		
	}
	
	public void CalcularInteres() {
		
	}
	
	@Override
	public String toString() {
		return "Cuenta bancaria: "+this.iban+" tiene saldo: "+this.saldo;
	}
	
}
