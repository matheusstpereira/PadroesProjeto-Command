package padroescomportamentais.interpreter;

public class Delegacia {

    public static String formula = "salBruto - fgts - inss - irpf";

    public static double calcularSalarioLiquido(Double salBruto, Double fgts, Double inss, Double irpf) {
        String expressao;
        expressao = formula.replace("salBruto", Double.toString(salBruto));
        expressao = expressao.replace("fgts", Double.toString(fgts));
        expressao = expressao.replace("inss", Double.toString(inss));
        expressao = expressao.replace("irpf", Double.toString(irpf));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}