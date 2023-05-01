package day06_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {

        double salary = 60_000;
        boolean isMarried = true;

        if(salary>130_000)
        {

            if(isMarried)
            {
                System.out.println("$"+salary*.7);
            }
            else
            {
                System.out.println("$"+salary*.65);
            }
        }
        else if(salary<=129_000 && salary>=100_000)
        {

            if(isMarried)
            {
                System.out.println("$"+salary*.75);
            }
            else
            {
                System.out.println("$"+salary*.7);
            }
        }
        else if(salary<=99_000 && salary>=80_000)
        {

            if(isMarried)
            {
                System.out.println("$"+salary*.80);
            }
            else
            {
                System.out.println("$"+salary*.75);
            }
        }
        else if(salary<=79_000)
        {

            if(isMarried)
            {
                System.out.println("$"+salary*.85);
            }
            else
            {
                System.out.println("$"+salary*.8);
            }
        }

    }

}

/*
9. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax
based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */