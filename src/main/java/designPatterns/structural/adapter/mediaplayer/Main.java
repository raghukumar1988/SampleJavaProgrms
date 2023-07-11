package designPatterns.structural.adapter.mediaplayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("song.mp3");
        audioPlayer.play("movie.vlc");
        audioPlayer.play("video.mp4");
        audioPlayer.play("document.doc");
    }
}
