import java.util.Scanner;

public interface tama {

    public static void main(String[] args) {
        estados meuTamagoshi = estados.criarTamagoshi();

        Scanner scanner = new Scanner(System.in);

        TamagotchiManager gerenciador = new TamagotchiManager();
        gerenciador.executarJogo(meuTamagoshi, scanner);

        scanner.close();
    }

}