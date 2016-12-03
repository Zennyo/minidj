package logic;

import java.io.Serializable;

/**
 * Created by Zenyo on 03.12.2016.
 */

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    String payload;
    double volume;
    String track;
    public Item(){
    }
    public void setPayload(String payload){
        this.payload = payload;
    }
    public void setTrack(String track){
        this.track = track;
    }
    public void setvolume(double volume){
        this.volume = volume;
    }
    public String getPayload(){
        return this.payload;
    }
    public double getVolume(){
        return volume;
    }
}
