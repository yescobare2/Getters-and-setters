package getAndset;

public class Termometro {
    private double celsius;
    
    public Termometro(double celsius) {
       setCelsius(celsius);
    	
    }
    
    public void setCelsius(double celsius) {
    	if (celsius < -273015) throw new IllegalArgumentException("Temperatura debajo del cero absoluto");
    	this.celsius = celsius;
    }
    
    public double getFahrenheit() {return (celsius * 9/5) + 32;}
    
    public void mostrar() {
    	System.out.println("Temperatura: " + celsius + "°C | " + getFahrenheit() + "°F");
    }
   
}
