package models;

public class Bicicleta extends Veiculo {
    private String marca;
    private String material;
    private int quantidadeMarchas;
    private boolean amortecedor;

    public Bicicleta(String modelo, int anoFabricacao, String marca, String cor, String material,
                     int quantidadeMarchas, boolean amortecedor) {
        super(modelo, anoFabricacao, marca, cor, 0); // Bicicletas não têm odômetro
        this.marca = marca;
        this.material = material;
        this.quantidadeMarchas = quantidadeMarchas;
        this.amortecedor = amortecedor;
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao, marca, cor, material, quantidade_marchas, amortecedor) VALUES ('%s', %d, '%s', '%s', '%s', %d, %b);",
                getModelo(), getAnoFabricacao(), marca, getCor(), material, quantidadeMarchas, amortecedor);
    }
}
