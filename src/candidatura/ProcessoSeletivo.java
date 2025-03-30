package candidatura;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void analisarCandidatura(double salarioPretendido) {
		double salarioBase = 2000.0;

		// Verificar se o salário pretendido é menor, igual ou maior que o salário base.
		if (salarioPretendido < salarioBase) {
			System.out.println("Ligar para o candidato!");
			
		} else if (salarioPretendido == salarioBase) {
			System.out.println("Ligar para o candidato com contraproposta!");
			
		} else {
			System.out.println("Aguardando o resultado dos demais candidatos!");
		}
	}

}
