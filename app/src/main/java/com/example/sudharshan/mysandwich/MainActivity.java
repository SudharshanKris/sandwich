package com.example.sudharshan.mysandwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    Button btn16;
    Button btn17;
    Button btn18;
    Button btn19;
    Button btn20;
    Button btn21;
    Button btn22;
    Button btn23;
    Button btn24;

    TextView tx1;
    TextView tx2;
    TextView tx3;
    TextView tx4;
    TextView tx5;
    TextView tx6;
    TextView tx7;
    TextView tx8;
    TextView tx9;
    TextView tx10;
    TextView tx11;
    TextView tx12;

    int counter = 0;
    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    int counter4 = 0;
    int counter5 = 0;
    int counter6 = 0;
    int counter7 = 0;
    int counter8 = 0;
    int counter9 = 0;
    int counter10 = 0;

    int total=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.b1);
        btn2 = (Button) findViewById(R.id.b2);
        btn3 = (Button) findViewById(R.id.b3);
        btn4 = (Button) findViewById(R.id.b4);
        btn5 = (Button) findViewById(R.id.b5);
        btn6 = (Button) findViewById(R.id.b6);
        btn7 = (Button) findViewById(R.id.b7);
        btn8 = (Button) findViewById(R.id.b8);
        btn9 = (Button) findViewById(R.id.b9);
        btn10 = (Button) findViewById(R.id.b10);
        btn11 = (Button) findViewById(R.id.b11);
        btn12 = (Button) findViewById(R.id.b12);
        btn13 = (Button) findViewById(R.id.b13);
        btn14 = (Button) findViewById(R.id.b14);
        btn15 = (Button) findViewById(R.id.b15);
        btn16 = (Button) findViewById(R.id.b16);
        btn17 = (Button) findViewById(R.id.b17);
        btn18 = (Button) findViewById(R.id.b18);
        btn19 = (Button) findViewById(R.id.b19);
        btn20 = (Button) findViewById(R.id.b20);
        btn21 = (Button) findViewById(R.id.b21);
        btn22 = (Button) findViewById(R.id.b22);
        btn23 = (Button) findViewById(R.id.b23);
        btn24 = (Button) findViewById(R.id.b24);




        tx1 = (TextView) findViewById(R.id.t1);
        tx2 = (TextView) findViewById(R.id.t2);
        tx3 = (TextView) findViewById(R.id.t3);
        tx4 = (TextView) findViewById(R.id.t4);
        tx5 = (TextView) findViewById(R.id.t5);
        tx6 = (TextView) findViewById(R.id.t6);
        tx7 = (TextView) findViewById(R.id.t7);
        tx8 = (TextView) findViewById(R.id.t8);
        tx9 = (TextView) findViewById(R.id.t9);
        tx10 = (TextView) findViewById(R.id.t10);
        tx11 = (TextView) findViewById(R.id.t11);
        tx12 = (TextView) findViewById(R.id.t12);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);

        tx1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx5.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx6.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx7.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx8.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx9.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx10.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx11.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tx12.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);



    }


    @Override
    public void onClick(View v) {

        if (v == btn1) {
            counter++;
            tx1.setText(Integer.toString(counter));
        }

        if (v == btn2) {
            counter--;
            if(counter<0) {
                counter = 0;
            }
            tx1.setText(Integer.toString(counter));

        }

        if (v == btn3) {
            counter1++;
            tx2.setText(Integer.toString(counter1));


        }
        if (v == btn4) {
            counter1--;
            if(counter1<0) {
                counter1 = 0;
            }
            tx2.setText(Integer.toString(counter1));
        }

        if (v == btn5) {
            counter2++;
            tx3.setText(Integer.toString(counter2));
        }

        if (v == btn6) {
            counter2--;
            if(counter2<0) {
                counter2 = 0;
            }
            tx3.setText(Integer.toString(counter2));
        }

        if (v == btn7) {
            counter3++;
            tx4.setText(Integer.toString(counter3));
        }

        if (v == btn8) {
            counter3--;
            if(counter3<0) {
                counter3 = 0;
            }
            tx4.setText(Integer.toString(counter3));
        }

        if (v == btn9) {
            counter4++;
            tx5.setText(Integer.toString(counter4));
        }

        if (v == btn10) {
            counter4--;
            if(counter4<0) {
                counter4 = 0;
            }
            tx5.setText(Integer.toString(counter4));
        }

        if (v == btn11) {
            counter5++;
            tx6.setText(Integer.toString(counter5));
        }

        if (v == btn12) {
            counter5--;
            if(counter5<0) {
                counter5 = 0;
            }
            tx6.setText(Integer.toString(counter5));

        }

        if (v == btn13) {
            counter6++;
            tx7.setText(Integer.toString(counter6));
        }

        if (v == btn14) {
            counter6--;
            if(counter6<0) {
                counter6 = 0;
            }
            tx7.setText(Integer.toString(counter6));

        }

        if (v == btn15) {
            counter7++;
            tx8.setText(Integer.toString(counter7));
        }

        if (v == btn16) {
            counter7--;
            if(counter7<0) {
                counter7 = 0;
            }
            tx8.setText(Integer.toString(counter7));

        }

        if (v == btn17) {
            counter8++;
            tx9.setText(Integer.toString(counter8));
        }

        if (v == btn18) {
            counter8--;
            if(counter8<0) {
                counter8 = 0;
            }
            tx9.setText(Integer.toString(counter8));

        }
        if (v == btn19) {
            counter9++;
            tx10.setText(Integer.toString(counter9));
        }

        if (v == btn20) {
            counter9--;
            if(counter9<0) {
                counter9 = 0;
            }
            tx10.setText(Integer.toString(counter9));

        }

        if (v == btn21) {
            counter10++;
            tx11.setText(Integer.toString(counter10));
        }

        if (v == btn22) {
            counter10--;
            if(counter10<0) {
                counter10 = 0;
            }
            tx11.setText(Integer.toString(counter10));

        }

        if (v == btn23) {
            counter=0;
            counter1=0;
            counter2=0;
            counter3=0;
            counter4=0;
            counter5=0;
            counter6=0;
            counter7=0;
            counter8=0;
            counter9=0;
            counter10=0;
            total=0;

            tx1.setText(Integer.toString(counter));
            tx2.setText(Integer.toString(counter1));
            tx3.setText(Integer.toString(counter2));
            tx4.setText(Integer.toString(counter3));
            tx5.setText(Integer.toString(counter4));
            tx6.setText(Integer.toString(counter5));
            tx7.setText(Integer.toString(counter6));
            tx8.setText(Integer.toString(counter7));
            tx9.setText(Integer.toString(counter8));
            tx10.setText(Integer.toString(counter9));
            tx11.setText(Integer.toString(counter10));
            tx12.setText(Integer.toString(total));


        }

        if (v == btn24) {
            total = counter*30 + counter1*40 + counter2*45 + counter3*50 + counter4*60 + counter5*100 + counter6*10 + counter7*15 + counter8*20 + counter9*25 + counter10*30;
            tx12.setText(Integer.toString(total));

        }


    }
}

