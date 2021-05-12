package Product;

public class Platform {
    protected String platformType;
    protected int maxPlayers;
    protected boolean online;
    protected Media media;

    public String getPlatformType() {
        return platformType;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public boolean isOnline() {
        return online;
    }

    public Media getMedia() {
        return media;
    }
}
