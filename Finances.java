import java.util.Scanner;

public class Finances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the investment amount: ");
        double investment = in.nextDouble();
        System.out.println("Input the rate of interest: ");
        double rate = in.nextDouble();
        System.out.println("Input number of years: ");
        int year = in.nextInt();

        rate *= 0.01;
        System.out.println("Years   Future Value");
        for(int i = 1; i <= year; i++) {
            int formatter = 19;
            if(i >= 10) formatter = 18;
            System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate/12, i));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterest, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterest, years * 12);
    }
}
