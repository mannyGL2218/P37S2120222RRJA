package tesoem.edu.mx.p37s2120222rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView res;
    EditText numero1, numero2;
    Button sumar, restar, multiplicar, dividir;
    int num1 = 0;
    int num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = findViewById(R.id.resultado);
        numero1 = findViewById(R.id.num1);
        numero2 = findViewById(R.id.num2);
        sumar = findViewById(R.id.sumar);
        restar = findViewById(R.id.restar);
        multiplicar = findViewById(R.id.multiplicar);
        dividir = findViewById(R.id.dividir);
    }
    public void suma(View view){
        if (numero1.getText().toString().isEmpty() || numero2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(numero1.getText().toString());
            num2 = Integer.parseInt(numero2.getText().toString());
            res.setText(String.valueOf(num1+num2).toString());
        }
    }
    public void resta(View view){
        if (numero1.getText().toString().isEmpty() || numero2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(numero1.getText().toString());
            num2 = Integer.parseInt(numero2.getText().toString());
            res.setText(String.valueOf(num1-num2).toString());
        }
    }
    public void multi(View view){
        if (numero1.getText().toString().isEmpty() || numero2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(numero1.getText().toString());
            num2 = Integer.parseInt(numero2.getText().toString());
            res.setText(String.valueOf(num1*num2).toString());
        }
    }
    public void div(View view){
        if (numero1.getText().toString().isEmpty() || numero2.getText().toString().isEmpty()){
            mensaje();
        } else {
            num1 = Integer.parseInt(numero1.getText().toString());
            num2 = Integer.parseInt(numero2.getText().toString());
            if (num2 == 0){
                Toast.makeText(this,"Error al dividir 0", Toast.LENGTH_LONG).show();
            } else {
                res.setText(String.valueOf(num1/num2).toString());
            }
        }
    }
    public void mensaje(){
        Toast.makeText(this,"Porfavor llene los campos", Toast.LENGTH_LONG).show();
    }
}