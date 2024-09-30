package javatutorial.day07.day07interface4;

public class CDPlayer implements Music{
    private String music;

    @Override
    public void play(String m) {
        this.music = m;
        System.out.println("CD 플레이어에서 '"+ music+"' 음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 '"+ music+"' 음악을 정지합니다.");
        this.music = String.valueOf("");
    }
}
