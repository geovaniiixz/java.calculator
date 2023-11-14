package calculadorageovani;

public class calculadora {
	
	static int soma (int num1, int num2) {
		int sm = num1+ num2;
		return sm;
				
	}
	static int divisao(int num1 , int num2) {
		int div = (num1/num2);
		return div;
		
		
	}
	public static void main (String[] args) {
		System.out.print("digite algo: ");
		int resultadosm = soma(5,3);
		int resultadodiv = divisao(10,2);
		
		
		System.out.println("o resultado e: " + resultadosm);
		System.out.println("o resultado e: " + resultadodiv);
			
	}
	
}	
