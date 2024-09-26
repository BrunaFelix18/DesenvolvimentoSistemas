
package atividade;

import java.util.Scanner;

public class Teste_de_Ansiedade {
	// CRIE UM PROGRAMA CHAMADO TESTE DE ANSIEDADE ONDE O USUÁRIO RESPONDERÁ 10
	// PERGUNTAS ESPECÍFICAS
	// PARA O RESULTADO FINAL. O USUÁRIO PODE RESPONDER APENAS "SIM' OU 'NÃO' PARA
	// CADA PERGUNTA.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 5.Inicialização de um array com valores diretamnete

		String[] perguntas = { "1. Você se sente com dificuldade de concentração?",
				"2. Você se sente cansado facilmente?", "3. Tem dificuldade em adormecer ou permanecer a dormir?",
				"4. Você se preocupa muito com o futuro?", "5. Tem dificuldade em relaxar?",
				"6. Sentiu-se tão preocupado que foi difícil ficar parado?",
				"7. Sentiu-se facilmente irritável ou chateado?",
				"8. Sentiu medo como se algo muito ruim fosse acontecer?",
				"9. Você se preocupa com a opinião dos outros?",
				"10. Você está com dificuldade em lembrar de detalhes?" };

		int Sim = 0;
		System.out.println("Teste de ansiedade, responda as perguntas a seguir com SIM ou NÂO");

		for (String pergunta : perguntas) {
			System.out.println(pergunta);
			String resposta = scanner.nextLine();

			if (resposta.equals("Sim")) {
				Sim++;
			}
		}
		if (Sim <= 7) {
			System.out.println("Você possui fortes indícios de ansiedade, faça terapia! ");
		} else if (Sim == 5 || Sim == 6) {
			System.out.println("Você precisa cuidar do seu corpo de da sua mente, procure orientação.");
		} else {
			System.out.println("Você está aparentemente bem e sem riscos de ansiedade.");
		}
	}
}