package models;

//criando uma subclasse com herdando da metodos e construtores da superclasse veiculo.
public class Bicicleta extends Veiculo {
	
	// criando os atributos
    private String marca;
    private String material;
    private int quantidadeMarchas;
    private boolean amortecedor;

    // construtor de subclasse herdando o construtor da superclasse.
    public Bicicleta(String modelo, int anoFabricacao, String marca, String cor, String material, int quantidadeMarchas, boolean amortecedor) {
        super(modelo, anoFabricacao, marca, cor, 0); // Bicicletas não têm odômetro
        this.marca = marca;
        this.material = material;
        this.quantidadeMarchas = quantidadeMarchas;
        this.amortecedor = amortecedor;
    }

    // sobrescrevendo o metodo gerarInsert para que atenda essa classe e adicionando o @override
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao, marca, cor, material, quantidade_marchas, amortecedor) VALUES ('%s', %d, '%s', '%s', '%s', %d, %b);",
                getModelo(), getAnoFabricacao(), marca, getCor(), material, quantidadeMarchas, amortecedor);
    }
}
