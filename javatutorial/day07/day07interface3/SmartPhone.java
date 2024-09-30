package javatutorial.day07.day07interface3;

public class SmartPhone implements Phone, InterfaceDevice, Camera{
    @Override
    public void takePhoto() {
        System.out.println("사진을 촬영합니다.");
    }

    @Override
    public void recordvideo() {
        System.out.println("동영상을 촬영합니다.");
    }

    @Override
    public void browseWeb(String url) {
        System.out.println(url+"에 접속합니다.");
    }

    @Override
    public void sendEmail(String address, String content) {
        System.out.println(address + "에 이메일을 보냅니다 : " + content );
    }

    @Override
    public void makeCall(String number) {
        System.out.println(number + " 에 전화를 겁니다.");
    }

    @Override
    public void answerCall() {
        System.out.println("전화를 받습니다.");
    }
}
