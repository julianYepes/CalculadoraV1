package com.julianyepes.calculadorav1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eNumero;
    String  numero="";
    Double  op1=0.0;
    Double  op2=0.0;
    Double  res=0.0;
    int flagOp=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero = (EditText) findViewById(R.id.eNumero);

    }

    public void click(View view){
        int id=view.getId();
        switch(id){
            case R.id.b0 : eNumero.setText(eNumero.getText()+"0");
                numero += 0;
                break;
            case R.id.b1 : eNumero.setText(eNumero.getText()+"1");
                numero += 1;
                break;
            case R.id.b2 : eNumero.setText(eNumero.getText()+"2");
                numero += 2;
                break;
            case R.id.b3 : eNumero.setText(eNumero.getText()+"3");
                numero += 3;
                break;
            case R.id.b4 : eNumero.setText(eNumero.getText()+"4");
                numero += 4;
                break;
            case R.id.b5 : eNumero.setText(eNumero.getText()+"5");
                numero += 5;
                break;
            case R.id.b6 : eNumero.setText(eNumero.getText()+"6");
                numero += 6;
                break;
            case R.id.b7 : eNumero.setText(eNumero.getText()+"7");
                numero += 7;
                break;
            case R.id.b8 : eNumero.setText(eNumero.getText()+"8");
                numero += 8;
                break;
            case R.id.b9 : eNumero.setText(eNumero.getText()+"9");
                numero += 9;
                break;
            case R.id.bPunto : eNumero.setText(eNumero.getText()+".");
                numero += ".";
                break;
            case R.id.bSuma : eNumero.setText(eNumero.getText()+"+");
                if(numero != ""){
                    op1=Double.parseDouble(numero);
                    switch (flagOp){
                        case 1:
                            res += op1;
                            break;
                        case 2:
                            res -= op1;
                            break;
                        case 3:
                            res *= op1;
                            break;
                        case 4:
                            res /= op1;
                            break;
                        default:
                            res = op1;
                    }
                    numero="";

                }
                flagOp=1;//suma

                break;
            case R.id.bResta : eNumero.setText(eNumero.getText()+"-");
                if(numero != ""){
                    op1=Double.parseDouble(numero);
                    switch (flagOp){
                        case 1:
                            res += op1;
                            break;
                        case 2:
                            res -= op1;
                            break;
                        case 3:
                            res *= op1;
                            break;
                        case 4:
                            res /= op1;
                            break;
                        default:
                            res = op1;
                    }
                    numero="";
                    flagOp=2;//resta
                }else{
                    numero="-";
                }

                break;
            case R.id.bMult : eNumero.setText(eNumero.getText()+"x");
                if(numero != ""){
                    op1=Double.parseDouble(numero);
                    switch (flagOp){
                        case 1:
                            res += op1;
                            break;
                        case 2:
                            res -= op1;
                            break;
                        case 3:
                            res *= op1;
                            break;
                        case 4:
                            res /= op1;
                            break;
                        default:
                            res = op1;
                    }
                    numero="";

                }
                flagOp=3;//suma
                break;
            case R.id.bDiv : eNumero.setText(eNumero.getText()+"/");
                if(numero != ""){
                    op1=Double.parseDouble(numero);
                    switch (flagOp){
                        case 1:
                            res += op1;
                            break;
                        case 2:
                            res -= op1;
                            break;
                        case 3:
                            res *= op1;
                            break;
                        case 4:
                            res /= op1;
                            break;
                        default:
                            res = op1;
                    }
                    numero="";

                }
                flagOp=4;//suma
                break;
            case R.id.bBorrar : eNumero.setText("");
                res=0.0;
                op1=0.0;
                numero="";
                flagOp=0;
                break;
            case R.id.bIgual :
                if(numero != ""){
                    op1=Double.parseDouble(numero);
                    switch (flagOp){
                        case 1:
                            res += op1;
                            break;
                        case 2:
                            res -= op1;
                            break;
                        case 3:
                            res *= op1;
                            break;
                        case 4:
                            res /= op1;
                            break;
                        default:
                            res = op1;
                    }
                    numero="";
                }
                eNumero.setText(String.valueOf(res));
                break;
        }

    }
}