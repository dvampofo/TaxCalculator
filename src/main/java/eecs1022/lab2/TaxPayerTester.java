package eecs1022.lab2;

/**
 * Created by user on 1/26/18.
 */
public class TaxPayerTester
{
    public static void main(String[] args)
    {
        // 186476

        System.out.println(" ");
        TaxPayer p1 = new TaxPayer("jim", "Single", 6476);
        System.out.println(p1.toString());


        System.out.println(" ");
        TaxPayer p2 = new TaxPayer("Harry", "Single",2476);
        System.out.println(p2.toString());

        // 137035
        System.out.println(" ");
        TaxPayer p3 = new TaxPayer("Jane", "Married", 137035);
        System.out.println(p3.toString());

        // 11800
        System.out.println(" ");
        TaxPayer p4 = new TaxPayer("Francis", "Household", 11800);
        System.out.println(p4.toString());

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(p1.income);
        System.out.println(p2.income);
        System.out.println(p3.income);

    }
}
