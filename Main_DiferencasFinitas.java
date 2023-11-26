public class Main_DiferencasFinitas {
    public static void main(String[] args) {
        double [] conjX = {-1, 0, 1};
        double [] conjY = {1, 1.5, 2.5};
        Pair<Double> pares[] = new Pair[conjX.length];
        for(int i = 0; i < conjX.length; i++){
            pares[i] = new Pair<Double>(conjX[i], conjY[i]);
        }

    }
}
