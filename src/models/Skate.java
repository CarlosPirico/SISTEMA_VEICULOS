package models;

// criando uma subclasse com herdando da metodos e construtores da superclasse veiculo.
public class Skate extends Veiculo {
	
	// criando os atributos
    private String marca;
    private String tipoRodas;

    // construtor de subclasse herdando o construtor da superclasse.
    public Skate(String modelo, int anoFabricacao, String marca, String cor, String tipoRodas) {
        super(modelo, anoFabricacao, marca, cor, 0); // Skates não têm odômetro
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    // sobrescrevendo o metodo gerarInsert para que atenda essa classe e adicionando o @override
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Skate (modelo, ano_fabricacao, marca, cor, tipo_rodas) VALUES ('%s', %d, '%s', '%s', '%s');",
                getModelo(), getAnoFabricacao(), marca, getCor(), tipoRodas);
    }
}

