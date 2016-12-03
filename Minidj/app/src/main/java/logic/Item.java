package logic;

import java.io.Serializable;

/**
 * Created by Zenyo on 03.12.2016.
 */

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    String payload;
    public Item(){
    }
    public void setPayload(String payload){
        this.payload = payload;
    }
    public String getPayload(){
        return this.payload;
    }
}
