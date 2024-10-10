package models;

//criando uma subclasse com herdando da metodos e construtores da superclasse veiculo.
public class Motocicleta extends Veiculo {
	
	// criando os atributos
    private int cilindrada;
    private double torque;

    // construtor de subclasse herdando o construtor da superclasse.
    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem, int cilindrada, double torque) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.cilindrada = cilindrada;
        this.torque = torque;
    }

    // sobrescrevendo o metodo gerarInsert para que atenda essa classe e adicionando o @override
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Motocicleta (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), cilindrada, torque);
    }
}

