package edilson;

public class edilson {
	//0.77 maior que o valor do alcoo printf gasolina � melhor
	public static void main(String[]args) {
		
		double alcool = 2.74;
		double gasolina = 4.16;
		double valor = 0;
		valor = gasolina * 0.77;
		
		if(valor > alcool) {
			System.out.println("Gasolina � melhor!");
		}
		else if(valor < alcool){
			System.out.println("�lcool � melhor!");
		}
		else {
			System.out.println("Gasolina e �lcool s�o equivalentes!");
		}
	}
}
