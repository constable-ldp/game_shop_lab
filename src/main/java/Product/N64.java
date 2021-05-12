package Product;

public class N64 extends Platform{

    public N64(){
        this.platformType = "N64";
        this.maxPlayers = 4;
        this.online = false;
        this.media = Media.CARTRIDGE;
    }
}
