
public class CuentaAhorro extends CuentaBancaria {

	static double saldoMinimo = 1700;
	
	public CuentaAhorro(String iban, Double saldo) {
		super(iban, saldo);
		}

	@Override
	public void CalcularInteres() {
		if (this.saldo < this.saldoMinimo) {
			this.saldo = this.saldo + (this.saldo*((this.interesAnualBasico/100)/2));
		} else {
			this.saldo = this.saldo + (this.saldo*((this.interesAnualBasico/100)*2));
		}
	}
	
	@Override
	public String toString() {
		return "Cuenta ahorro con iban: "+this.iban+" Saldo: "+this.saldo;
	}
	
}
