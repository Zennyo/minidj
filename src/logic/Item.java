package logic;

import java.io.Serializable;

public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String payload;
	int volume;
	String track;
    public Item(){
    }
    public void setPayload(String payload){
        this.payload = payload;
    }
    public void setTrack(String track){
        this.track = track;
    }
    public void setvolume(int volume){
        this.volume = volume;
    }
    public String getPayload(){
        return this.payload;
    }

}