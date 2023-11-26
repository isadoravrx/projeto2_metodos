public class Methods {
    public static int linearInterpolation(Pair<Double>[] valores, double x) {
        double y0 = valores[0].y;
        double y1 = valores[1].y;
        double x0 = valores[0].x;
        double x1 = valores[1].x;
        return (int)(y0 + ((y1 - y0)/x1 - x0) * (x - x0));
    }
    public static int diferencasFinitas(Pair<Double>[] valores, double x) throws Exception {
        DiferencasFinitas d;
        try {
            d = new DiferencasFinitas(valores);
            d.exibirTabela();
            d.formulaGregoryNewton();
            return (int)d.Px(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int lagrange(Pair<Double>[] valores, double x) {
        polinomial_lagrange interpo = new polinomial_lagrange(valores);
        return interpo.interpolacao_lagrange(x);

    }
}
