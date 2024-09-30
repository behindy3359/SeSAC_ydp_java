package javatutorial.day07.day07interface4;

public class MusicPlayer {
    public static void main(String[] args) {
        CDPlayer cd = new CDPlayer();
        Mp3Player mp3 = new Mp3Player();

        cd.play("coldplay - viva la vida");
        cd.stop();

        mp3.play("Taylor Swoft - 22");
        mp3.stop();
    }
}
