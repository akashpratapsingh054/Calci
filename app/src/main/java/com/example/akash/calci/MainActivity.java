package com.example.akash.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.function.DoubleToIntFunction;

public class MainActivity extends AppCompatActivity {

    TextView cur,opr,prev;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpoint,bc,be,bp,bm,bi,bd,blog,bcos,bsin;
    String s2,s3,s="",s4="";
    Double d1,d2,d3;
    Integer c=0,p=0,c2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cur=(TextView)findViewById(R.id.cur);
        prev=(TextView)findViewById(R.id.prev);
        opr=(TextView)findViewById(R.id.opr);

        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        bpoint=(Button)findViewById(R.id.point);
        bp=(Button)findViewById(R.id.plus);
        bm=(Button)findViewById(R.id.minus);
        bi=(Button)findViewById(R.id.into);
        bd=(Button)findViewById(R.id.div);
        bc=(Button)findViewById(R.id.c);
        blog=(Button)findViewById(R.id.log);
        bcos=(Button)findViewById(R.id.cos);
        bsin=(Button)findViewById(R.id.sin);
        be=(Button)findViewById(R.id.equal);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}
                s+=1;
                cur.setText(s4+s);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}

                s+=2;
                cur.setText(s4+s);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}

                s+=3;
                cur.setText(s4+s);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}

                s+=4;
                cur.setText(s4+s);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c==5)
                {    s="";c=0;opr.setText("");}
                s+=5;
                cur.setText(s4+s);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c==5)
                {    s="";c=0;opr.setText("");}
                s+=6;
                cur.setText(s4+s);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}
                s+=7;
                cur.setText(s4+s);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}
                s+=8;
                cur.setText(s4+s);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}
                s+=9;
                cur.setText(s4+s);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==5)
                {    s="";c=0;opr.setText("");}
                s+=0;
                cur.setText(s4+s);
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<s.length();i++)
                    if(s.charAt(i)=='.')
                        p=1;
                if(p==0) {
                    s += ".";
                    cur.setText(s4+s);
                    p = 1;
                }
                p=0;
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (s.isEmpty()==false)
                {
                    s4="";

                s2=prev.getText().toString();
                    d1=Double.parseDouble(s);
                    if(c2!=0)
                    {

                        switch(c2)
                        {
                            case 1:d1=Math.sin(d1);
                                break;
                            case 2:d1=Math.cos(d1);
                                break;
                            case 3:d1=Math.log(d1);
                                break;
                        }
                        c2=0;

                        s=Double.toString(d1);
                    }
                if(s2.isEmpty())
                {
                    prev.setText(s);
                }
                else
                {
                    d2=Double.parseDouble(s2);
                    d1=Double.parseDouble(s);

                    switch (c)
                    {
                        case 1:d3=d1+d2;
                            break;
                        case 2:d3=d2-d1;
                            break;
                        case 3:d3=d2*d1;
                            break;
                        case 4:d3=d2/d1;
                    }
                    s3=Double.toString(d3);
                    prev.setText(s3);
                }
                cur.setText("");
                s="";
                opr.setText("+");
                c=1;
            }}
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (s.isEmpty()==false)
                {s4="";

                s2=prev.getText().toString();
                    d1=Double.parseDouble(s);

                    if(c2!=0)
                    {

                        switch(c2)
                        {
                            case 1:d1=Math.sin(d1);
                                break;
                            case 2:d1=Math.cos(d1);
                                break;
                            case 3:d1=Math.log(d1);
                                break;
                        }
                        c2=0;

                        s=Double.toString(d1);
                    }
                    if(s2.isEmpty())
                {
                    prev.setText(s);
                }
                else
                {
                    d2=Double.parseDouble(s2);
                    d1=Double.parseDouble(s);

                    switch (c)
                    {
                        case 1:d3=d1+d2;
                            break;
                        case 2:d3=d2-d1;
                            break;
                        case 3:d3=d2*d1;
                            break;
                        case 4:d3=d2/d1;
                    }
                    s3=Double.toString(d3);
                    prev.setText(s3);
                }
                opr.setText("-");
                c=2;
                s="";
                cur.setText("");
            }}
        });

        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(s.isEmpty()==false)
                {s4="";
                s2=prev.getText().toString();
                    d1=Double.parseDouble(s);
                    if(c2!=0)
                    {

                        switch(c2)
                        {
                            case 1:d1=Math.sin(d1);
                                break;
                            case 2:d1=Math.cos(d1);
                                break;
                            case 3:d1=Math.log(d1);
                                break;
                        }
                        c2=0;
                        s= Double.toString(d1);

                    }
                    if(s2.isEmpty())
                {
                    prev.setText(s);
                }
                else
                {
                    d2=Double.parseDouble(s2);

                    d1=Double.parseDouble(s);

                    switch (c)
                    {
                        case 1:d3=d1+d2;
                            break;
                        case 2:d3=d2-d1;
                            break;
                        case 3:d3=d2*d1;
                            break;
                        case 4:d3=d2/d1;
                    }
                    s3=Double.toString(d3);
                    prev.setText(s3);
                }
                opr.setText("X");
                c=3;
                cur.setText("");
                s="";
            }}
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s.isEmpty()==false)

                {s4="";
                s2=prev.getText().toString();
                    d1=Double.parseDouble(s);
                    if(c2!=0)
                    {

                        switch(c2)
                        {
                            case 1:d1=Math.sin(d1);
                                break;
                            case 2:d1=Math.cos(d1);
                                break;
                            case 3:d1=Math.log(d1);
                                break;
                        }

                        s=Double.toString(d1);
                        c2=0;

                    }
                    if(s2.isEmpty())
                {
                    prev.setText(s);
                }
                else
                {
                    d2=Double.parseDouble(s2);
                    d1=Double.parseDouble(s);

                    switch (c)
                    {
                        case 1:d3=d1+d2;
                            break;
                        case 2:d3=d2-d1;
                            break;
                        case 3:d3=d2*d1;
                            break;
                        case 4:d3=d2/d1;
                    }
                    s3=Double.toString(d3);
                    prev.setText(s3);
                }
                opr.setText("/");
                c=4;
                s="";
                cur.setText("");
            }}
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                s2=prev.getText().toString();
                d1=Double.parseDouble(s);
                if(c2!=0)
                {

                    switch(c2)
                    {
                        case 1:d1=Math.sin(d1);
                            break;
                        case 2:d1=Math.cos(d1);
                            break;
                        case 3:d1=Math.log(d1);
                            break;
                    }
                    c2=0;
                    s=Double.toString(d1);

                }
                s4="";
                if(s2.isEmpty())
                {
                    cur.setText(s);
                    s=cur.getText().toString();

                }
                else
                {
                    d2=Double.parseDouble(s2);
                    d1=Double.parseDouble(s);

                    switch (c)
                    {
                        case 1:d3=d1+d2;
                            break;
                        case 2:d3=d2-d1;
                            break;
                        case 3:d3=d2*d1;
                            break;
                        case 4:d3=d2/d1;
                    }
                    s3=Double.toString(d3);
                    cur.setText(s3);
                    prev.setText("");
                    s=s3;
                }
                opr.setText("=");
                c=5;
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s4="sin";
                cur.setText(s4+s);
                c2=1;

            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s4="cos";
                cur.setText(s4+s);
                c2=2;

            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s4="log";
                cur.setText(s4+s);
                c2=3;

            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s="";
                c=0;
                c2=0;
                p=0;
                s2="";
                s3="";
                s4="";
                opr.setText("");
                prev.setText("");
                cur.setText("");
            }
        });



    }
}
