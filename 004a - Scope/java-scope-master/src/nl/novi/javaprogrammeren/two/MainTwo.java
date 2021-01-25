//package nl.novi.javaprogrammeren.two;
//
//import java.util.Random;
//
//public class MainTwo {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            int totalsum = 0;
//            Random random = new Random();
//            totalsum = totalsum + random.nextInt();
//        }
//    }
//}
// int totalsum =0 staat binnen de loop, moet ervoor staan, anders wordt totalsum elke keer weer op nul gezet
// idem voor object random, dat hoef je maar 1 keer te declareren.


// create instance of Random class
//Random rand = new Random();
//
//        // Generate random integers in range 0 to 999
//        int rand_int1 = rand.nextInt(1000);
//        int rand_int2 = rand.nextInt(1000);
//
//        // Print random integers
//        System.out.println("Random Integers: "+rand_int1);
//        System.out.println("Random Integers: "+rand_int2);
//
//        // Generate Random doubles
//        double rand_dub1 = rand.nextDouble();
//        double rand_dub2 = rand.nextDouble();
//
//        // Print random doubles
//        System.out.println("Random Doubles: "+rand_dub1);
//        System.out.println("Random Doubles: "+rand_dub2);



        package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {
    public static void main(String[] args) {
        int totalsum = 0;
        Random random = new Random();/* maak object random aan uit classe Random*/

        for (int i = 0; i < 10; i++) {

            totalsum = totalsum + random.nextInt();/* random.nextInt genereert volgende willekeurige int*/
        }

        System.out.println("De som van alle random-getallen is: " + totalsum);
    }
}