package com.example.jianhao.a2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends AppCompatActivity  implements OnClickListener{

    Button btn0=null;
    Button btn1=null;
    Button btn2=null;
    Button btn3=null;
    Button btn4=null;
    Button btn5=null;
    Button btn6=null;
    Button btn7=null;
    Button btn8=null;
    Button btn9=null;
    Button btnBackspace=null;
    Button btnCE=null;
    Button btnC=null;
    Button btnAdd=null;
    Button btnSub=null;
    Button btnMul=null;
    Button btnDiv=null;
    Button btnEqu=null;
    Button btnsin=null;
    Button btnM=null;
    Button btncos=null;
    Button btntan=null;
    Button btn10_16=null;
    Button btn10_8=null;
    Button btn10_2=null;

    TextView tvResult=null;
    //声明两个参数。接收tvResult前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int op=0;//判断操作数，
    boolean isClickEqu=false;//判断是否按了“=”按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //从布局文件中获取控件，
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnBackspace=(Button)findViewById(R.id.btnBackspace);
        btnCE=(Button)findViewById(R.id.btnCE);
        btnC=(Button)findViewById(R.id.btnC);
        btnEqu=(Button)findViewById(R.id.btnEqu);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnsin= (Button)findViewById(R.id.btnsin);
        btncos=(Button)findViewById(R.id.btncos);
        btntan=(Button)findViewById(R.id.btntan);
        btnM=(Button)findViewById(R.id.btnM);
        btn10_16=(Button)findViewById(R.id.btn10_16);
        btn10_8=(Button)findViewById(R.id.btn10_8);
        btn10_2=(Button)findViewById(R.id.btn10_2);
        tvResult=(TextView)findViewById(R.id.tvResult);

        //添加监听\
        btnBackspace.setOnClickListener(this);
        btnCE.setOnClickListener(this);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnsin.setOnClickListener(this);
        btncos.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnEqu.setOnClickListener(this);
        btn10_8.setOnClickListener(this);
        btn10_2.setOnClickListener(this);
        btn10_16.setOnClickListener(this);
    }
    //CAIDAN

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        //显示标题栏

        return true;
    }

    //定义菜单响应事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_settings:
                Toast.makeText(this,"This is help",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_another:
                Toast.makeText(this,"不算点什么么ww",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
    //DIANJI
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            //btnBackspace和CE
            case R.id.btnBackspace:
                String myStr=tvResult.getText().toString();
                try {
                    tvResult.setText(myStr.substring(0, myStr.length()-1));
                } catch (Exception e) {
                    tvResult.setText("");
                }

                break;
            case R.id.btnCE:
                tvResult.setText(null);
                break;

            //btn0--9
            case R.id.btn0:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;

                }
                String myString=tvResult.getText().toString();
                myString+="0";
                tvResult.setText(myString);
                break;
            case R.id.btn1:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String1=tvResult.getText().toString();
                String1+="1";
                tvResult.setText(String1);
                break;
            case R.id.btn2:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String2=tvResult.getText().toString();
                String2+="2";
                tvResult.setText(String2);
                break;
            case R.id.btn3:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String3=tvResult.getText().toString();
                String3+="3";
                tvResult.setText(String3);
                break;
            case R.id.btn4:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String4=tvResult.getText().toString();
                String4+="4";
                tvResult.setText(String4);
                break;
            case R.id.btn5:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String5=tvResult.getText().toString();
                String5+="5";
                tvResult.setText(String5);
                break;
            case R.id.btn6:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String6=tvResult.getText().toString();
                String6+="6";
                tvResult.setText(String6);
                break;
            case R.id.btn7:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String7=tvResult.getText().toString();
                String7+="7";
                tvResult.setText(String7);
                break;
            case R.id.btn8:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String8=tvResult.getText().toString();
                String8+="8";
                tvResult.setText(String8);
                break;
            case R.id.btn9:
                if(isClickEqu)
                {
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String String9=tvResult.getText().toString();
                String9+="9";
                tvResult.setText(String9);
                break;

            //btn+-*/=--------------------------------
            case R.id.btnAdd:
                String StringAdd=tvResult.getText().toString();
                if(StringAdd.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(StringAdd);
                tvResult.setText(null);
                op=1;
                isClickEqu=false;
                break;

            case R.id.btnSub:
                String StringSub=tvResult.getText().toString();
                if(StringSub.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(StringSub);
                tvResult.setText(null);
                op=2;
                isClickEqu=false;
                break;
            case R.id.btnMul:
                String StringMul=tvResult.getText().toString();
                if(StringMul.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(StringMul);
                tvResult.setText(null);
                op=3;
                isClickEqu=false;
                break;
            case R.id.btnDiv:
                String StringDiv=tvResult.getText().toString();
                if(StringDiv.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(StringDiv);
                tvResult.setText(null);
                op=4;
                isClickEqu=false;
                break;
            //btnsin cos tan ^------------------------------

            case R.id.btnsin:
                String Stringsin=tvResult.getText().toString();
                if(Stringsin.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(Stringsin);
                tvResult.setText(null);
                op=5;
                isClickEqu=false;
                break;

            case R.id.btncos:
                String Stringcos=tvResult.getText().toString();
                if(Stringcos.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(Stringcos);
                tvResult.setText(null);
                op=6;
                isClickEqu=false;
                break;

            case R.id.btntan:
                String Stringtan=tvResult.getText().toString();
                if(Stringtan.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(Stringtan);
                tvResult.setText(null);
                op=7;
                isClickEqu=false;
                break;

            case R.id.btnM:
                String StringM=tvResult.getText().toString();
                if(StringM.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(StringM);
                tvResult.setText(null);
                op=8;
                isClickEqu=false;
                break;
            case R.id.btn10_2:
                String String102=tvResult.getText().toString();
                if(String102.equals(null))
                {
                    return;
                }
                num1=Integer.valueOf(String102);
                tvResult.setText(null);
                op=9;
                isClickEqu=false;
                break;
            case R.id.btn10_8:
                String String108=tvResult.getText().toString();
                if(String108.equals(null))
                {
                    return;
                }
                num1=Integer.valueOf(String108);
                tvResult.setText(null);
                op=10;
                isClickEqu=false;
                break;
            case R.id.btn10_16:
                String String106=tvResult.getText().toString();
                if(String106.equals(null))
                {
                    return;
                }
                num1=Integer.valueOf(String106);
                tvResult.setText(null);
                op=11;
                isClickEqu=false;
                break;
            //输出结果！！！！！！！！！！！
            case R.id.btnEqu:
                String StringEqu=tvResult.getText().toString();


                tvResult.setText(null);
                switch (op) {
                    case 0:
                        num2=Double.valueOf(StringEqu);
                        Result=num2;
                        break;
                    case 1:
                        num2=Double.valueOf(StringEqu);
                        Result=num1+num2;
                        break;
                    case 2:
                        num2=Double.valueOf(StringEqu);
                        Result=num1-num2;
                        break;
                    case 3:
                        num2=Double.valueOf(StringEqu);
                        Result=num1*num2;
                        break;
                    case 4:
                        num2=Double.valueOf(StringEqu);
                        Result=num1/num2;
                        break;
                    case 5:
                        Result=Math.sin(num1);
                        break;
                    case 6:
                        Result=Math.cos(num1);
                        break;
                    case 7:
                        Result=Math.tan(num1);
                        break;
                    case 8:
                        num2=Double.valueOf(StringEqu);
                        Result=Math.pow(num1,num2);//输出结果为num1的num2次方
                        break;
                    case 9:
                        String s;
                        s = (Integer.toBinaryString((int) num1));
                        int i;
                        i= Integer.parseInt(s);
                        Result = i;
                        break;
                    case 10:
                        String s1;
                        s = (Integer.toOctalString((int) num1));
                        int i1;
                        i= Integer.parseInt(s);
                        Result = i;
                        break;
                    case 11:
                        String s2;
                        s = (Integer.toHexString((int) num1));
                        int i2;
                        i= Integer.parseInt(s);
                        Result = i;
                        break;
                    default:
                        Result=0;
                        break;
                }
                tvResult.setText(String.valueOf(Result));
                isClickEqu=true;
                break;

            default:
                break;
        }
    }

}


