package com.company;

public class Weapon {
    public Weapon(String name, String automatic) {
        this.name = name;
        this.automatic = automatic;
    }

    private String name ;
 public String automatic;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutomatic() {
        return automatic;
    }

    public void setAutomatic(String automatic) {
        this.automatic = automatic;
    }
}
