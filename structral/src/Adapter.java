interface MediaPlayer{
    void play(String audioType, String filename);
}

class Mp3Player implements MediaPlayer{
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file,name:"+fileName);
        }
    }
}

interface AdvancedMediaPlayer{
    void playVlc(String fileName);
    void playMp4(String fileName);

}

class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName){
        System.out.println("playing vlc media,fileName:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}

class Mp4Player implements AdvancedMediaPlayer{
    public void playVlc(String fileName){
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing Mp4 media,fileName:"+fileName);
    }
}

class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advanced;

    MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advanced = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advanced = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            advanced.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanced.playMp4(fileName);

        }
    }
}

public class Adapter implements MediaPlayer{
    MediaAdapter media;

    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file:"+fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            media = new MediaAdapter(audioType);
            media.play(audioType, fileName);
        }else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
