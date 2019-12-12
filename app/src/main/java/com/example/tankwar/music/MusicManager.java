package com.example.tankwar.music;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

import java.util.HashMap;

public class MusicManager {

    //单例模式
    private static class Holder {
        private static final MusicManager INSTANCE = new MusicManager();
    }

    private MusicManager() {
    }

    public static MusicManager getInstance() {
        return Holder.INSTANCE;
    }

    private Context context;

    private SoundPool soundPool;

    private MediaPlayer mediaPlayer;

    private HashMap<Integer, Integer> soundPoolMap;

    public void init(Context context) { //没有初始化就会有问题
        this.context = context;
        soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
        // TODO: 2019/12/12 to add media bgm and add soundPoolMap
    }

    public void playSound(int musicName) {
        AudioManager manager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        //音量的可调节
        float streamVolumeCurrent = manager
                .getStreamVolume(AudioManager.STREAM_MUSIC);
        float streamVolumeMax = manager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        float volume = streamVolumeCurrent / streamVolumeMax;
        soundPool.play(soundPoolMap.get(musicName), volume, volume, 1, 1, 1f);
    }
}
