package com.exapmle.music;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adapter usage
        IMusicSource localMusic = (IMusicSource) new LocalFileAdapter("song.mp3");
        IMusicSource onlineMusic = (IMusicSource) new OnlineStreamingAdapter();
        //IMusicSource radioMusic = (IMusicSource) new RadioStationAdapter();

        // Bridge usage
        MusicPlayer player = new MusicPlayer(localMusic);
        player.play("001");
        player.pause();

        // Switching to online streaming
        player = new MusicPlayer(onlineMusic);
        player.play("stream_track_123");

        // Applying decorators
        AdvancedMusicPlayer advancedPlayer = new AdvancedMusicPlayer(onlineMusic);
        IMusicFeature volumeControl = new VolumeControlDecorator();
        IMusicFeature equalizer = new EqualizerDecorator(advancedPlayer);

        // Applying features
        volumeControl.apply();
        equalizer.apply();
	}

}
