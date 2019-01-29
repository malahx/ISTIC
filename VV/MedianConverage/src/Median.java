public class Median {

    String coverage = "";

    public int median(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                coverage += "a1";
                return a;
            }
            coverage += "c1";
            return c;
        }
        if (a < c) {
            coverage += "a2";
            return a;
        }
        if (b < c) {
            coverage += "b1";
            return b;
        }
        coverage += "c2";
        return c;
    }
}
