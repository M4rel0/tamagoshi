import java.util.Scanner;

public interface tama {

    public static void main(String[] args) {

        estados meuTamagoshi = estados.criarTamagoshi();

        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            meuTamagoshi.setVivo(false);
            System.out.println(meuTamagoshi.getNome());
            System.out.println(meuTamagoshi.estadosAtuais());

            if (meuTamagoshi.getVivo()) {
                break;
            } else {
                System.out.println("\nMenu:");
                System.out.println("1 - comer");
                System.out.println("2 - dormir");
                System.out.println("3 - beber agua");
                System.out.println("4 - brincar");
                System.out.println("5 - fazer carinho");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                String escolha = scanner.nextLine().trim();
                switch (escolha) {
                    case "1" -> {
                        System.out.println("Você escolheu a opção 1!");
                    }
                    case "2" -> {
                        System.out.println("Você escolheu a opção 2!");
                    }
                    case "3" -> {
                        System.out.println("Você escolheu a opção 2!");
                    }
                    case "4" -> {
                        System.out.println("Você escolheu a opção 2!");
                    }
                    case "5" -> {
                        System.out.println("Você escolheu a opção 2!");
                    }
                    case "0" -> {
                        System.out.println("Saindo do programa...");
                        return;
                    }
                    default -> {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                }

            }
        }
        scanner.close();
    }

}