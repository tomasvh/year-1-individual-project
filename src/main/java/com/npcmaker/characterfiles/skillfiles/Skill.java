package com.npcmaker.characterfiles.skillfiles;

public class Skill extends Attribute{


    public Skill(String name, int dice){
        super.setName(name);
        super.changeDice(dice);
    }
    public void reCountValue(){
        if(super.getMod() > 3){
            super.changeMod(-4);
            super.changeDice(1);
        } else if (super.getMod() < 0){
            super.changeMod(4);
            super.changeDice(-1);
        }
    }


    public void setDice(int t){
        super.dice = t;
    }

    public void setMod(int tMod) {
        super.mod = tMod;
    }

}
