package main.home033.bestcarpenterever;

public class MainBestCarpenter {
    public static void main(String[] args) {
        BestCarpenterEver bestCarpenterEver = new BestCarpenterEver();
        System.out.println(bestCarpenterEver.canBeRepaired(new Chair()));
        System.out.println(bestCarpenterEver.canBeRepaired(new Table()));
    }
}
