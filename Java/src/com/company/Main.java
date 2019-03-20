package com.company;

class NewBuilding {
    private int width;
    private int height;

    NewBuilding () {
        width = 100;
        height = 100;

    }


    NewBuilding(int width, int height) {
        this.width = width;
        this.height = height;
    }
     int calculateArea() {
        return  width * height;


    }
}
