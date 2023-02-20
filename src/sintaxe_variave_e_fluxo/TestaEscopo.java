package sintaxe_variave_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		 
		
		int quantidadePessoas = 3;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
			}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		}

}
