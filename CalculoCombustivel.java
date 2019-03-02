package aula2;

public class CalculoCombustivel {
	
		//0.77 maior que o valor do alcoo printf gasolina é melhor
	
		public static void main(String[]args) {
			
			double alcool = 2.74;
			double gasolina = 4.16;
			double valor = 0;
			valor = gasolina * 0.77;
			
			if(valor > alcool) {
				System.out.println("Álcool é melhor!");
			}
			else if(valor < alcool){
				System.out.println("Gasolina é melhor!");
			}
			else {
				System.out.println("Gasolina e álcool são equivalentes!");
			}
		}
	}