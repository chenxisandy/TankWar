package com.example.tankwar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.kongqw.rockerlibrary.view.RockerView;

public class GameActivity extends BaseActivity {

    private RockerView leftRocker;

    private RockerView rightRocker;

    private ProgressBar healthBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        leftRocker = findViewById(R.id.left_roc);
        leftRocker.setCallBackMode(RockerView.CallBackMode.CALL_BACK_MODE_STATE_CHANGE);
        leftRocker.setOnAngleChangeListener(new RockerView.OnAngleChangeListener() {
            @Override
            public void onStart() {

            }

            @Override
            public void angle(double v) {
                // TODO: 2019/12/12 控制方向移动
            }

            @Override
            public void onFinish() {

            }
        });

        rightRocker = findViewById(R.id.right_roc);
        rightRocker.setCallBackMode(RockerView.CallBackMode.CALL_BACK_MODE_STATE_CHANGE);

        healthBar = findViewById(R.id.heath_bar);
    }
}
