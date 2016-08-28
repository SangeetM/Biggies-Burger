package com.example.android.BiggiesBurger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.BiggiesBurger.R;

public class place_order extends AppCompatActivity {
    boolean platters1=false,platters2=false,platters3=false,platters4=false,platters5=false,platters6=false,platters7=false,french_fries1=false,french_fries2=false,french_fries3=false,french_fries4=false,mojitos1=false,mojitos2=false,mojitos3=false;
    String platter_text1,platter_text2,platter_text3,platter_text4,platter_text5,platter_text6,platter_text7,fries_text1,fries_text2,fries_text3,fries_text4,mojitos_text1,mojitos_text2,mojitos_text3,mojitos_text4;
    public static int total=0;
    public static String s="";
    public static String s1="";
    public static String s2="";
    public static String s3="";
    public static String s4="";
    public static String s5="";
    public static String s6="";
    public static String s7="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
    }
    public void burger(View view)
    {
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.platters);
        linearLayout.setVisibility(view.VISIBLE);

    }
    public void combo(View view)
    {
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.french_fries);
        linearLayout.setVisibility(view.VISIBLE);

    }
    public void dessert(View view)
    {
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.mojitos);
        linearLayout.setVisibility(view.VISIBLE);

    }

    public void setplatters1()
    {

        CheckBox checkBox=(CheckBox)findViewById(R.id.platters1);
        platters1=checkBox.isChecked();
        if(platters1)
        {
            EditText editText1=(EditText)findViewById(R.id.platter_text1);
            platter_text1=editText1.getText().toString();
            int nb=Integer.parseInt(platter_text1);
            s+="\nCHEESY STRIPEs" ;
            int sum=nb*100;
            s1+="\n"+sum;
            total+=nb*100;
            s2+="\n"+nb;
        }

    }
    public void setplatters2() {


        CheckBox checkBox = (CheckBox) findViewById(R.id.platters2);
        platters2 = checkBox.isChecked();
        if (platters2) {
            EditText editText1 = (EditText) findViewById(R.id.platter_text2);
            platter_text2 = editText1.getText().toString();
            int nb = Integer.parseInt(platter_text2);
            total += nb * 110;
            s+="\nJALAPENO STRIPEs" ;
            int sum=nb*110;
            s1+="\n"+sum;
            s2+="\n"+nb;

        }
    }
    public void setplatters3() {


        CheckBox checkBox = (CheckBox) findViewById(R.id.platters3);
        platters3 = checkBox.isChecked();
        if (platters3) {
            EditText editText1 = (EditText) findViewById(R.id.platter_text3);
            platter_text3 = editText1.getText().toString();
            int nb = Integer.parseInt(platter_text3);
            total += nb * 100;
            s+="\nCHEESE BALLs" ;
            int sum=nb*100;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }
    }
    public void setplatters4()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.platters4);
        platters4=checkBox.isChecked();
        if(platters4)
        {
            EditText editText1=(EditText)findViewById(R.id.platter_text4);
            platter_text4=editText1.getText().toString();
            int nb=Integer.parseInt(platter_text4);
            total+=nb*70;
            s+="\nCHICKEN NUGGETs" ;
            int sum=nb*70;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }

    public void setplatters5()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.platters5);
        platters5=checkBox.isChecked();
        if(platters5)
        {
            EditText editText1=(EditText)findViewById(R.id.platter_text5);
            platter_text5=editText1.getText().toString();
            int nb=Integer.parseInt(platter_text5);
            total+=nb*70;
            s+="\nCHEESE NUGGETs" ;
            int sum=nb*70;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }

    public void setplatters6()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.platters6);
        platters6=checkBox.isChecked();
        if(platters6)
        {
            EditText editText1=(EditText)findViewById(R.id.platter_text6);
            platter_text6=editText1.getText().toString();
            int nb=Integer.parseInt(platter_text6);
            total+=nb*50;
            s+="\nVEG FINGER STICKER" ;
            int sum=nb*50;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }

    public void setplatters7()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.platters7);
        platters7=checkBox.isChecked();
        if(platters7)
        {
            EditText editText1=(EditText)findViewById(R.id.platter_text7);
            platter_text7=editText1.getText().toString();
            int nb=Integer.parseInt(platter_text7);
            total+=nb*70;
            s+="\nCHI FINGER STICKER" ;
            int sum=nb*70;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setfrench_fries1()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.french_fries1);
        french_fries1=checkBox.isChecked();
        if(french_fries1)
        {
            EditText editText1=(EditText)findViewById(R.id.fries_text1);
            fries_text1=editText1.getText().toString();
            int nb=Integer.parseInt(fries_text1);
            total+=nb*70;
            s+="\nLARGE/REGULAR" ;
            int sum=nb*70;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setfrench_fries2()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.french_fries2);
        french_fries2=checkBox.isChecked();
        if(french_fries2)
        {
            EditText editText1=(EditText)findViewById(R.id.fries_text2);
            fries_text2=editText1.getText().toString();
            int nb=Integer.parseInt(fries_text2);
            total+=nb*100;
            s+="\nPIRI PIRI" ;
            int sum=nb*100;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setfrench_fries3()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.french_fries3);
        french_fries3=checkBox.isChecked();
        if(french_fries3)
        {
            EditText editText1=(EditText)findViewById(R.id.fries_text3);
            fries_text3=editText1.getText().toString();
            int nb=Integer.parseInt(fries_text3);
            total+=nb*90;
            s+="\nCHEESY FRIES" ;
            int sum=nb*90;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setfrench_fries4()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.french_fries4);
        french_fries4=checkBox.isChecked();
        if(french_fries4)
        {
            EditText editText1=(EditText)findViewById(R.id.fries_text4);
            fries_text4=editText1.getText().toString();
            int nb=Integer.parseInt(fries_text4);
            total+=nb*100;
            s+="\nJALAPENO FRIES" ;
            int sum=nb*100;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }

    public void setmojitos1()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.mojitos1);
        mojitos1=checkBox.isChecked();
        if(mojitos1)
        {
            EditText editText1=(EditText)findViewById(R.id.mojitos_text1);
            mojitos_text1=editText1.getText().toString();
            int nb=Integer.parseInt(mojitos_text1);
            total+=nb*50;
            s+="\nLIME 'n' MINT" ;
            int sum=nb*50;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setmojitos2()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.mojitos2);
        mojitos2=checkBox.isChecked();
        if(mojitos2)
        {
            EditText editText1=(EditText)findViewById(R.id.mojitos_text2);
            mojitos_text2=editText1.getText().toString();
            int nb=Integer.parseInt(mojitos_text2);
            total+=nb*50;
            s+="\nBLUE HEAVEN" ;
            int sum=nb*50;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void setmojitos3()
    {
        CheckBox checkBox=(CheckBox)findViewById(R.id.mojitos3);
        mojitos3=checkBox.isChecked();
        if(mojitos3)
        {
            EditText editText1=(EditText)findViewById(R.id.mojitos_text3);
            mojitos_text3=editText1.getText().toString();
            int nb=Integer.parseInt(mojitos_text3);
            total+=nb*50;
            s+="\nSTRAWBERRY BLISS" ;
            int sum=nb*50;
            s1+="\n"+sum;
            s2+="\n"+nb;
        }

    }
    public void total_order(View view)
    {
        setplatters1();
        setplatters2();
        setplatters3();
        setplatters4();
        setplatters5();
        setplatters6();
        setplatters7();
        setfrench_fries1();
        setfrench_fries2();
        setfrench_fries3();
        setfrench_fries4();
        setmojitos1();
        setmojitos2();
        setmojitos3();
        TextView textView=(TextView)findViewById(R.id.total);

        textView.setText("" + total);
        s3+="TOTAL:                    Rs."+total;
        float vat=(float)(total*0.14);
        float stax=(float)(total*0.0494);
        float gross=(float)(total+vat+stax);
        int r=(int)gross;
        s4+="\nVAT(@14.0%):              Rs."+vat;
        s5+="\nSERVICE TAX(@4.94%):      Rs."+stax;
        s6+="\nTOTAL AMOUNT:             Rs."+gross;
        s7+="\nROUND OFF AMOUNT:         Rs."+r;
    }
    public  void bill_order(View view)
    {
        Intent intent=new Intent(this,bill.class);
        startActivity(intent);
    }
    public void home(View view)
    {
        Intent intent;


        intent = new Intent(this, HomePage.class);


        startActivity(intent);

    }
}
