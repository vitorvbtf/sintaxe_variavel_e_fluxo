package sintaxe_variave_e_fluxo;

public class ExercicioImpostoDeRenda {
	public static void main(String[] args) {

		int deducao = 0;
		double salario = 3900.0;
		if (salario >= 1900.0 && salario <= 2800.0) {
		deducao = 142;
		System.out.println("Com esse salário a dedução vai ser " + deducao);
		}
		else if(salario >= 2800.01 && salario <= 3751.0) {
			deducao = 350;
			System.out.println("Com esse salário a dedução vai ser " + deducao);
		}else if(salario >= 3751.01 && salario <= 4664.00) {
			deducao = 636;
			System.out.println("Com esse salário a dedução vai ser " + deducao);
		} else {
			System.out.println("Valor de dedução não informado");
		}
	}	
}
