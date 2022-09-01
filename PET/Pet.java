public class Pet {
    String name;
    float trustlevel;
    int petlevel;
    boolean ishappy;

    public void petDialouge() {
        System.out.println("--Pet Information--" + "\n" + "Name: " + name + "\n" + "Trust Level: " + trustlevel + "\n" + "Pet Level: " + petlevel + "\n" + "Is the pet happy:" + ishappy + "\n" + "--------------" + "\n");
    }

    public Pet(String petName, float petTrustlevel, int petPetlevel, boolean petIshappy) {
        name = petName;
        trustlevel = petTrustlevel;
        petlevel = petPetlevel;
        ishappy = petIshappy;
    }
}
