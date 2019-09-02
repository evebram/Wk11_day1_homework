public class WaterBottle {
    private int volume;
    private int drink;
    private int maxVolume;
    private int minVolume;

    public WaterBottle(int volume, int drink, int maxVolume, int minVolume) {
        this.volume = volume;
        this.drink = drink;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int takeDrink(){
        return volume - drink;
    }

    public int fillBottle(){
        int volumeToFill = maxVolume - volume;
        return volume + volumeToFill;
    }


    public int emptyBottle(){
        int volumeToPour = volume;
        return volume - volumeToPour;
    }

}
