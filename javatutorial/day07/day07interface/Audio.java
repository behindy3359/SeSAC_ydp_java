package javatutorial.day07.day07interface;

public class Audio implements RemoteControl{
    private int volume;
    private String channel;

    @Override
    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    };
    @Override
    public void turnOff(){
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int v){
        if(v > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(v < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = v;
        }
        System.out.println("볼륨 설정을 합니다 : " + this.volume);
    }

    @Override
    public void setChannel(String c){
        this.channel = c;
        System.out.println("채널 변경을 합니다 : " + this.channel);
    }
}
