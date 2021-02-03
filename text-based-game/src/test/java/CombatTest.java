import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombatTest {

    @Test
    void PlayerBeatsEnemyTest() {
        Player p1 = new Player(100, "Bosse");
        Player p2 = new Player(100, "Enemy");
        p2.takeDamage(10);
        assertTrue(p2.getHealthPoints() == 90);
    }

    @Test
    void EnemyBeatsPlayerTest() {
        Player p1 = new Player(100, "Bosse");
        Player p2 = new Player(100, "Enemy");
        p1.takeDamage(10);
        assertTrue(p1.getHealthPoints() == 90);
    }

    @Test
    void EnemyDeathTest() {
        Player p1 = new Player(100, "Bosse");
        Player p2 = new Player(20, "Enemy");
        Combat.combat(p1, p2);
        int enemyHealthAfterCombat = p2.getHealthPoints();
        assertTrue(enemyHealthAfterCombat <= 0);
    }

    @Test
    void PlayerDeathTest() {
        Player p1 = new Player(40, "Bosse");
        Player p2 = new Player(100, "Enemy");
        Combat.combat(p1, p2);
        int playerHealthAfterCombat = p1.getHealthPoints();
        assertTrue(playerHealthAfterCombat <= 0);
    }
}