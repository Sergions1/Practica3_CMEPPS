package pkg;

public class Cuenta {
	
	
	String numero;
	String titular;
	Double saldo;
	
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double i) {
		this.saldo = 500.0;
		
	}
	
	public Cuenta(double i) {
			
		}
	
	public void retirar(double i) {
		this.saldo = -500.0;
		
	}


	
}
