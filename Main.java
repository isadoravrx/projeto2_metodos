public class Main {
    public static void main(String[] args) throws Exception {
        double [] conjX = {5, 10, 15};
        double [] conjY = {455997, 487551, 517963};
        Pair<Double> pares[] = new Pair[conjX.length];
        for(int i = 0; i < conjX.length; i++){
            pares[i] = new Pair<Double>(conjX[i], conjY[i]);
        }

        System.out.println("========== Interpolacao Linear ==========");
        System.out.println(Methods.linearInterpolation(pares, 7));
        System.out.println("========== Metodo de Lagrange ==========");
        System.out.println(Methods.lagrange(pares, 7));
        System.out.println("========== Diferencas Finitas ==========");
        System.out.println(Methods.diferencasFinitas(pares, 7));
        
    }
}

//467327