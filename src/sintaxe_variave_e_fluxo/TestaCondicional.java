package sintaxe_variave_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadeDePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar, pois est� acompanhado");
			} else {
				System.out.println("infelizmente Voc� n�o pode entrar");
			}
		}
	}
}
