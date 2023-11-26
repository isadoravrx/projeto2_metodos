public class QuadraticInterpolation {
    Pair<Integer>[] pairs;
    
    public QuadraticInterpolation(Pair<Integer>[] pairs) throws Exception {
        if(pairs == null || pairs.length != 3) {
            throw new IllegalArgumentException();
        }
        this.pairs = pairs;
    }

    public int calculate(int x) {
        double a = 0;
        double b = 0;
        double c = 0;

        return (int)(a * x * x + b * x + c);
    }
}
