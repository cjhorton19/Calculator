package com.example.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    //declare views(buttons, edittext) so later we have access to those views
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,
            btn_9,btn_0,btn_Add,btn_Sub,btn_Mul,btn_Div,btn_Equal,btn_Dec,btn_Clear;
    EditText editExpression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find View by IDs
        findViewForButtons();

        //wires the click listener to buttons
        wireClickListenerForButtions();

        //clear button
        btn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //put codes here (after the clear button is clicked)
            }
        });

        //equal button
        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //put codes here (after the equal button is clicked)

            }
        });


    }

    //creates an instance of View.OnClickListener
    //later we can wire the listener to the buttons
    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        // the system executes the code we write in onClick(View)
        // after the user presses the button.
        public void onClick(View v) {
           //put codes here (after the number button is clicked)

        }
    };

    //wire the listener to the buttons
    private void wireClickListenerForButtions()
    {
        btn_0.setOnClickListener(buttonListener);
        btn_1.setOnClickListener(buttonListener);
        btn_2.setOnClickListener(buttonListener);
        btn_3.setOnClickListener(buttonListener);
        btn_4.setOnClickListener(buttonListener);
        btn_5.setOnClickListener(buttonListener);
        btn_6.setOnClickListener(buttonListener);
        btn_7.setOnClickListener(buttonListener);
        btn_8.setOnClickListener(buttonListener);
        btn_9.setOnClickListener(buttonListener);
        btn_Dec.setOnClickListener(buttonListener);
        btn_Add.setOnClickListener(buttonListener);
        btn_Sub.setOnClickListener(buttonListener);
        btn_Div.setOnClickListener(buttonListener);
        btn_Mul.setOnClickListener(buttonListener);
    }

    //findViewById(viewId) finds the view from the layout resource file
    // that are attached with current Activity
    // with requested viewId
    private void findViewForButtons()
    {
        //R is a Class in android that are having the ids of all the views
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_Add = findViewById(R.id.btn_add);
        btn_Div = findViewById(R.id.btn_div);
        btn_Sub = findViewById(R.id.btn_sub);
        btn_Mul = findViewById(R.id.btn_mul);
        btn_Equal = findViewById(R.id.btn_equal);
        btn_Dec = findViewById(R.id.btn_dec);
        btn_Clear = findViewById(R.id.btn_clear);
        editExpression = findViewById(R.id.edit_expression);
    }

}
