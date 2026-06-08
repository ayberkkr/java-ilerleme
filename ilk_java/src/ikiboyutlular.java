// RADIUS DIGER SEKILLERDE KENAR YANI "SIDE" OLARAK KULLANILIYOR

class Circle extends Shape implements Area {
    double yaricap;

    public Circle(double yaricap, String name) {
        this.yaricap = yaricap;
        this.name = name;
    }

    @Override
    public double getArea() {
        return 3.14 * yaricap * yaricap;
    }
}

class Square extends Shape implements Area {
    double yaricap;

    public Square(double yaricap, String name) {
        this.yaricap = yaricap;
        this.name = name;
    }

    @Override
    public double getArea() {
        return yaricap * yaricap;
    }
}