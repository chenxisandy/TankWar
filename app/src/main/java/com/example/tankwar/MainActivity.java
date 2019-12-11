package com.example.tankwar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); //设置强制横屏
        hideBottomUIMenu();
        initView();
    }

    private void initView() {
        Button startGameButton = findViewById(R.id.new_game_btn);
        Button loadGameButton = findViewById(R.id.load_game_btn);
        Button settingButton = findViewById(R.id.setting_btn);
        Button rankingBtn = findViewById(R.id.ranking_btn);

        startGameButton.setOnClickListener(this);
        loadGameButton.setOnClickListener(this);
        settingButton.setOnClickListener(this);
        rankingBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.new_game_btn:
                startNewGame();
                break;
            case R.id.load_game_btn:
                loadGame();
                break;
            case R.id.setting_btn:
                openSetting();
                break;
            case R.id.ranking_btn:
                openRanking();
                break;
        }
    }

    private void startNewGame() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    private void loadGame() {
        // TODO: 2019/12/5
    }

    private void openSetting() {
        // TODO: 2019/12/
    }

    private void openRanking() {
        // TODO: 2019/12/5
    }

    private void hideBottomUIMenu() { //默认是隐藏我们的虚拟按键，直到
//隐藏虚拟按键，并且全屏
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= 19) {
//for new api versions.
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);

        }
    }
}
