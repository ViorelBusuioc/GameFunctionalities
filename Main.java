public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining heath: " + player.heathRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining heath: " + player.heathRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial heath is " + tim.heathRemaining());

    }
}
