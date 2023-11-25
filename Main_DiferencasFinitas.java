public class Main_DiferencasFinitas {
    public static void main(String[] args) {
        double [] conjX = {-1, 0, 1};
        double [] conjY = {1, 1.5, 2.5};
        Pair<Double> pares[] = new Pair[conjX.length];
        for(int i = 0; i < conjX.length; i++){
            pares[i] = new Pair<Double>(conjX[i], conjY[i]);
        }
        DiferencasFinitas d;
        try {
            d = new DiferencasFinitas(pares);
            d.exibirTabela();
            d.formulaGregoryNewton();
            System.out.println(d.Px(-0.1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
