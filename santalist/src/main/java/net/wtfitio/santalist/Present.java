package net.wtfitio.santalist;

import java.io.Serializable;

/**
 * Created by plamend on 1/5/14.
 */
public class Present implements Serializable {

    private String Name;
    private String Descript;
    private int Price;
    private int PictureID;

    public String getName(){
        return Name;
    }
    public String getDescript(){
        return Descript;
    }
    public int getPrice(){
        return Price;
    }
    public int getPictureID(){
        return PictureID;
    }
    public void setName(String name){
        this.Name=name;
    }
    public void setDescript(String descript){
        this.Descript=descript;
    }
    public void setPrice(int price){
        this.Price=price;
    }
    public void setPictureID(int pictureid){
        this.PictureID=pictureid;
    }
}
