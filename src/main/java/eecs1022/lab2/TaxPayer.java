package eecs1022.lab2;

/**
 * Created by user on 1/26/18.
 */
public class TaxPayer
{

    /*
        Attributes are data that we store to represent the
        STATE(i.e. combination of attribute values) of each entity.
    */

    /*
        Each declaration of an attribute consists of:
        1. the type (the set/collection of allowed values) of the attribute
            Common data types in Java:
                int for integers (e.g. 1 4, 56, -3)
                double for real numberS (e.g. -0.5, 63.7, 4.6)
                character for single key (e.g. 'h' , ' ', 'e')
                String for sequences of characters (e.g. " ", "abcde", "a")
        2. The name of the attribute.
     */
    /*
        Once we have declared the types of attributes, it is considered a
        type error if we try to change an attribute's value into one that
        is no compatible with its declared type.
        e.g. changing a persons name to 3.4 is not correct
                changing a persons weight to "90" is not correct
    */
    String name;
    String status;
    double income;

    // Define a constructor for creating instances of a TaxPayer
    // This constructor has three parameters (i.e. inputs) in order to create instances.
    public TaxPayer (String n, String s, double i)
    {
        this.name = n;
        this.status = s;
        this.income = i;

    }

    // Define ACCESSOR methods, which ask questions about the context object (e.g. p1, p2) and get RETURNED
    // with some answers to the questions.
    /*
        Given the current context object Income, apply the TaxPayer calculation formula.
    */
    // 1st accessor

    //                                S  I  N  G  L  E
    double getTax1single()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Single"))
        {
            // 10%
            if(this.income > 8350)
            {
                taxIncome = 8350 * 0.10;
            }else if (this.income < 8350 )
            {
                taxIncome = income * 0.10;
            }
        }
        return taxIncome;
    }

    double getTax2single()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        // 15%
        if(income >= 8350 && income <=39950)
        {
            taxIncome = (income - 8350) * 0.15;
        }
        else if (this.income >= 39950)
        {
            taxIncome = 3840;
        }

        return taxIncome;
    }

    double getTax3single()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.income >= 39950 && this.income <= 82250)
        {
            taxIncome = (income - 39950) * 0.25;
        }
        else if (this.income >= 82250);
        {
            taxIncome = 12075;
        }

        return taxIncome;
    }
    double getTax4single()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        // 15%
        taxIncome = income - 82250;
        taxIncome *= 0.30;
        return taxIncome;
    }

    //                               M A R R I E D

    double getTax1married()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Married"))
        {
            // 10%
            if(this.income > 16700)
            {
                taxIncome = 16700 * 0.10;
            }
            else if (this.income < 16700)
            {
                taxIncome = income * 0.10;
            }
        }
        return taxIncome;
    }

    double getTax2married()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Married"))
        {
            // 15%
            if(this.income > 16700 && this.income <= 67900)
            {
                taxIncome = (income - 16700) * 0.15;
            }
            else if (this.income > 16700)
            {
                taxIncome = 7680;
            }
        }
        return taxIncome;
    }

    double getTax3married()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Married"))
        {
            // 25%
            if(this.income >= 67900 && this.income <= 137050)
            {
                taxIncome = (income - 67900) * 0.25;
            }
            else if (this.income > 67900)
            {
                taxIncome = 17287.5;
            }
        }
        return taxIncome;
    }

    double getTax4married()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Married"))
        {
            // 30%
            taxIncome = income - 137050;
            taxIncome *= 0.30;
        }
        return taxIncome;
    }

    //                                       H O U S E H O L D

    double getTax1household()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Household"))
        {
            // 10%
            if(this.income > 11950)
            {
                taxIncome = 11950 * 0.10;
            }
            else if (this.income < 11950)
            {
                taxIncome = income * 0.10;
            }
        }
        return taxIncome;
    }

    double getTax2household()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Household"))
        {
            // 15%
            if(this.income > 11950 && this.income <= 45500)
            {
                taxIncome = (income - 11950) * 0.15;
            }
            else if (this.income > 45500)
            {
                taxIncome = 6825;
            }
        }
        return taxIncome;
    }

    double getTax3household()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Household"))
        {
            // 15%
            if(this.income > 45500 && this.income <= 117450)
            {
                taxIncome = (income - 45500) * 0.25;
            }
            else if (this.income > 117450)
            {
                taxIncome = 18112.5;
            }
        }
        return taxIncome;
    }

    double getTax4household()
    {
        double income = this.income;

        double taxIncome = 0;
        String ti = String.format("%.2f", taxIncome);

        if (this.status.equals("Household"))
        {
            // 30%
            taxIncome = income - 117450;
            taxIncome *= 0.30;
        }
        return taxIncome;
    }

    // Calculate the tax that is due.
    double getTaxDue()
    {
        double singleFirst  = this.getTax1single(); // 10%
        double singleSecond = this.getTax2single(); // 15%
        double singleThird  = this.getTax3single(); // 25%
        double singleFourth = this.getTax4single(); // 30%

        double marriedFirst  = this.getTax1married(); // 10%
        double marriedSecond = this.getTax2married(); // 15%
        double marriedThird  = this.getTax3married(); // 25%
        double marriedFourth = this.getTax4married(); // 30%

        double householdFirst  = this.getTax1household();
        double householdSecond = this.getTax2household();
        double householdThird  = this.getTax3household();
        double householdFourth = this.getTax4household();


        double taxTotal = 0;

        if (this.status.equals("Single"))
        {
            if (income <= 8350)
            {
                taxTotal = singleFirst;
            }
            else if (income >= 8350 && income <= 33950)
            {
                taxTotal = singleFirst + singleSecond;
            }
            else if (income >= 33950 && income <= 82250)
            {
                taxTotal = singleFirst + singleSecond + singleThird;
            }
            else
            {
                taxTotal = singleFirst + singleSecond + singleThird + singleFourth;
            }
        }
        else if (this.status.equals("Married"))
        {
            if (income <= 16700)
            {
                taxTotal = marriedFirst;
            }
            else if (income >= 16700 && income <= 67900)
            {
                taxTotal = marriedFirst + marriedSecond;
            }
            else if (income >= 67900 && income <= 137050)
            {
                taxTotal = marriedFirst + marriedSecond + marriedThird;
            }
            else
            {
                taxTotal = marriedFirst + marriedSecond + marriedThird + marriedFourth;
            }
        }
        else
        {
            if (income <= 11950)
            {
                taxTotal = householdFirst;
            }
            else if (income >= 11950 && income <= 45500)
            {
                taxTotal = householdFirst + householdSecond;
            }
            else if (income >= 45500 && income <= 117450)
            {
                taxTotal = householdFirst + householdSecond + householdThird;
            }
            else
            {
                taxTotal = householdFirst + householdSecond + householdThird + householdFourth;
            }
        }
        return taxTotal;
    }

    // This method will take the TaxPayer's marital status and income tax-bracket
    // and return the correct Parts.
    public String getInterpret()
    {
        String s = "";

        double singleFirst = this.getTax1single();
        String sf = String.format("%.2f", singleFirst);

        double singleSecond = this.getTax2single() ;
        String ss = String.format("%.2f", singleSecond);

        double singleThird = this.getTax3single();
        String st = String.format("%.2f", singleThird);

        double singleFourth = this.getTax4single();
        String sr = String.format("%.2f", singleFourth);


        // M  A  R  R  I  E  D
        double marriedFirst = this.getTax1married();
        String mf = String.format("%.2f", marriedFirst);

        double marriedSecond = this.getTax2married();
        String ms = String.format("%.2f", marriedSecond);

        double marriedThird = this.getTax3married();
        String mt  = String.format("%.2f", marriedThird);

        double marriedFourth = this.getTax4married();
        String mr = String.format("%.2f", marriedFourth);



        // H  O  U  S  E  H  O  L  D
        double householdFirst = this.getTax1household();
        String hf = String.format("%.2f", householdFirst);

        double householdSecond = this.getTax2household();
        String hs = String.format("%.2f", householdSecond);

        double householdThird = this.getTax3household();
        String ht = String.format("%.2f", householdThird);

        double householdFourth = this.getTax4household();
        String hr = String.format("%.2f", householdFourth);


        if(this.status.equals("Single"))
        {
            if(this.income <= 8350)
            {
                s += "Part I: $" + sf;
            }
            else if(this.income >= 8350 && this.income <= 33950)
            {
                s += "Part I:  $" + sf + "\nPart II: $" + ss;
            }
            else if(this.income >= 33950 && this.income <= 82250)
            {
                s += "Part I:   $" + sf + "\nPart II:  $" + ss;
                s += "\nPart III: $" + st;
            }
            else if(this.income >= 82250)
            {
                s += "Part I:    $" + sf + "\nPart II:   $" + ss;
                s += "\nPart III:  $" + st + "\nPart IV:   $" + sr;
            }
        }
        else if (this.status.equals("Married"))
        {
            if (this.income <= 16700)
            {
                s += "Part I: $" + mf;
            }
            else if (this.income >= 16700 && this.income <= 67900)
            {
                s += "Part I:  $" + mf + "\nPart II: $" + ms;
            }
            else if (this.income >= 67900 && this.income <= 137050)
            {
                s += "Part I:  $" + mf + "\nPart II: $" + ms + "\nPart III: $" + mt;
            }
            else
            {
                s += "Part I:  $" + mf + "\nPart II: $" + ms + "\nPart III: $" + mt + "\nPart IV: $"
                + mr;
            }
        }
        else
        {
            if (this.income <= 11950)
            {
                s += "Part I: $" + hf;
            }
            else if (this.income >= 11950 && this.income <= 45500)
            {
                s += "Part I:  $" + hf + "\nPart II: $" + hs;
            }
            else if (this.income >= 45500 && this.income <= 117450)
            {
                s += "Part I:  $" + hf + "\nPart II: $" + hs + "\nPart III: $" + ht;
            }
            else
            {
                s += "Part I:  $" + hf + "\nPart II: $" + hs + "\nPart III: $" + ht
                +  "\nPart IV: $" + hr;
            }
        }

        return s;
    }

    public String toString()
    {
        String s = "";
        s += this.name;

        String f = String.format("%.2f", getTaxDue());

        s += ", your tax due is $" + f + ".\n";
        s += "Calculation is based on the scheme of " + this.status +" Filing:\n";

        s += getInterpret();

        return s;
    }



}
