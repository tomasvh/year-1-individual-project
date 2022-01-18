package com.npcmaker.characterfiles.skillfiles;

public class Trait extends Attribute {


    public Trait(String name, int dice, int mod) {
       super.setName(name);
       super.changeDice(dice);
       super.changeMod(mod);
    }
}
