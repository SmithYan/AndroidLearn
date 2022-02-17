package com.smithyan.androidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_inner_class;
    private Button btn_anonymous_class;
    private Button btn_xml_click;
    private TextView tv_show;

    private Button btn_next_class;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initApplication();
    }

    private void initApplication() {
        btn_inner_class = (Button) findViewById(R.id.btn_inner_class);
        btn_anonymous_class= (Button) findViewById(R.id.btn_anonymous_class);
        btn_xml_click = (Button) findViewById(R.id.btn_xml_click);
        tv_show = (TextView) findViewById(R.id.tv_show);

        InnerClass inner_class = new InnerClass();
        btn_inner_class.setOnClickListener(inner_class);

        btn_anonymous_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_show.setText("I clicked the button using the anonymous class!");
            }
        });
        btn_next_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("test","点击下一次学习！");
                tv_show.setText("I clicked the next button!");
            }
        });

    }

    public void xml_click(View view){
        tv_show.setText("I clicked the button using the xml click!");
    }
    class InnerClass implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            tv_show.setText("I clicked the button using the inner class!");
        }
    }
}