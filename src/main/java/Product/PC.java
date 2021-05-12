package Product;

public class PC extends Platform{

    public PC(){
        this.platformType = "PC";
        this.maxPlayers = 1;
        this.online = true;
        this.media = Media.FLOPPYDISK;
    }
}
