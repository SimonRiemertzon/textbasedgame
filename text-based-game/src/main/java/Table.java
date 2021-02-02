public class Table implements Interactable {

    @Override
    public void interact(Player player) {
        if(!player.getHasKey()) {
            player.setHasKey(true);
            System.out.println("You see a sparkly golden key on the table. You pick this up and put it in your pocket. " +
                    "Ouuuuu! ^ o ^, apperently you have pockets in this game");

        } else {
            System.out.println("You stare at a empty table");
        }
    }

    @Override
    public String getName() {
        return "a table";
    }
}
