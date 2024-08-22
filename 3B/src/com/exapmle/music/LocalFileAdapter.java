package com.exapmle.music;

public class LocalFileAdapter {
	private String filePath;

    public LocalFileAdapter(String filePath) {
        this.filePath = filePath;
    }

    public void play(String trackId) {
        System.out.println("Playing local file: " + filePath + " with track ID: " + trackId);
    }

    public void stop() {
        System.out.println("Stopping local file playback.");
    }

    public void pause() {
        System.out.println("Pausing local file playback.");
    }
}
