package getAndset;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private int pin;
	
	public CuentaBancaria(String titular, double saldo, int pin) {
		this.titular = titular;
		this.saldo = saldo;
		this.pin = pin;
	}
	
	public void retirar(double monto, int pinIngresado) {
		if (pinIngresado != this.pin) throw new SecurityException("PIN incorrecto");
		if (monto > this.saldo) throw new RuntimeException("Saldo insuficiente");
		this.saldo -= monto;
	}
	
	public void mostrar() {
		System.out.println("Titular:" + titular + "Saldo:" + saldo);
	}

}
