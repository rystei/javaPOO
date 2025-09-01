package excercicios.ex10;

/*
* Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar
*  esses atributos. Adicione um
* método exibir Detalhes que imprime o título e o autor do livro.
* */

public class MainEx10 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Karina Telles");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhres();
        livro2.exibirDetalhres();
    }
}
