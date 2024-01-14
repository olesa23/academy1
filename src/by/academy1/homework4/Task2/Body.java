package by.academy1.homework4.Task2;

public class Body {

    public Heart heart;
    public Lungs lungs;

    public Body() {
        Heart heart = new Heart();
        this.heart = heart;
        Lungs lungs = new Lungs();
        this.lungs = lungs;
    }

    public void live() {
        lungs.live();
        heart.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea" +
                "And I believe that you are free, and life has only begun.");
    }
}

class Heart {
    public void live() {
        int i = 0;
        for (i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 100 == 0) ;
            System.out.println("Knock-knock-knockin' on heaven's door");
        }
    }
}


class Lungs {
    public void live() {
        int i = 0;
        for (i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 50 == 0) ;
            System.out.println("breathe in");

            if (i % 100 == 0) ;
            System.out.println("breathe out");
        }
    }
}


