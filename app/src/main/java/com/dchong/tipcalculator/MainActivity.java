package com.dchong.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button btn10;
    private Button btn15;
    private Button btn18;
    private Button btnClear;

    private EditText input1;

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn10 = (Button) findViewById(R.id.btn10);
        btn15 = (Button) findViewById(R.id.btn15);
        btn18 = (Button) findViewById(R.id.btn18);
        btnClear = (Button) findViewById(R.id.btnClear);

        input1 = (EditText) findViewById(R.id.input1);

        txtResult = (TextView) findViewById(R.id.txtResult);

        final DecimalFormat df = new DecimalFormat("#.00");

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1.getText().length() > 0) {
                    double oper1 = Double.parseDouble(input1.getText().toString());

                    double theResult = oper1 * 0.10;

                    txtResult.setText("$" + df.format(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please Enter the Bill Amount at Top", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1.getText().length() >0) {
                    double oper1 = Double.parseDouble(input1.getText().toString());

                    double theResult = oper1 * 0.15;

                    txtResult.setText("$" + df.format(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please Enter the Bill Amount at Top", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1.getText().length() > 0) {
                    double oper1 = Double.parseDouble(input1.getText().toString());

                    double theResult = oper1 * 0.18;

                    txtResult.setText("$" + df.format(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please Enter the Bill Amount at Top", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                txtResult.setText("$0.00");
            }
        });
    }
}
