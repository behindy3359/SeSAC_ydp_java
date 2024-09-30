package javatutorial.day07.day07interface;

//
public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Audio();

        rc.turnOn();
        rc.setChannel("요리 채널");
        rc.setChannel("넷플릭스");
        rc.setVolume(100);
        rc.setVolume(5);
        rc.turnOff();

        rc = new Television();

        rc.turnOn();
        rc.setChannel("요리 채널");
        rc.setChannel("유튜브");
        rc.setVolume(-5);
        rc.setVolume(5);
        rc.turnOff();
    }
}
