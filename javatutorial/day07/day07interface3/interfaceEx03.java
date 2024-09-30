package javatutorial.day07.day07interface3;

public class interfaceEx03 {
    public static void main(String[] args) {
        SmartPhone galaxy = new SmartPhone();

        galaxy.makeCall("010-2244-5512");
        galaxy.answerCall();

        galaxy.browseWeb("www.example.com");
        galaxy.sendEmail("test@test.com", "안녕하세요");

        galaxy.takePhoto();
        galaxy.recordvideo();
    }
}
