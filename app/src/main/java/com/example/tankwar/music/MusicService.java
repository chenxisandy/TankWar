package com.example.tankwar.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

public class MusicService extends Service {
    //暂时放弃使用它

    private MusicPlayer musicPlayer;

    public MusicService() {
        super();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return musicPlayer;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        musicPlayer = new MusicPlayer();

    }

    public class MusicPlayer extends Binder {
        private MediaPlayer mediaPlayer;

        private MusicPlayer() {
            mediaPlayer = new MediaPlayer();

        }

    }
}
