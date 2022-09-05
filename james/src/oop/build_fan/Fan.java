package oop.build_fan;

public class Fan {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass(FanClass.FAST, true, 10, "yellow");
        System.out.println(fan1);
        FanClass fan2 = new FanClass(FanClass.MEDIUM, false, 5, "blue");
        System.out.println(fan2);
    }
}

class FanClass {

    static int SLOW = 1;
    static int MEDIUM = 2;
    static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public FanClass(int fast, boolean b, int i, String yellow) {
        this.speed = fast;
        this.on = b;
        this.radius = i;
        this.color = "blue";
    }

    public int getSlow() {
        return this.SLOW = SLOW;
    }

    public int getMedium() {
        return this.MEDIUM = MEDIUM;
    }

    public  int getFast() {
        return this.FAST = FAST;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getSpeed() {
        String s = "";
        switch (speed) {
            case 1:
                s = "SLOW";
                break;
            case 2:
                s = "MEDIUM";
                break;
            case 3:
                s = "FAST";
        }
        return s;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (on == true) {
            return " Fan speed: " + getSpeed() + ", color: " + color +
                    ", radius: " + radius + " ";
        } else {
            return "Fan color: " + color + ", radius: " + radius +
                    "fan is off";
        }
    }
}
