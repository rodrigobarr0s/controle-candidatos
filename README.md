# Processo Seletivo

Este projeto simula um processo seletivo onde um conjunto de candidatos é avaliado com base no salário pretendido e em tentativas de contato. O sistema seleciona candidatos com base em uma comparação do salário pretendido com o salário base da vaga e realiza tentativas de contato para os candidatos selecionados.

## Funcionalidades

- **Seleção de candidatos**: A seleção é feita com base no salário pretendido. Candidatos com salários menores ou iguais ao salário base são selecionados.
- **Tentativas de contato**: O sistema tenta realizar o contato com os candidatos selecionados. São feitas até 3 tentativas, e o sistema indica se o contato foi bem-sucedido ou não.
- **Cálculo aleatório do salário pretendido**: O salário pretendido por cada candidato é gerado de forma aleatória, variando entre R$ 1800,00 e R$ 2200,00.
- **Impressão de resultados**: O sistema imprime quais candidatos foram selecionados e o resultado de cada tentativa de contato.

## Como executar

1. Certifique-se de ter o **Java** instalado em seu computador.
2. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/projeto-processo-seletivo.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd projeto-processo-seletivo
   ```
4. Compile o código:
   ```bash
   javac candidatura/ProcessoSeletivo.java
   ```
5. Execute o programa:
   ```bash
   java candidatura.ProcessoSeletivo
   ```

## Estrutura do Projeto

```
projeto-processo-seletivo/
├── candidatura/
│   └── ProcessoSeletivo.java
└── README.md
```

- `ProcessoSeletivo.java`: Contém o código principal que simula o processo seletivo, incluindo a seleção de candidatos e as tentativas de contato.
- `README.md`: Este arquivo de documentação.

## Contribuições

Sinta-se à vontade para contribuir com melhorias para este projeto. Se encontrar algum bug ou tiver sugestões de melhorias, crie uma *issue* ou envie um *pull request*.
