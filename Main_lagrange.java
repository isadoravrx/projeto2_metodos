public class Main_lagrange {
    public static void main(String[] args) {
        double x[] = {0,5,10};
        double y[] = {1,0.6875,0.0000}; 

        Pair pares[] = new Pair[3];
        for(int i = 0; i < 3; i++){
            Pair pair = new Pair<Double>(x[i], y[i]);
            pares[i] = pair;
        }
        polinomial_lagrange interpo;

    } 
}
