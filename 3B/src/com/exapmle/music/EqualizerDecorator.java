package com.exapmle.music;

public class EqualizerDecorator implements IMusicFeature {
	private MusicPlayer player;

    public EqualizerDecorator(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void apply() {
        System.out.println("Applying equalizer settings.");
        player.play("default_track_id");
    }

}
