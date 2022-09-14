package cs61b2021.ds.lecture2;

public class DogLauncher {
    public static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);

        Dog[] manyDoggs = new Dog[4];
        manyDoggs[0] = smallDog;
        manyDoggs[1] = mediumDog;
        manyDoggs[2] = new Dog(130);

        for (int i = 0; i < manyDoggs.length - 1; i++) {
            manyDoggs[i].makeNoise();
        }
    }
}
