import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner myScanner;
    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
    }
    public void start() {
        getCoords();
    }

    public void getCoords() {
        System.out.println("Welcome to the linear equation calculator!");
        System.out.println("Enter coordinate 1: ");
        String coord1 = myScanner.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coord2 = myScanner.nextLine();
        LinearEquation line = new LinearEquation(coord1, coord2);
    }
}