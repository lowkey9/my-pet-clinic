package com.learn.mypetclinic.model;

import java.time.LocalTime;

public class Pet {
    private Owner owner;
    private PetType petType;
    private LocalTime birthday;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public LocalTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalTime birthday) {
        this.birthday = birthday;
    }
}
