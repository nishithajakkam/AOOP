package com.exapmle.music;

public class MusicPlayer {
	private IMusicSource musicSource;

    public MusicPlayer(IMusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public void play(String trackId) {
        musicSource.play(trackId);
    }

    public void stop() {
        musicSource.stop();
    }

    public void pause() {
        musicSource.pause();
    }
}
