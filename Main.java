public class Main {
    public static void main(String[] args) throws Exception {
        double[] conjX = {4,6,8,11,13,15,18,20,22};
        double[] conjY = {450658,460988,474339,493306,504826,517963,536287,546195,558262};
        double[] valoresReais = {467327, 510711, 551415};
        double [] xestimado = {7,14,21};
        Pair<Double> pares_trios[] = new Pair[3];
        Pair<Double> pares_duplas[] = new Pair[2];

        for(int i = 0; i < xestimado.length; i++) {
            pares_trios[0] = new Pair<Double>(conjX[(i+1)*3-3], conjY[(i+1)*3-3]);
            pares_trios[1] = new Pair<Double>(conjX[(i+1)*3-2], conjY[(i+1)*3-2]);
            pares_trios[2] = new Pair<Double>(conjX[(i+1)*3-1], conjY[(i+1)*3-1]);

            pares_duplas[0] = new Pair<Double>(conjX[(i+1)*3-2], conjY[(i+1)*3-2]);
            pares_duplas[1] = new Pair<Double>(conjX[(i+1)*3-1], conjY[(i+1)*3-1]);

            System.out.printf("==================================== Teste %d ====================================\n",i+1);
            System.out.printf("X estimado: %.0f\n",xestimado[i]);
            System.out.printf("Interpolaçao linear: %d\n", Methods.linearInterpolation(pares_duplas, xestimado[i]));
            System.out.printf("Metodo de Lagrange: %d\n", Methods.lagrange(pares_trios, xestimado[i]));
            System.out.println("Tabela do metodo de Diferenças finitas:");
            System.out.println(Methods.diferencasFinitas(pares_trios, xestimado[i]));
            System.out.println("Valor real: " + valoresReais[i]);
            System.out.println("=================================================================================");
        }
    
    }

}

//467327