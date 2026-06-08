public class Main {

    public static void main(String[] args) {

        Circle daire = new Circle(5.0, "Daire");

        Square kare = new Square(4.0, "Kare");

        Cube kup = new Cube(3.0, "Kup");

        Sphere kure = new Sphere(3.0, "Kure");

        Cylinder silindir = new Cylinder(5.0, 2.0, "Silindir");

        Glome glome = new Glome(2.0, "Glome");

        // **************************************************************** //

        System.out.println(daire.getName() + " Alani: " + daire.getArea());
        System.out.println(kare.getName() + " Alani: " + kare.getArea());
        System.out.println(kup.getName() + " Hacmi: " + kup.getVolume());
        System.out.println(kure.getName() + " Hacmi: " + kure.getVolume());
        System.out.println(silindir.getName() + " Hacmi: " + silindir.getVolume());
        System.out.println(glome.getName() + " Hacmi: " + glome.getVolume());
    }
}