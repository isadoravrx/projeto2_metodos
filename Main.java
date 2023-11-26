public class Main {
    public static void main(String[] args) throws Exception {
        double [] conjX = {5, 10, 15};
        double [] conjY = {455997, 487551, 517963};
        Pair<Double> pares[] = new Pair[conjX.length];
        for(int i = 0; i < conjX.length; i++){
            pares[i] = new Pair<Double>(conjX[i], conjY[i]);
        }
        System.out.println("=+=+=+=+=+=+=+=+ Teste 1 =+=+=+=+=+=+=+=+");
        System.out.println("X estimado: 7");
        System.out.printf("Interpolação linear: %d\n", Methods.linearInterpolation(pares, 7));
        System.out.printf("Método de Lagrange: %d\n", Methods.lagrange(pares, 7));
        System.out.println("Método de Diferenças finitas:");
        System.out.println(Methods.diferencasFinitas(pares, 7));
    }
}

//467327