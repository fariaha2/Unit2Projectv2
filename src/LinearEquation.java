public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(String coord1, String coord2) {
        x1 = Integer.parseInt(coord1.substring(1, 2));
        x2 = Integer.parseInt(coord2.substring(1, 2));
        y1 = Integer.parseInt(coord1.substring(3, 4));
        y2 = Integer.parseInt(coord2.substring(3, 4));
    }
    public double distance() {
        return Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
    }
}
