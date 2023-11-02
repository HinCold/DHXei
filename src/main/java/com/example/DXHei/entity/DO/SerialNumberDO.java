package com.example.DXHei.entity.DO;

public class SerialNumberDO {
    private String name;

    private Integer value;

    private Integer step;

    public SerialNumberDO(String name, Integer value, Integer step) {
        this.name = name;
        this.value = value;
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }
}