package models;

public class Automovel extends Veiculo {
    private int quantidadePassageiros;
    private String tipoFreio;
    private boolean airbag;

    public Automovel(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
                     int quantidadePassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadePassageiros = quantidadePassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Automovel (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_passageiros, tipo_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), quantidadePassageiros, tipoFreio, airbag);
    }
}

