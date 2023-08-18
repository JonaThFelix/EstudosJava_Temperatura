package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) * 5/9 = ºC
		
		double f = 86; // variável double (float)
		final int TrintaeDois = 32; // constante armazenando valor fixo, inteiro
		final double Divisao = 5/9.0; // constante armazenando valor flutuante, float
		
		double Celsius = (f - TrintaeDois) * Divisao; // var recebendo formulação acima
		
		System.out.println("A temperatura de F para C eh: "+ Celsius + " C");
	}
}
