package eecs1022.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab2Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
    }

    //                                SELECTING SPINNER OPTIONS
    /*
        We want to know which object is chosen such as if object 1 is chosen
        or object 2.
     */

    /*
        First helper method. Changes the content of the output TextView
        Will display what the TaxPayer is in the GUI.

        Given the id (set in the View xml file) of a TextView
        we change its contents to 'newContents'
    */
    private void setContentsOfTextView(int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView= (TextView) view;
        textView.setText(newContents);
    }

    /*
        This helper method will allow you to select the option in the
        the spinner.
    */
    private String getItemSelected(int id)
    {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    //                         C O N T R O L L E R


    /*
        Helper method for retrieving contents from GUI.

        Given the id(set in the View xml file) of a TextView,
        we change its contents to "newContents".
    */
    private String getInputOfTextField(int id)
    {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    public void computeTaxButtonClicked(View view)
    {
        /*
            Implementation body of method computeBMIButtonClicked.
            This block of code can be attached to some GUI component in the View xml file
            by setting the "onClick".
        */
        /*
            Phase 1: Retrieve values from EditText fields.
            To do this, we call helper methods
         */
        String textName = getInputOfTextField(R.id.inputName);
        // String selectSpinner = getInputOfTextField(R.id.spinner)
        String textIncome = getInputOfTextField(R.id.inputIncome);

        /*
           Alternative Phase 2: Based on the information retrieved,
           convert them into numbers if necessary.
           Caution: Every input value that user inputs is retrieved as a string.
           e.g. when the user inputs the name 'john', it is retrieved by the controller as "john"
                                     the weight '100', it is retrieved by the controller as "100"
                                       (ie a string of 3 characters).
        */
        // Conversion needed for income
        double income = Double.parseDouble(textIncome);


        //                 S P I N N E R   S T A T U S

        // Single
        String status = getItemSelected(R.id.spinner);
//
        TaxPayer user = new TaxPayer(textName, status,income);
        setContentsOfTextView(R.id.labelAnswer, user.toString());

    }
}
