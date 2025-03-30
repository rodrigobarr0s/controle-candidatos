package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	// Definir um valor constante para tentativas
	private static final int MAX_TENTATIVAS = 3;

	public static void main(String[] args) {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
				"Daniela", "Jorge" };
		String[] candidatosSelecionados = new String[5]; // Array para armazenar os candidatos selecionados

		// Chama o método de seleção de candidatos
		selecionarCandidatos(candidatos, candidatosSelecionados);

		// Agora, chama o método de entrar em contato para cada candidato selecionado
		System.out.println("\nEntrando em contato com os candidatos selecionados...");
		for (String candidato : candidatosSelecionados) {
			if (candidato != null) { // Verifica se o candidato não é nulo
				entrarEmContato(candidato); // Chama o método para entrar em contato
			}
		}
	}

	public static void selecionarCandidatos(String[] candidatos, String[] candidatosSelecionados) {
		int candidatosSelecionadosCount = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;

		// Enquanto não selecionar 5 candidatos, continua a seleção
		while (candidatosSelecionadosCount < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			// Exibe o salário pretendido do candidato
			System.out.printf("\nO candidato %s solicitou este valor de salario R$ %.2f\n", candidato, salarioPretendido);

			// Verifica se o salário pretendido é menor ou igual ao salário base
			if (salarioPretendido <= salarioBase) {
				System.out.printf("O candidato %s foi selecionado para a vaga.\n", candidato);

				// Armazena o candidato selecionado no array
				candidatosSelecionados[candidatosSelecionadosCount] = candidato;
				candidatosSelecionadosCount++; // Incrementa a quantidade de candidatos selecionados
			}

			candidatoAtual++; // Avança para o próximo candidato
		}

		// Caso o número de candidatos selecionados seja menor que 5
		if (candidatosSelecionadosCount < 5) {
			System.out.println("\nNão foi possível selecionar 5 candidatos.");
		}

		// Imprimir os candidatos selecionados após a seleção
		imprimirCandidatosSelecionados(candidatosSelecionados, candidatosSelecionadosCount);
	}

	private static double valorPretendido() {
		// Gera um valor aleatório entre 1800.00 e 2200.00 para o salário pretendido
		return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
	}

	// Método para imprimir os candidatos selecionados
	private static void imprimirCandidatosSelecionados(String[] candidatosSelecionados,
			int candidatosSelecionadosCount) {
		System.out.println("\nCandidatos selecionados:");
		for (int i = 0; i < candidatosSelecionadosCount; i++) {
			System.out.println(candidatosSelecionados[i]);
		}
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

	public static void entrarEmContato(String candidato) {
		int tentativasRealizadas = 0;
		boolean atendeu = false;

		// Limitar tentativas até o número máximo definido
		while (tentativasRealizadas < MAX_TENTATIVAS && !atendeu) {
			tentativasRealizadas++;
			atendeu = atender();

		}

		// Imprime se o contato foi bem-sucedido ou não
		if (atendeu) {
			System.out.println("\nContato realizado com sucesso!");
			System.out.printf("Conseguimos contato com %s na %dª tentativa!\n", candidato, tentativasRealizadas);
		} else {
			System.out.printf("\nNão conseguimos contato com %s, número de tentativas %d realizadas!\n", candidato,
					tentativasRealizadas);
		}

	}

	public static boolean atender() {
		return ThreadLocalRandom.current().nextInt(3) == 1;
	}
}
