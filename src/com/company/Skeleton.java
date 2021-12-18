package com.company;

public class Skeleton extends Boss{
    private  int gan  ;

    public int getGan() {
        return gan;
    }

    public void setGan(int gan) {
        this.gan = gan;
    }

    @Override
    public String printInfoforskeleton() {
        return super.printInfoforskeleton()+"колл стрел"+getGan ( ) ;
    }
    
}
