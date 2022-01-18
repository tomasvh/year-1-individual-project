package com.npcmaker.fxmlcontrollers;

import javafx.beans.property.*;

public class JavaFXTableData {
    private StringProperty name = new SimpleStringProperty();
    private ObjectProperty<Integer> dice = new SimpleObjectProperty<>(0);
    private ObjectProperty<Integer> mod = new SimpleObjectProperty<>(0);
    private final ObjectProperty<Integer> id = new SimpleObjectProperty<>(null);

    public JavaFXTableData(){
    }

    public JavaFXTableData(String name, Integer dice, Integer mod, Integer id) {
        this.name.set(name);
        this.dice.set(dice);
        this.mod.set(mod);
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public Integer getDice() {
        return dice.getValue();
    }

    public ObjectProperty<Integer> diceProperty() {
        return dice;
    }

    public void setDice(Integer dice) {
        this.dice.set(dice);
    }

    public Integer getMod() {
        return mod.getValue();
    }

    public ObjectProperty<Integer> modProperty() {
        return mod;
    }

    public void setMod(Integer mod) {
        this.mod.set(mod);
    }

    public Integer getId() {
        return id.getValue();
    }

    public ObjectProperty<Integer> idProperty() {
        return id;
    }

    public void setId(Integer id) {
        this.id.set(id);
    }
}
