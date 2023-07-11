package designPatterns.structural.adapter.mediaplayer;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String fileName) {
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (fileExtension.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else if (fileExtension.equalsIgnoreCase("vlc")
                || fileExtension.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(fileExtension);
            mediaAdapter.play(fileName);
        } else {
            System.out.println("Invalid media format: " + fileExtension);
        }
    }
}
