import java.util.Random;

public class acoes {

    public static boolean estaVivo(estados tamagosh) {
        boolean vivoAtual = tamagosh.getVivo();
        return vivoAtual;

    }

    public static void alimentar(estados tamagosh) {
        int fomeAtual = tamagosh.getFome();
        int comidasAtual = tamagosh.getComidas();

        if (comidasAtual > 0 && estaVivo(tamagosh)) {
            tamagosh.setFome(Math.max(0, fomeAtual - 10));
            tamagosh.setComidas(comidasAtual - 1);
        } else {
            System.out.println("nao ha comida suficiente");
        }

    }

    public static void brincar(estados tamagosh) {
        Random aleatorio = new Random();

        int cansacoAtual = tamagosh.getCansaco();
        int felicidadeAtual = tamagosh.getFelicidade();
        int fomeAtual = tamagosh.getFome();
        double diastual = tamagosh.getDias();

        boolean forcado = tamagosh.getVivo();

        if (cansacoAtual < 90 && estaVivo(tamagosh)) {
            int valorAleatorio = 7 + aleatorio.nextInt(10);
            tamagosh.setFome(Math.min(100, fomeAtual + valorAleatorio));
            tamagosh.setFelicidade(Math.min(100, felicidadeAtual + 15));
            tamagosh.setCansaco(Math.min(100, cansacoAtual + 10));
            tamagosh.setDias((Math.max(0, diastual + 0.5)));

            System.out
                    .println(" fome: " + tamagosh.getFome() + " felicidade: " + tamagosh.getFelicidade() + " cancaco: "
                            + tamagosh.getCansaco() + " dia: " + tamagosh.getDias());
        } else {
            System.out.println(
                    "o " + tamagosh.getNome() + " esta muito cansado. se forcalo mais uma fez ele ira morrer ");
            if (cansacoAtual >= 100 || !estaVivo(tamagosh) || forcado) {
                System.out.println("o " + tamagosh.getNome() + " morreu por ataque cardiaco ");
                tamagosh.setCansaco(100);
                tamagosh.setFelicidade(0);
                tamagosh.setDias(0);
                tamagosh.setVivo(false);

            }

        }

    }
}
