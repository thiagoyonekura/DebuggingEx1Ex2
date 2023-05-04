import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;


public class Principal {

	public static void main(String[] args) throws IOException {
		Log meuLogger = new Log("Log.txt");
		meuLogger.logger.setLevel(Level.FINE);
		try {
			meuLogger.logger.info("\n O programa iniciou a Calculadora!!");

		} catch (Exception e) {
			meuLogger.logger.severe( "Erro ao iniciar a calculadora!:");
            e.printStackTrace();

		}
		
		try (Scanner leitura = new Scanner(System.in)) {
			Calculadora c = new Calculadora();
			float a = 0, b = 0, resultado = 0;
			String operador;
			System.out.println("Calculadora");
			do {
				System.out.println("Insira o operador +, -, *, /");
				operador = leitura.nextLine();
			} while (!(operador.contains("+") || operador.contains("-") || operador.contains("*")
					|| operador.contains("/")));

			System.out.println("Insira o 1o valor");
			a = leitura.nextFloat();
			System.out.println("Insira o 2o valor");
			b = leitura.nextFloat();

			resultado = c.calcular(a, b, operador.charAt(0));
			if(operador.contains("-")&&(b>a)) {
				meuLogger.logger.info("\n A ordem dos números foi alterada! O usuário inseriu o primeiro número menor que o segundo! ");
				System.out.println("O resultado de " + b + " " + operador + " " + a + " �:" + resultado);
			}else {
				meuLogger.logger.info("\n O número inserido em a é maior que b! Nenhuma alteração foi realizada-! ");
			System.out.println("O resultado de " + a + " " + operador + " " + b + " �:" + resultado);
			}
		}

	}

}
