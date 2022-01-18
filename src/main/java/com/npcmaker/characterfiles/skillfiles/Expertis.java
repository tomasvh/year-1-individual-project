package com.npcmaker.characterfiles.skillfiles;

public class Expertis extends Attribute {

    public Expertis(String name, int dice, int mod) {
        super.setName(name);
        super.changeDice(dice);
        super.changeMod(mod);
    }



}
