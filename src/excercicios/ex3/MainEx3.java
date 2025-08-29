package excercicios.ex3;

public class MainEx3 {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Nome da Música";
        musica.artista = "Nome do Artista";
        musica.anoDeLancamento = 2025;

        musica.fichaTecnica();

        musica.avaliacao(4.5);
        musica.avaliacao(3.2);
        musica.avaliacao(5.0);

        double mediaAvaliacoes = musica.pegarMediaNotas();
        System.out.println("Média das avalições: " + mediaAvaliacoes);
    }
}
