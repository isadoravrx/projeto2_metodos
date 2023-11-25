public class Main_lagrange {
    public static void main(String[] args) {
        double x[] = {1,2,3};
        double y[] = {1.5,2.5,3.5}; 

        Pair pares[] = new Pair[3];
        for(int i = 0; i < 3; i++){
            Pair pair = new Pair<Double>(x[i], y[i]);
            pares[i] = pair;
        }
        polinomial_lagrange interpo = new polinomial_lagrange(pares);
        System.out.println(interpo.interpolacao_lagrange(0.8));

    } 
}
