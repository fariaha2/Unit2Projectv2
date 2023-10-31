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
        int comma1 = coord1.indexOf(",");
        int comma2 = coord2.indexOf(",");
        int length1 = coord1.length();
        int length2 = coord2.length();
        x1 = Integer.parseInt(coord1.substring(1, comma1));
        x2 = Integer.parseInt(coord2.substring(1, comma2));
        y1 = Integer.parseInt(coord1.substring(comma1+2, length1-1));
        y2 = Integer.parseInt(coord2.substring(comma2+2, length2-1));
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
        } else if(ans.equals("n")) {
            System.out.println("Goodbye!");
        }
    }
}