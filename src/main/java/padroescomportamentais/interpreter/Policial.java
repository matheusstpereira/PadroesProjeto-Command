package padroescomportamentais.interpreter;

public class Policial {

    private Double salBruto;
    private Double fgts;
    private Double inss;
    private Double irpf;

    public Double getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(Double salBruto) {
        this.salBruto = salBruto;
    }

    public Double getFgts() {
        return fgts;
    }

    public void setFgts(Double fgts) {
        this.fgts = fgts;
    }

    public Double getInss() {
        return inss;
    }

    public void setInss(Double inss) {
        this.inss = inss;
    }

    public Double getIrpf() {
        return irpf;
    }

    public void setIrpf(Double irpf) {
        this.irpf = irpf;
    }

    public double calcularSalarioLiquido() {
        return Delegacia.calcularSalarioLiquido(this.salBruto, this.fgts, this.inss, this.irpf);
    }

}
