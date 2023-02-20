package sintaxe_variave_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("Valor acompanhado = " + acompanhado );
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente Você não pode entrar");
		}
	}
}
