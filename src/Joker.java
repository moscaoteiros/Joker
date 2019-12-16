import java.util.Scanner;

public class Joker {
    public static void main(String[] args) throws InterruptedException {

        // QUESTION'S RELATED VARIABLES
        String[] questions = Questions.questions.clone();
        String[][] allOptions = Questions.options.clone();
        int[] correctAnswers = Questions.correctAnswers.clone();

        // VARIABLES -----------------------//
        int[] moneyTree = {0, 200, 500, 1000, 3000, 10000, 50000};
        int moneyTreeIndex = 0;
        int jokers = 7;
        Scanner scanner = new Scanner(System.in);

        // GAME OPENING
        Utils.printGreeting("JOKER", "$", false);

        // GAME LOOP
        // For loop
            // Imprimir Status
            // Imprimir Questões

            // Definir array de booleans para indicar quais opções de respostas serão apresentadas.
            // Definir variável de controle do Do-While loop abaixo

            // Do-While loop
                // Imprimir Opções de Respostas
                // Se o Concorrente escolher uma das opções
                    // Atualizar a variável de controle do Do-While loop para interrompê-lo
                    // Se a resposta do Concorrente estiver correta
                        // Atualizar os valores adequados
                        // Prover feedback ao Concorrente
                    // Se a resposta do Concorrente estiver errada
                        // Penalizar os valores adequados (dica: são dois valores; considerar um array – veja o método `penalizePlayer()`)
                        // Prover feedback ao Concorrente
                // Senão Se o Concorrente escolher um Joker
                    // Se houver Joker disponível
                        // Alterar o array de booleans que indica as opções a serem apresentadas (omitir uma incorreta)
                        // Atualizar o número de Jokers (atenção para o valor não ser negativo)
                    // Senão
                        // Prover feedback ao Concorrente de que não há Jokers
                // Senão
                    // Prover feedback de que o input não é válido.

        // Imprimir conclusão do Jogo
    }

    static void printStatus(int round, int moneyEarned, int jokers) {}

    static void printQuestion(int round, String question) {}

    static void printOptions(String[] options, boolean[] includedOptions) {}

    static int readAnswer(Scanner scanner) {}

    static void printOutcomeMessage(boolean answerIsCorrect) {}

    static boolean[] applyJoker(boolean[] includedOptions, int correctAnswer) {}

    static int safelyDecreaseJoker(int jokers) {}

    static int[] penalizePlayer(int jokers, int moneyTreeIndex) {}

    static void printConclusion(int moneyEarned, int jokers) {}
}
