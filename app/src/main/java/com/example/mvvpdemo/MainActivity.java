package com.example.mvvpdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvvpdemo.bean.User;
import com.example.mvvpdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        //这个类名根据avtivity对应的layout名，加个binding自动生成
        //比如此处布局文件为:activity_main 转换为类型为 MainActivityBinding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 数据
        User user2 = new User("张三", "User");
        binding.setUser(user2);
    }
}