// TV ক্লাস
class TV {
    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }
}

// স্পিকার ক্লাস
class Speaker {
    public void on() {
        System.out.println("Speaker is ON");
    }

    public void off() {
        System.out.println("Speaker is OFF");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
}

// প্রজেক্টর ক্লাস
class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}

// লাইটিং ক্লাস
class Lighting {
    public void dim() {
        System.out.println("Lights are dimmed");
    }

    public void on() {
        System.out.println("Lights are ON");
    }
}

// Facade ক্লাস: হোম থিয়েটার সিস্টেম পরিচালনার জন্য সহজ ইন্টারফেস


public class FacadeTheater {
    private TV tv;
    private Speaker speaker;
    private Projector projector;
    private Lighting lighting;

    public FacadeTheater(TV tv, Speaker speaker, Projector projector, Lighting lighting) {
        this.tv = tv;
        this.speaker = speaker;
        this.projector = projector;
        this.lighting = lighting;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lighting.dim();
        projector.on();
        tv.on();
        speaker.on();
        speaker.setVolume(5);
        System.out.println("Movie is starting now!");
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lighting.on();
        projector.off();
        tv.off();
        speaker.off();
    }
}
