package getAndset;

public class Curso {
	private String nombreCurso;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
		this.nombreCurso = nombreCurso;
		setNotas(nota1, nota2, nota3);
	}
	
	public void setNotas(double nota1, double nota2, double nota3) {
		if (nota1 < 0 || nota1 > 100 || nota2<0 || nota2 > 100 || nota3 < 0 || nota3 > 100) {
			throw new IllegalArgumentException("Las notas deben estar dentro de un rago de 0 a 100");
		}
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
			
		}
	 
	public double calcularPromedio() {
		return (nota1 + nota2 + nota3)/3;
	}
	
	public void mostrar() {
		String estado = calcularPromedio() >= 61 ? "Aprobado" :  "Reprobado";
		System.out.println("Curso" + nombreCurso + " | Promedio" + String.format("%2f", calcularPromedio()) + " | Estado:" + estado);
	}

}
