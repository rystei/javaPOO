package excercicios.ex7;

public class MainEx7 {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Gustavo");
        pessoa1.setIdade(21);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("teste2");
        pessoa2.setIdade(14);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos");
        pessoa2.verificarIdade();
    }
}
