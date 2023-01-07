public class Animal {
    String species;
    String name;
    Double weight;
    Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.weight = 3.0;
        this.alive = true;
    }

    public void feed() {
        if (!this.alive) {
            System.out.println("trochę za późno debilu");
        } else {
            this.weight += 0.5; // weight = weight + 0.5;
            System.out.println("dzięki za żarcie");
        }
    }

    public void takeForAWalk() {
        if (!this.alive) {
            System.out.println("halo policja jakiś zwyrol chodzi po mieście z martwym psem");
        } else {
            this.weight -= 0.5;
            System.out.println("dzięki za spacer");
            if (this.weight <= 0) {
                this.alive = false;
                System.out.println("nie no świetny spacer, kolejnego nie będzie");
            }
        }

    }
}
