package com.sezeme.section01.creation.subsection07.prototype;

public class Prototype implements Cloneable {
    private String data;

    public Prototype(String data) {
        this.data = data;
    }

    public void showData() {
        System.out.println("Data: " + data);
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype original = new Prototype("Original");
        Prototype clone = original.clone();

        original.showData();
        clone.showData();
    }
}
