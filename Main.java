public class Main {
    public static void main(String[] args) throws Exception {
        double [] conjX = {4,6,8,11,13,15,18,20,22};
        double [] conjY = {450658,460988,474339,493306,504826,517963,536287,546195,558262};
        double [] xestimado = {7,14,21};
        Pair<Double> pares[] = new Pair[3];
        Pair<Double> pares_linear[] = new Pair[2];

        for(int i = 1; i <= 3; i++){ // 3 testes
            int index = 0;
            for(int j = 0; j < 3; j++){ //3 pontos
                if(j != 0){
                    pares_linear[index] = new Pair<Double>(conjX[j], conjY[j]);
                    index++;
                }
                pares[j] = new Pair<Double>(conjX[j], conjY[j]);
            }

        System.out.printf("=+=+=+=+=+=+=+=+ Teste %d =+=+=+=+=+=+=+=+\n",i);
        System.out.printf("X estimado: %.0f\n",xestimado[i-1]);
        System.out.printf("Interpolação linear: %d\n", Methods.linearInterpolation(pares_linear, xestimado[i-1]));
        System.out.printf("Método de Lagrange: %d\n", Methods.lagrange(pares, xestimado[i-1]));
        System.out.println("Tabela do método de Diferenças finitas:");
        System.out.println(Methods.diferencasFinitas(pares, xestimado[i-1]));
        }    
    
    }
}

//467327