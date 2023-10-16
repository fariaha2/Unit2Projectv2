public class LinearEquation {
    public LinearEquation(String coord1, String coord2) {
        int x1 = Integer.parseInt(coord1.substring(1, 2));
        int x2 = Integer.parseInt(coord2.substring(1, 2));
        int y1 = Integer.parseInt(coord1.substring(3, 4));
        int y2 = Integer.parseInt(coord2.substring(3, 4));
    }
}
