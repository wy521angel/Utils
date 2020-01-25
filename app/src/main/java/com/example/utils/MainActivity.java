package com.example.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.utlislibrary.FileUtils;
import com.example.utlislibrary.ScreenUtils;

public class MainActivity extends AppCompatActivity {

    private Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = this;

        //屏幕宽高
        int screenWidth = ScreenUtils.getScreenMetrics(this).widthPixels;
        int screenHeight = ScreenUtils.getScreenMetrics(this).heightPixels;

        TextView tv1 = findViewById(R.id.tv1);
        tv1.setText("屏幕的宽为：" + screenWidth + "；屏幕的高为：" + screenHeight);

        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(FileUtils.getTextFromAssets(c, "Text_Test.txt"));

        String writeFileString = "写入文件的测试";
        FileUtils.writeFile(writeFileString, "Write_File.txt");

    }
}
