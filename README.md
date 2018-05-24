# Lab 2 - Tax Calculator

## Demo
When you run the program, you see this:
![Demo gif](https://imgur.com/EtcZAWy.gif)

Suppose an imaginary income tax scheme, where the calculation is based on:
1. filing status (single filing, married filing, or household)
2. taxable income
Once the above information is given by the user, the tax is calculated based on the following filing scheme:


|  Tax Rate | Single Status   | Married Status   | Household |     
|---|---|---|---|
| 10%  |  $0 – $8350 |  $0 – $16700 | $0 – $11950  |
| 15%   | $8350 – $33950  |  $16700 – $67900 | $11950 – $45500  |   |
| 25%  |  $33950 – $82250 |  $67900 – $137050 |  $45500 – $117450 |   |
| 30%  | $82250+  |   $137050+|  $117450 |   |

That is, a tax payer’s income is split into up to four parts, depending on how high their income is, on
which filing status they have. Once split, each part of the income is taxed with the corresponding rate:
- For a single filer, the cutoff points are $8350, $33950, and $82250.
- For a married filer, the cutoff points are $16700, $67900, and $137050.
- For a household filer, the cutoff points are $11950, $45500, and $117450.

For example:
1. Consider Joe who is a single filer and whose income is $186476. Since his income is higher than the
third cutoff point for a single filer (i.e., $82250), his income will be split into 4 parts:
    - The first part $8350 is taxed with a rate of 10%.
    - The second part $(33950 - 8350) is taxed with a rate of 15%.
    - The third part $(82250 - 33950) is taxed with a rate of 25%.
    - The fourth part $(186476 - 82250) is taxed with a rate of 30%.

Therefore, the expected computed result from your app is:
```
Joe, your tax due is $48017.80
Calculation is based on the scheme of Single Filing:
Part I: $835.00
Part II: $3840.00
Part III: $12075.00
Part IV: $31267.80
```
# Installation Instructions (For MAC Only): 


  - Create New Project (**File > New > New Project**):
   ![Step 1](https://imgur.com/97hJKuS.png)
- Fill in the *Application name*; in this case "GithubDemo". Do the same with *Company Domain*:
 ![Step 2](https://imgur.com/9cfVSjz.png)
- Make sure *Phone and Tablet* is selected:
 ![Step 3](https://imgur.com/1wNcsMH.png)

- Select *Empty Activity*:
 ![Step 4](https://imgur.com/rFIUF4E.png)
- Configure activity by giving the changing the *Activity name*. Once the project is created, **CLOSE** Android Studio entirely:
 ![Step 5](https://imgur.com/B8RC5vc.png)
-  Go to the folder where you created you the project (for me, it's on my *Desktop*):
 ![Step 6](https://imgur.com/1mwvudb.png)
- Go to the *app* folder and **DELETE** the existing *src* folder:
 ![Step 7](https://imgur.com/W17yGSX.png)
- Unzip the downloaded file and copy it to the *src* folder here.  


