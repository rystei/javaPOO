package excercicios.ex3;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numAvaliacao;


    void fichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento " + anoDeLancamento);
    }

    void avaliacao(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacao++;
    }

    double pegarMediaNotas() {
        return somaDasAvaliacoes / numAvaliacao;
    }
}
