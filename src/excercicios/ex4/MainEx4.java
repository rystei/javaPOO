package excercicios.ex4;

public class MainEx4 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.modelo = "civic";
        carro.ano = 2020;
        carro.cor = "branco";

        carro.fichaTecnica();

        System.out.println("Idade do carro: " + carro.anoDoCarro() + " anos");
    }
}
