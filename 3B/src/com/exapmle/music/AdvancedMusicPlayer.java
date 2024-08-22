package com.exapmle.music;

public class AdvancedMusicPlayer extends MusicPlayer{
	public AdvancedMusicPlayer(IMusicSource musicSource) {
        super(musicSource);
    }

    public void seek(int position) {
        System.out.println("Seeking to position: " + position);
    }

}
