package models;

// criando uma superclasse.
public abstract class Veiculo {
	// criando os atributos.
    private String modelo;
    private int anoFabricacao;
    private String montadora;
    private String cor;
    private double kilometragem;

    // criando o construtor da superclasse.
    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem) {
        // validação caso não seja enviado o modelo.
    	if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo é obrigatório.");
        }
    	// validação  de ano de fabricação.
        if (anoFabricacao <= 1885) { // 1886 é considerado o ano do primeiro automóvel.
            throw new IllegalArgumentException("Ano de fabricação deve ser maior que 1885.");
        }

        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }
    
    // metodo para retornar
    public String getModelo() {
        return modelo;
    }

    // metodo para retornar
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // metodo para retornar
    public String getMontadora() {
        return montadora;
    }
    
    // metodo para retornar
    public String getCor() {
        return cor;
    }

    // metodo para retornar
    public double getKilometragem() {
        return kilometragem;
    }

    // metodo para retornar
    public abstract String gerarInsert();
}

