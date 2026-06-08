// RADIUS DIGER SEKILLERDE KENAR YANI "SIDE" OLARAK KULLANILIYO

class Cube extends Square implements Volume {

    public Cube(double yaricap, String name) {
        super(yaricap, name);
    }

    @Override
    public double getVolume() {
        return yaricap * yaricap * yaricap;
    }
}

class Sphere extends Circle implements Volume {

    public Sphere(double yaricap, String name) {
        super(yaricap, name);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * 3.14 * yaricap * yaricap * yaricap;
    }
}

class Glome extends Sphere {

    public Glome(double yaricap, String name) {
        super(yaricap, name);
    }

    @Override
    public double getVolume() {
        return 0.5 * 3.14 * 3.14 * yaricap * yaricap * yaricap * yaricap;
    }
}

class Cylinder extends Circle implements Volume {
    double yukseklik;

    public Cylinder(double yukseklik, double yaricap, String name) {
        super(yaricap, name);
        this.yukseklik = yukseklik;
    }

    @Override
    public double getVolume() {
        return 3.14 * yaricap * yaricap * yukseklik;
    }
}