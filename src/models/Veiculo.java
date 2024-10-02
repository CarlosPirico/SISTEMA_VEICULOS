package models;

public abstract class Veiculo {
    private String modelo;
    private int anoFabricacao;
    private String montadora;
    private String cor;
    private double kilometragem;

    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo é obrigatório.");
        }
        if (anoFabricacao <= 1885) { // 1886 é considerado o ano do primeiro automóvel
            throw new IllegalArgumentException("Ano de fabricação deve ser maior que 1885.");
        }

        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getMontadora() {
        return montadora;
    }

    public String getCor() {
        return cor;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public abstract String gerarInsert();
}

