
public class Calculadora {
	public float calcular(float a, float b, char operacao) {
		float resultado = 0;
		switch (operacao) {
		
		
		case '+': {
			resultado = a + b;			
		break;	
		}
		case '-': {
			if (a > b) {
			    resultado = a - b;
			} else {
			    resultado = b - a;
			}
		break;
		}
		case '/': {
			resultado = a / b;
		break;
		}
		case '*': {
			resultado = a * b;
		break;
		}

		}
		return resultado;

	}
}
