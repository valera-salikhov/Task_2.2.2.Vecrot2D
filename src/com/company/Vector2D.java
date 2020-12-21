package com.company;

import java.util.Locale;

public class Vector2D {
    public double vX, vY;

    public Vector2D() {
        vX = 1;
        vY = 1;
    }

    public Vector2D(double X, double Y) {
        vX = X;
        vY = Y;
    }

    public Vector2D(Vector2D v) {
        this.vX = v.vX;
        this.vY = v.vY;
    }

    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f, %.2f", this.vX, this.vY) + ")");
    }

    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public Vector2D add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
        return this;
    }

    public Vector2D sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
        return this;
    }

    public Vector2D scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
        return this;
    }

}