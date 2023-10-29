public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double roundedtoHundredth(double toRound) {
       return ((double) ((int) ((toRound)*100))) / 100;
    }

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double distance() {
        double dist = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
        return roundedtoHundredth(dist);
    }
    public double slope() {
        double disty = (double) y2-y1;
        double distx = (double) x2-x1;
        double slope = (double) disty/distx;
        return roundedtoHundredth(slope);
    }
    public double yIntercept() {
        double m = x1*slope();
        double yInt = y1-m;
        return roundedtoHundredth(yInt);
    }
    public String equation() {
        if(x2==x1) {
            return "x = " + x2;
        }
        int y = y2-y1;
        int x = x2-x1;
        if(y<0 && x<0) {
            y = Math.abs(y);
            x = Math.abs(x);
        }
        if(y>0 && x<0) {
            x = Math.abs(x);
        }
        if(yIntercept()<0) {
            if(y % x == 0) {
                return "y = " + y/x + "x - " + Math.abs(yIntercept());
            }
            return "y = " + y + "/" + x + "x - " + Math.abs(yIntercept());
        }
        if(yIntercept()==0) {
            if(y % x == 0) {
                return "y = " + y/x + "x";
            }
        }
        if(y % x == 0) {
            return "y = " + y/x + "x + " + yIntercept();
        }
        if(y/x == 1) {
            return "y = x + " + yIntercept();
        } else if(y/x == -1) {
            return "y = -x + " + yIntercept();
        }
        return "y = " + y + "/" + x + "x + " + yIntercept();
    }
    public String coordinateForX(double x) {
        double m = x*slope();
        double yCoord = m+yIntercept();
        return "(" + x + ", " + yCoord + ")";
    }
    public String lineInfo() {
        if(x2==x1) {
            return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\nThe equation of the line between these points is: " + equation() + "\nThe slope of this line is undefined" + "\nThere is no y-intercept" + "\nThe distance between these points is " + distance();
        }
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\nThe equation of the line between these points is: " + equation() + "\nThe slope of this line is " + slope() + "\nThe y-intercept of this line is " + yIntercept() + "\nThe distance between these points is " + distance();
    }
}
