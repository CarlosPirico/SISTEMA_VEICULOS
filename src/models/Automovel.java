package models;

//criando uma subclasse com herdando da metodos e construtores da superclasse veiculo.
public class Automovel extends Veiculo {
	
	// criando os atributos
    private int quantidadePassageiros;
    private String tipoFreio;
    private boolean airbag;

    // construtor de subclasse herdando o construtor da superclasse.
    public Automovel(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem, int quantidadePassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadePassageiros = quantidadePassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    // sobrescrevendo o metodo gerarInsert para que atenda essa classe e adicionando o @override
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Automovel (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_passageiros, tipo_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), quantidadePassageiros, tipoFreio, airbag);
    }
}

