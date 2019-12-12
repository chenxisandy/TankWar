package com.example.tankwar.game;

import android.view.View;

interface GameContract {
    interface Controller {
        void playerMove(double v);

        void createEnemy();
    }

    interface ViewLayer {
        void moveItem(View item,float x, float y);
    }
}
