package excercicios.ex4;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro " + ano);
        System.out.println("Cor do carro " + cor);
    }

    int anoDoCarro() {
        return 2023 - ano;
    }
}
