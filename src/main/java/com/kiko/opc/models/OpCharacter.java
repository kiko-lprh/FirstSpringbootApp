package com.kiko.opc.models;

import jakarta.persistence.*;

@Entity
public class OpCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column
    private String Name;
    @Column
    private String Occupation;
    @Column
    private int Age;
    @Column
    private String dfPower;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDfPower() {
        return dfPower;
    }

    public void setDfPower(String dfPower) {
        this.dfPower = dfPower;
    }

}
