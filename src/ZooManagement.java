public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félins", "Simba", 5, true);
        Animal tiger = new Animal("Félins", "Sher Khan", 4, true);

        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Zoo otherZoo = new Zoo("Friguia", "Bouficha");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(lion);

        myZoo.displayAnimals();

        System.out.println("Position de Simba : " + myZoo.searchAnimal(lion));

        myZoo.removeAnimal(lion);
        System.out.println("Après suppression :");
        myZoo.displayAnimals();

        Zoo maxZoo = Zoo.comparerZoo(myZoo, otherZoo);
        if (maxZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + maxZoo.name);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }
    }
}