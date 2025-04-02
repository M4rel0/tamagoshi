import java.util.Random;

public class estados {
    private double dias;
    private int fome;
    private int idade;
    private int comidas;
    private final String nome;
    private int cansaco;
    private int felicidade;
    private boolean vivo;

    public estados(int fome, int idade, int comidas, String nome, int cansaco, int felicidade, double dias,
            boolean vivo) {
        this.fome = fome;
        this.idade = idade;
        this.comidas = comidas;
        this.nome = nome;
        this.cansaco = cansaco;
        this.felicidade = felicidade;
        this.dias = dias;
        this.vivo = vivo;
    }

    public static estados criarTamagoshi() {
        Random aleatorio = new Random();
        String[] nomesAleatorios = { "josecleiton", "farilson", "piscadilson", "wellinton", "claretil", "bolsotralha",
                "marogilsen", "vocitilde" };
        String nomeAleatorio = nomesAleatorios[aleatorio.nextInt(nomesAleatorios.length)];

        int fome = 50;
        int idade = 0;
        int comidas = 5;
        int cansaco = 20;
        int felicidade = 80;
        int dias = 0;
        boolean vivo = true;

        return new estados(fome, idade, comidas, nomeAleatorio, cansaco, felicidade, dias, vivo);
    }

    public int getCansaco() {
        return cansaco;
    }

    public int getComidas() {
        return comidas;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public int getFome() {
        return fome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getDias() {
        return dias;
    }

    public boolean getVivo() {
        return vivo;
    }

    public String estadosAtuais() {
        return String.format("Cansaço: %d, Comidas: %d, Dias: %.2f, Felicidade: %d, Fome: %d",
                getCansaco(), getComidas(), getDias(), getFelicidade(), getFome());
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setComidas(int comidas) {
        this.comidas = comidas;
    }

    public void setCansaco(int cansaco) {
        this.cansaco = cansaco;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

}