package com.shemegol.circle;


public class Circle {
    private double x;
    private double y;
    private double radius;

    Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус меньше 0");
        }
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус меньше 0");
        }
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void move(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void decrease(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Аргумент меньше 0");
        }
        if (value > radius) {
            throw new IllegalArgumentException("Аргумент больше радиуса");
        }
        radius -= value;
    }

    public void increase(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Аргумент меньше 0");
        }
        radius += value;
    }

    public boolean isPointInCircle(double x, double y) {
        return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) <= Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateDiameter() {
        return radius * 2;
    }

    public String toString() {
        return "Окружность с центром в точке [" + x + "," + y + "] и радиусом " + radius;
    }

}

