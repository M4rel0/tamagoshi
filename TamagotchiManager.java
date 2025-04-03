import java.util.Scanner;

public class TamagotchiManager {

    public void executarJogo(estados meuTamagoshi, Scanner scanner) {
        while (true) {

            System.out.println(meuTamagoshi.getNome());
            System.out.println(meuTamagoshi.estadosAtuais());

            if (!meuTamagoshi.getVivo()) { // Se estiver morto, encerra o jogo
                System.out.println("Seu Tamagotchi não está mais vivo. Fim de jogo.");
                break;
            }

            System.out.println("\nMenu:");
            System.out.println("1 - Comer");
            System.out.println("2 - Dormir");
            System.out.println("3 - Beber água");
            System.out.println("4 - Brincar");
            System.out.println("5 - Fazer carinho");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String escolha = scanner.nextLine().trim();

            switch (escolha) {
                case "1" -> {
                    System.out.println("Você alimentou seu Tamagotchi!");
                    acoes.alimentar(meuTamagoshi);
                }
                case "2" -> {
                    System.out.println("Seu Tamagotchi foi dormir!");
                    acoes.dormir(meuTamagoshi);
                }
                case "3" -> {
                    System.out.println("Seu Tamagotchi bebeu água!");
                    acoes.tomarAgua(meuTamagoshi);
                }
                case "4" -> {
                    System.out.println("Seu Tamagotchi está brincando!");
                    acoes.brincar(meuTamagoshi);
                }
                case "5" -> {
                    System.out.println("Seu Tamagotchi adorou o carinho!");
                    acoes.fazerCarinho(meuTamagoshi);
                }
                case "0" -> {
                    System.out.println("Saindo do programa...");
                    System.out.println("De Tchau para seu amiguinho!");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
