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
        int sedeAtual = tamagosh.getSede();
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
            tamagosh.setDias((Math.max(0, diastual + 0.4)));
            tamagosh.setSede(Math.min(100, sedeAtual + 6));

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

    public static void dormir(estados tamagosh) {
        Random aleatorio = new Random();
        int cansacoAtual = tamagosh.getCansaco();
        int felicidadeAtual = tamagosh.getFelicidade();
        int fomeAtual = tamagosh.getFome();
        int sedeAtual = tamagosh.getSede();
        double diastual = tamagosh.getDias();

        if (estaVivo(tamagosh)) {
            tamagosh.setFome(Math.min(100, fomeAtual + 7));
            tamagosh.setCansaco(Math.max(0, cansacoAtual - (6 + aleatorio.nextInt(12))));
            tamagosh.setDias(diastual + 0.5);
            tamagosh.setFelicidade(Math.min(100, felicidadeAtual + (3 + aleatorio.nextInt(5))));
            tamagosh.setSede(Math.min(100, sedeAtual + 6));
        }

    }

    public static void tomarAgua(estados tamagosh) {

        Random aleatorio = new Random();
        int felicidadeAtual = tamagosh.getFelicidade();
        int fomeAtual = tamagosh.getFome();
        int sedeAtual = tamagosh.getSede();
        double diastual = tamagosh.getDias();
        if (estaVivo(tamagosh)) {
            tamagosh.setSede(Math.max(0, sedeAtual + (-3 - aleatorio.nextInt(5))));
            tamagosh.setFome(Math.max(0, fomeAtual - 1));
            tamagosh.setFelicidade(Math.min(100, felicidadeAtual + 1));
            tamagosh.setDias(diastual + 0.1);
        }

    }

    public static void fazerCarinho(estados tamagosh) {
        Random aleatorio = new Random();
        int felicidadeAtual = tamagosh.getFelicidade();
        double diastual = tamagosh.getDias();
        int cansacoAtual = tamagosh.getCansaco();
        if (estaVivo(tamagosh)) {
            tamagosh.setFelicidade(Math.min(100, felicidadeAtual + (9 + aleatorio.nextInt(6))));
            tamagosh.setDias(diastual + 0.2);
            tamagosh.setCansaco(Math.max(0, cansacoAtual - (1 + aleatorio.nextInt(3))));
        }
    }
}
