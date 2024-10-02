package models;

public class Skate extends Veiculo {
    private String marca;
    private String tipoRodas;

    public Skate(String modelo, int anoFabricacao, String marca, String cor, String tipoRodas) {
        super(modelo, anoFabricacao, marca, cor, 0); // Skates não têm odômetro
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Skate (modelo, ano_fabricacao, marca, cor, tipo_rodas) VALUES ('%s', %d, '%s', '%s', '%s');",
                getModelo(), getAnoFabricacao(), marca, getCor(), tipoRodas);
    }
}

