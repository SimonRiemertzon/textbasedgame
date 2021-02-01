public class Combat {

    public void combat (Player player, Player enemy) {

        do {
            double chance = Math.random();
            if (chance < 0.5) {
                System.out.println(player.getName() + " damages " + enemy.getName());
                enemy.takeDamage(10);
            }else {
                System.out.println(enemy.getName() + " damages " + player.getName());
                player.takeDamage(10);
            }

        } while (player.getHealthPoints() > 0 && enemy.getHealthPoints() > 0);

        if (player.getHealthPoints() > enemy.getHealthPoints()) {
            System.out.println("**** " + player.getName() + " wins ****");
        } else {
            System.out.println("**** " + enemy.getName() + " wins ****");
        }
    }



}

/*
    combat method (player, enemy)
    thread local random
    highest number wins
*/