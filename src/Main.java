public class Main {
    public static void main(String[] args) {
        int totalCost = 0;
        System.out.println("Enter maintenance cost for Spring");
        int springCost = 50;
        totalCost = totalCost + springCost;
        System.out.println("Enter maintenance cost for Summer");
        int summerCost = 65;
        totalCost = totalCost + summerCost;
        System.out.println("Enter maintenance cost for Fall");
        int fallCost = 20;
        totalCost = totalCost + fallCost;
        System.out.println("Enter maintenance cost for Winter");
        int winterCost = 15;
        totalCost = totalCost + winterCost;

        System.out.println("Total yearly maintenance cost " + totalCost);
    }
}