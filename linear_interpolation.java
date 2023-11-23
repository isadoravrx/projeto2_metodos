public class linear_interpolation {
    private Pair<Integer> start;
    private Pair<Integer> end;
    private int x;

    public linear_interpolation(int x,Pair<Integer> start,Pair<Integer> end) {
        this.x = x;
        this.start = start;
        this.end = end;
    }

    public Pair<Integer> getStart() {
        return start;
    }

    public void setStart(Pair<Integer> start) {
        this.start = start;
    }

    public Pair<Integer> getEnd() {
        return end;
    }

    public void setEnd(Pair<Integer> end) {
        this.end = end;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    

}
