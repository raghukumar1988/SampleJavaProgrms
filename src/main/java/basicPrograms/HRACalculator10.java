package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class HRACalculator10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Basic Salary... ");
        int basicSalary = scanner.nextInt();
        System.out.println("Enter the HRA Allowance... ");
        int hraAllowance = scanner.nextInt();
        System.out.println("Enter the rent amount... ");
        int totalRentPaid = scanner.nextInt();
        int nonTaxableAmount = getHRANonChargeableToTax(basicSalary, hraAllowance, totalRentPaid);
        System.out.println("I can get tax exemption for ---> Rs."+ nonTaxableAmount);
        int taxableAmt= hraAllowance-nonTaxableAmount;
        System.out.println("I need to pay tax for ---------> Rs."+taxableAmt);
    }

    private static int getHRANonChargeableToTax(int basicSalary, int hraAllowance, int totalRentPaid) {

        //Get the 50% of basic pay
        // TODO- Add condition to handle Non-Metro locations with percent of 40%
        int halfTheAmtOfBasicPay = getEligibleAmount(basicSalary);
        System.out.println("***********************************************************************");
        System.out.println("50% of basic pay ------------------------------------> " + halfTheAmtOfBasicPay);

        // Get the excess amount paid over the 10 percent of basic pay
        double excessAmountPaidOver10PercentOfBasic = getExcessAmount(totalRentPaid, basicSalary);
        System.out.println("Excess Amount Paid Over 10 Percent Of Basic Pay -----> " + excessAmountPaidOver10PercentOfBasic);
        int excessAmount = (int) Math.round(excessAmountPaidOver10PercentOfBasic);  // convert double to int

        System.out.println("HRA allowance ---------------------------------------> " + hraAllowance);
        System.out.println("***********************************************************************");

        int[] amountArray = {hraAllowance, halfTheAmtOfBasicPay, excessAmount};
        //sorting to get the lowest among 3 amounts
        Arrays.sort(amountArray);
        return amountArray[0];
    }

    private static double getExcessAmount(int totalRentPaid, int basicSalary) {
        double tenPercentOfBasicPay = basicSalary * 0.1;
        return totalRentPaid - tenPercentOfBasicPay;
    }

    private static int getEligibleAmount(int basicSalary) {
        return basicSalary / 2;
    }
}
