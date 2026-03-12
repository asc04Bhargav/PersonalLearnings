package com.spring.xml.ex1;

public class CircleService {
    private Circle c;

    public void drawCircel(){
        c.drawCircle();
    }

    public CircleService() {
    }

    public CircleService(Circle c) {
        this.c = c;
    }

    public Circle getC() {
        return c;
    }

    public void setC(Circle c) {
        this.c = c;
    }
}
