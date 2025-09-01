import br.com.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        System.out.println("média de avaliações do filme: " + meuFilme.pegaMedia());

    }
}
