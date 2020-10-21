package com.example.myappcalcularpeso;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public  void calcular(View view){
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String msg = "";
        EditText edt1 = (EditText) findViewById(R.id.editText3);
        EditText edt2 = (EditText) findViewById(R.id.editText4);
        Button btn1 = (Button) findViewById(R.id.myButton);
        TextView textView1 = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        weight = Double.parseDouble(edt1.getText().toString());
        height = Double.parseDouble(edt2.getText().toString());

        bmi = height*height;
        bmi = weight/bmi;
        textView1.setText(String.valueOf(bmi));
        if(bmi<18.5){
            msg="Seu Magrinho!";
        }else if(bmi>18.5 && bmi<25){
            msg="Seu Peso e Normal!";
        } else if(bmi>25){
            msg="Seu Gordo!";
        }
        textView2.setText(msg);
    }



}
