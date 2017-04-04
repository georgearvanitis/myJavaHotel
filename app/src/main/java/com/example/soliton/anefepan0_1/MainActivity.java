package com.example.soliton.anefepan0_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
     Postman postman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.radioGroup) ;
        myBUttonListenerMethod();
    }

    public  void myBUttonListenerMethod(){

        Button button= (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               int radiobuttonid=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(radiobuttonid);
                 String proorismos= (String) rb.getText();

                final EditText weightText = (EditText) findViewById(R.id.editWeightText);
                String weightString = weightText.getText().toString();

                double   weight = Double.parseDouble(weightString);
               postman=new Postman(proorismos,weight);
                // double kostos= compute_xreosi();
                // double xreosi= weight*10;

//                 if( category.equalsIgnoreCase("Εσωτερικο"))
//                     xreosi= 1000;
//                else
//                    xreosi= 5000;

                double kostos=postman.computeXreosi();

                final TextView resText = (TextView) findViewById(R.id.textViewResult);

                resText.setText(Double.toString(kostos));
               // resText.setText(category);

            }
        });
    }



}
