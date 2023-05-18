
public class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(String iban, Double saldo) {
		super(iban, saldo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void CalcularInteres() {
		this.saldo = this.saldo + (this.saldo*(this.interesAnualBasico/100));
	}
	
	@Override
	public String toString() {
		return "Cuenta corriente con iban: "+this.iban+" Saldo: "+this.saldo;
	}

}
