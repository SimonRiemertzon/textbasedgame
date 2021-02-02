import java.util.concurrent.ThreadLocalRandom;

public class Combat {

    public static void combat (Player player, Player enemy) {

        do {
            double chance = Math.random();
            int rand = ThreadLocalRandom.current().nextInt(10)+1;

            if (chance < 0.5) {
                System.out.println(player.getName() + " damages " + enemy.getName());
                enemy.takeDamage(rand);
            }else {
                System.out.println(enemy.getName() + " damages " + player.getName());
                player.takeDamage(rand);
            }

        } while (player.getHealthPoints() > 0 && enemy.getHealthPoints() > 0);

        if (player.getHealthPoints() > enemy.getHealthPoints()) {
            System.out.println("**** " + player.getName() + " wins ****");
        } else {
            System.out.println("**** " + enemy.getName() + " wins ****");
        }
    }
