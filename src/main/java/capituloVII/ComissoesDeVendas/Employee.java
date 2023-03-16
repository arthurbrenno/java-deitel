package capituloVII.ComissoesDeVendas;

public class Employee {
    private static final double SALARIO_SEMANAL = 200;
    private double vendasBrutas;
    private static double PERCENTUAL = 9;
    private final double salarioFinal = SALARIO_SEMANAL + (vendasBrutas * (PERCENTUAL / 100));

    public Employee(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public void setPercentual(double PERCENTUAL) {
        Employee.PERCENTUAL = PERCENTUAL;
    }

    public double getSalarioFinal() {
        return this.salarioFinal;
    }
    
}
