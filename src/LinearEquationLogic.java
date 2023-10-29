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
        System.out.println("Welcome to the linear equation calculator!");
        System.out.println("Enter coordinate 1: ");
        String coord1 = myScanner.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coord2 = myScanner.nextLine();
        int length1 = coord1.length();
        int length2 = coord2.length();
        int x1 = Integer.parseInt(coord1);
        int x2 = Integer.parseInt(coord2);
        int y1 = Integer.parseInt(coord1);
        int y2 = Integer.parseInt(coord2);
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