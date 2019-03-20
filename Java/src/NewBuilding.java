
class NewBuilding {
    private int width;
    private int height;

    NewBuilding () {
        width = 150;
        height = 150;

    }

    NewBuilding(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int calculateArea() {
        return  width * height;


    }
}