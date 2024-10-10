package app;

// importando todas as classes do pacote models.
import models.*;

public class Main {
    public static void main(String[] args) {
        // Criando objetos de diferentes veículos
        Automovel automovel = new Automovel("Fusca", 1980, "Volkswagen", "azul", 150000, 4, "hidráulico", true);
        Motocicleta motocicleta = new Motocicleta("CB500", 2022, "Honda", "vermelha", 5000, 500, 40.5);
        Caminhao caminhao = new Caminhao("Volvo FH", 2018, "Volvo", "branco", 100000, 6, 18000);
        Bicicleta bicicleta = new Bicicleta("Speedster", 2021, "Trek", "preta", "carbono", 21, true);
        Skate skate = new Skate("Skateboard Pro", 2020, "Element", "preto", "duro");

        // Exibindo comandos INSERT
        System.out.println(automovel.gerarInsert());
        System.out.println(motocicleta.gerarInsert());
        System.out.println(caminhao.gerarInsert());
        System.out.println(bicicleta.gerarInsert());
        System.out.println(skate.gerarInsert());
    }
}

