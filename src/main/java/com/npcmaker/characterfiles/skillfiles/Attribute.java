package com.npcmaker.characterfiles.skillfiles;

public abstract class Attribute {

    protected String name;
    protected int dice = 0;
    protected int mod = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDice() {
        return dice;
    }

    public void changeDice(int dice) {
        this.dice += dice;
    }

    public int getMod() {
        return mod;
    }

    public void changeMod(int mod) {
        this.mod += mod;
    }

    public String valueToString() {
        StringBuilder temp = new StringBuilder();
        temp.append(this.getDice()).append("T6");
        if (this.getMod() != 0) {
            temp.append("+").append(this.getMod());
        }
        return temp.toString();
    }
}
