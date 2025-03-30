package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		selecaoCandidatos();
	}

	public static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        String[] candidatosSelecionados = new String[5];  // Array para armazenar os candidatos selecionados
        int candidatosSelecionadosCount = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        // Enquanto não selecionar 5 candidatos, continua a seleção
        while (candidatosSelecionadosCount < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            // Exibe o salário pretendido do candidato
            System.out.printf("O candidato %s solicitou este valor de salario R$ %.2f\n", candidato, salarioPretendido);

            // Verifica se o salário pretendido é menor ou igual ao salário base
            if (salarioPretendido <= salarioBase) {
                System.out.printf("O candidato %s foi selecionado para a vaga.\n\n", candidato);

                // Armazena o candidato selecionado no array
                candidatosSelecionados[candidatosSelecionadosCount] = candidato;
                candidatosSelecionadosCount++;  // Incrementa a quantidade de candidatos selecionados
            }

            candidatoAtual++;  // Avança para o próximo candidato
        }

        // Caso o número de candidatos selecionados seja menor que 5
        if (candidatosSelecionadosCount < 5) {
            System.out.println("Não foi possível selecionar 5 candidatos.");
        }

        // Imprimir os candidatos selecionados após a seleção
        imprimirCandidatosSelecionados(candidatosSelecionados, candidatosSelecionadosCount);
    }

    private static double valorPretendido() {
        // Gera um valor aleatório entre 1800.00 e 2200.00 para o salário pretendido
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
    
 // Método para imprimir os candidatos selecionados
    private static void imprimirCandidatosSelecionados(String[] candidatosSelecionados, int candidatosSelecionadosCount) {
        System.out.println("Candidatos selecionados:");
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

}
