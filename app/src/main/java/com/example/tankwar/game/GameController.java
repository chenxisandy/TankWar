package com.example.tankwar.game;

import com.example.tankwar.bean.Enemy;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    //单例模式
    private static class Holder {
        private static final GameController INSTANCE = new GameController();
    }

    private GameController() {
        enemyList = new ArrayList<>();
    }

    public static GameController getInstance() {
        return Holder.INSTANCE;
    }

    private List<Enemy> enemyList;

    public void addEnemy(Enemy enemy) {
        enemyList.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemyList.remove(enemy);
    }
}
