package me.bzcoder.qqredpoint;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bzcoder.animation.R;

@Route(path = "/draw/QQRedPointActivity")
public class QQRedPointActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qq_red_point_activity);
    }
}
