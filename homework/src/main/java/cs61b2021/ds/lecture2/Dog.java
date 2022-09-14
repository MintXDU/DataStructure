package cs61b2021.ds.lecture2;

public class Dog {
    public int weightInPounds;

    public Dog(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("Yiyi...");
        } else if (weightInPounds < 30) {
            System.out.println("Bark!");
        } else {
            System.out.println("Yooo...");
        }
    }
}
