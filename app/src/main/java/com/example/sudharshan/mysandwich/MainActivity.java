package com.example.sudharshan.mysandwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.b1)
    Button btn1;

    @BindView(R.id.b2)
    Button btn2;

    @BindView(R.id.b3)
    Button btn3;

    @BindView(R.id.b4)
    Button btn4;

    @BindView(R.id.b5)
    Button btn5;

    @BindView(R.id.b6)
    Button btn6;

    @BindView(R.id.b7)
    Button btn7;

    @BindView(R.id.b8)
    Button btn8;

    @BindView(R.id.b9)
    Button btn9;

    @BindView(R.id.b10)
    Button btn10;

    @BindView(R.id.b11)
    Button btn11;

    @BindView(R.id.b12)
    Button btn12;

    @BindView(R.id.b13)
    Button btn13;

    @BindView(R.id.b14)
    Button btn14;

    @BindView(R.id.b15)
    Button btn15;

    @BindView(R.id.b16)
    Button btn16;

    @BindView(R.id.b17)
    Button btn17;

    @BindView(R.id.b18)
    Button btn18;

    @BindView(R.id.b19)
    Button btn19;

    @BindView(R.id.b20)
    Button btn20;

    @BindView(R.id.b21)
    Button btn21;

    @BindView(R.id.b22)
    Button btn22;

    @BindView(R.id.b23)
    Button btn23;

    @BindView(R.id.b24)
    Button btn24;

    @BindView(R.id.t1)
    TextView tx1;

    @BindView(R.id.t2)
    TextView tx2;

    @BindView(R.id.t3)
    TextView tx3;

    @BindView(R.id.t4)
    TextView tx4;

    @BindView(R.id.t5)
    TextView tx5;

    @BindView(R.id.t6)
    TextView tx6;

    @BindView(R.id.t7)
    TextView tx7;

    @BindView(R.id.t8)
    TextView tx8;

    @BindView(R.id.t9)
    TextView tx9;

    @BindView(R.id.t10)
    TextView tx10;

    @BindView(R.id.t11)
    TextView tx11;

    @BindView(R.id.t12)
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
        ButterKnife.bind(this);
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

