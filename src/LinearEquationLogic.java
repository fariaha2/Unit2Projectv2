import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner myScanner;
    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
    }
    public void start() {
        getCoords();
    }

    private void getCoords() {
        int x1 =0;
        int x2 =0;
        int y1 =0;
        int y2 =0;
        int temp=0;
        System.out.println("Welcome to the linear equation calculator!");
        System.out.println("Enter coordinate 1: ");
        String coord1 = myScanner.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coord2 = myScanner.nextLine();
        if(coord2.length()==6) {
           x2 = Integer.parseInt(coord2.substring(1,2));
           y2 = Integer.parseInt(coord2.substring(4,5));
        } else if(coord2.length()==8) {
            x2 = Integer.parseInt(coord2.substring(1,3));
            temp = 2*x2;
            x2 = x2-temp;
            y2 = Integer.parseInt(coord2.substring(6,8));
            temp = 2*y2;
            y2 = y2-temp;
        } else {
            System.out.println("In " + coord2 + ", is the x-value negative or is the y-value? x/y");
            String ans1 = myScanner.nextLine();
            if(ans1=="x") {
                x2 = Integer.parseInt(coord2.substring(1,2));
                temp = 2*x2;
                x2 = x2-temp;
                y2 = Integer.parseInt(coord2.substring(5,6));
            } else {
                x2 = Integer.parseInt(coord2.substring(1,2));
                y2 = Integer.parseInt(coord2.substring(5,6));
                temp = 2*y2;
                y2 = y2-temp;
            }
        }
        if(coord1.length()==6) {
            x1 = Integer.parseInt(coord1.substring(1,2));
            y1 = Integer.parseInt(coord1.substring(4,5));
        } else if(coord1.length()==8) {
            x1 = Integer.parseInt(coord1.substring(1,3));
            temp = 2*x1;
            x1 = x1-temp;
            y1 = Integer.parseInt(coord1.substring(6,8));
            temp = 2*y1;
            y1 = y1-temp;
        } else {
            System.out.println("In " + coord1 + ", is the x-value negative or is the y-value? x/y");
            String ans1 = myScanner.nextLine();
            System.out.println(ans1);
            if(ans1=="x") {
                x1 = Integer.parseInt(coord1.substring(1,2));
                temp = 2*x2;
                x1 = x1-temp;
                y1 = Integer.parseInt(coord1.substring(5,6));
            } else {
                x1 = Integer.parseInt(coord1.substring(1,2));
                y1 = Integer.parseInt(coord1.substring(5,6));
                temp = 2*y1;
                y1 = y1-temp;
            }
        }
        LinearEquation line = new LinearEquation(x1, y1, x2, y2);
        System.out.println(line.lineInfo());
        System.out.println("Enter an x-value");
        double xvalue = myScanner.nextInt();
        System.out.println(line.coordinateForX(xvalue));
        repeat();
        }
        private void repeat() {
        System.out.println("Would you like to repeat the process for another pair of coordinates? y/n");
        myScanner.nextLine();
        String ans = myScanner.nextLine();
        if(ans.equals("y")) {
            getCoords();
        }
    }
}