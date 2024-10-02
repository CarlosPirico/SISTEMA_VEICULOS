package models;

public class Motocicleta extends Veiculo {
    private int cilindrada;
    private double torque;

    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
                       int cilindrada, double torque) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.cilindrada = cilindrada;
        this.torque = torque;
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Motocicleta (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), cilindrada, torque);
    }
}

