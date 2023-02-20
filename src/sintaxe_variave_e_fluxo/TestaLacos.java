package sintaxe_variave_e_fluxo;

public class TestaLacos {
	public static void main(String[] args) {
		int numeroDaTabuada = 1;

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

			System.out.print("tabuada do número " + numeroDaTabuada++  + "-");

			for (int contador = 1; contador <= 10; contador++) {

				System.out.print(" " + multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();

		}
	}

}
