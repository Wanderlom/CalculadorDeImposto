public class calcSalario {
    private float salario;

    public calcSalario(float salario) {
        this.setSalario(salario);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public double calcFgts () {
        return getSalario() * 0.08;
    }
    
    public double calcInss () {
        if (getSalario()<= 1045){
            return getSalario() * 0.075;
        }
        else if (getSalario() <= 2089.60) {
            return getSalario() * 0.09;
        }
        else if (getSalario() <= 3134.40) {
            return getSalario() * 0.12;
        }
        else if (getSalario() < 6101.06) {
            return getSalario() * 0.14;
        }
        else {
            return 6101.06 * 0.14;
        }
    }
    public double calcIr () {
        if (getSalario()<= 1903.98){
            return 0;
        }
        else if (getSalario() <= 2826.65) {
            return getSalario() * 0.075 - 142.80;
        }
        else if (getSalario() <= 3751.05) {
            return getSalario() * 0.15 - 354.80;
        }
        else if (getSalario() < 4664.68) {
            return getSalario() * 0.225 - 636.13;
        }
        else {
            return getSalario() * 0.275 - 869.36;
        }
    }
    
    public double salarioLiquido(){
        return getSalario() - (calcInss() + calcIr());
    }
}
