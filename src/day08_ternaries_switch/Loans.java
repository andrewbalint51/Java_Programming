package day08_ternaries_switch;

public class Loans {
    public static void main(String[] args) {
        String r;
        int salary = 100000;
        int cs= 640;


        r = (salary > 60_000 && cs > 650) ? "Loan Approved" : "Loan Denied";

        System.out.println(r);
    }
}
/*
2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */