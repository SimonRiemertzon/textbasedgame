import java.util.concurrent.ThreadLocalRandom;
public class Combat {
    /**
     * This class gets players from Player class, generate a battle between player and enemy before printing the final winner.
     * @param player from Player class.
     * @param enemy from Player class.
     */
    public static void combat (Player player, Player enemy) {

        do {
            double chance = Math.random();
            int rand = ThreadLocalRandom.current().nextInt(10)+1;

            /**
             * Random nr is generated to choose who's turn it is and thereby the damage to opponent.
             */
            if (chance < 0.5) {
                System.out.println(player.getName() + " damages " + enemy.getName());
                enemy.takeDamage(rand);
            }else {
                System.out.println(enemy.getName() + " damages " + player.getName());
                player.takeDamage(rand);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /**
             * do while loop will run until both hit 0 healthPoints.
             */

        } while (player.getHealthPoints() > 0 && enemy.getHealthPoints() > 0);

        /**
         * Announcement of winner.
         */

        if (player.getHealthPoints() > enemy.getHealthPoints()) {
            System.out.println("**** " + player.getName() + " wins ****");
        } else {
            System.out.println("**** " + enemy.getName() + " wins ****");
        }
    }
}



