package net.wtfitio.santalist;

import java.io.Serializable;

/**
 * Created by plamend on 1/5/14.
 */
public class Person implements Serializable {
    private String Name;
    private String Status;

    public String getName(){
        return Name;
    }

    public String getStatus(){
        return Status;
    }

    public void setName(String name){
        this.Name=name;
    }
    public void setStatus(String status ){
        this.Status=status;
    }
}
