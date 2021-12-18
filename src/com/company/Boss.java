package com.company;

public class Boss extends GameEnity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean info() {
        return false;
    }
    public String printInfo()
    {

        return "Boss heals:"+ getHealth() +"Boss hook:" +getHook() + "boss wap:"+ weapon.getAutomatic()+weapon.getName();
    }

    public String printInfoforskeleton()
    {

        return "skeleton heals:"+ getHealth() +"skeleton hook:" +getHook() ;
    }



}

