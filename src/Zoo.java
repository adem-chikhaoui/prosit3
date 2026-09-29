public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo !");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + " :");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("- " + animals[i]);
        }
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            return null;
        }
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name + ", Ville: " + city + ", Cages: " + nbrCages + ", Animaux: " + nbrAnimals);
    }

    @Override
    public String toString() {
        return "Zoo [Nom: " + name + ", Ville: " + city + ", Cages: " + nbrCages + ", Animaux: " + nbrAnimals + "]";
    }
}