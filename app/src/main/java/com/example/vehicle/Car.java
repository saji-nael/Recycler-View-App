package com.example.vehicle;

public class Car {
    private String name;
    private int founded;
    private String founder;
    private String slogan;
    private String example;
    private int imageID;

    public static final Car[] cars = {

            /*(Company,Founded,Founder,Slogan,Example)*/
            new Car("BMW", 1916, "Karl Rapp / Camillo Castiglioni / Franz Josef Popp", "Sheer Driving Pleasure", "BMW X6", R.drawable.bmw),
            new Car("Ford", 1903, "Henry Ford", "Go Further", "Ford Mustang", R.drawable.ford),
            new Car("Hyundai", 1967, "Chung Ju-yung", "New Thinking, New Possibilities", "Hyundai Sonata", R.drawable.hyundai),
            new Car("Mazda", 1920, "Jujiro Matsuda", "Zoom-Zoom", "mazda 3", R.drawable.mazda),
            new Car("Toyota", 1937, "Kiichiro Toyoda", "Let's Go Places", "Toyota Corolla", R.drawable.toyota),
            new Car("Chevrolet", 1911, "Louis Chevrolet & William C. Durant", "Find New Roads", "Chevrolet camaro", R.drawable.chavelot),
            new Car("Jaguar", 1922, "William Lyons & William Walmsley", "How Alive Are You?", "Jaguar XE", R.drawable.jaguar),
            new Car("Volkswagen", 1937, "German Labour Front (DAF) & Adolf Hitler", "Das Auto.", "Volkswagen Touran", R.drawable.volkswagen),
            new Car("Subaru", 1953, "Kenji Kita", "Confidence in Motion", "Subaru Impreza", R.drawable.subaru),
            new Car("Dodge", 1900, "John Francis Dodge / Horace Elgin Dodge", "Domestic. Not Domesticated", "Dodge Charger", R.drawable.dodge),
    };

    public Car(String name, int founded, String founder, String slogan, String example, int imageID) {
        this.name = name;
        this.founded = founded;
        this.founder = founder;
        this.slogan = slogan;
        this.example = example;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public int getFounded() {
        return founded;
    }

    public String getFounder() {
        return founder;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getExample() {
        return example;
    }

    public int getImageID() {
        return imageID;
    }

    @Override
    public String toString() {
        return
                "name:'" + name + "\n" +
                        " founded:" + founded + "\n" +
                        " founder:'" + founder + "\n" +
                        " slogan:'" + slogan + "\n" +
                        " example:'" + example + "\n"

                ;
    }
}
