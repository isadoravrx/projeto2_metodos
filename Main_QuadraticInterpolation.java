import java.util.ArrayList;
import java.util.List;

public class Main_QuadraticInterpolation {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = {4, 5, 6};

        List<Pair<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {
            pairs.add(new Pair<>(x[i], y[i]));
        }
        

    }
}
