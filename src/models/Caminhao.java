package models;

//criando uma subclasse com herdando da metodos e construtores da superclasse veiculo.
public class Caminhao extends Veiculo {
	
	// criando os atributos
    private int quantidadeEixos;
    private double pesoBruto;

    // construtor de subclasse herdando o construtor da superclasse.
    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem, int quantidadeEixos, double pesoBruto) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadeEixos = quantidadeEixos;
        this.pesoBruto = pesoBruto;
    }

    // sobrescrevendo o metodo gerarInsert para que atenda essa classe e adicionando o @override
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Caminhao (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_eixos, peso_bruto) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), quantidadeEixos, pesoBruto);
    }
}

