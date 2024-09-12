interface Image {
    void display();
}

// আসল ইমেজ ক্লাস যা বড় সাইজের ইমেজ লোড করে
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);  // ইমেজ লোড হচ্ছে
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

// Proxy ইমেজ ক্লাস যা ইমেজ লোডের আগে প্রক্সি হিসেবে কাজ করে


public class proxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public proxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);  // প্রয়োজনের সময় আসল ইমেজ লোড হচ্ছে
        }
        realImage.display();
    }
}
