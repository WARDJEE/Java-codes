package week9.VirtualReality;

public class Main {
    public static void main() {
        Entity[] entities = new Entity[8];
        entities[0] = new Room("kitchen", new double[]{0, 0, 0});
        entities[1] = new Table("kitchen table", new double[]{10, 10, 0});
        entities[2] = new Room("dining room", new double[]{100, 100, 0});
        entities[3] = new Table("dining table", new double[]{110, 110, 0});
        entities[4] = new NonPlayableCharacter("ghost", new double[]{20, 20, 0}, 2);
        entities[5] = new NonPlayableCharacter("monster", new double[]{120, 120, 0}, 0);
        entities[6] = new Player("player1", new double[]{30, 30, 0}, 3);
        entities[7] = new Player("player2", new double[]{130, 130, 0}, 1);

        for (Entity entity : entities) {
            System.out.println(entity);
        }
        // Vul aan

        // Alle verplaatsbare objecten worden verplaatst met een vector (5,5,5)
        for (Entity entity : entities) {
            if (entity instanceof Movable movable) {
                movable.move(new double[]{5, 5, 5});
            }
        }

        // 3 keer achter elkaar worden alle levende objecten vermoord
        for (int round = 0; round < 3; round++) {
            for (Entity entity : entities) {
                if (entity instanceof Alive alive) {
                    alive.kill();
                }
            }
        }

        // Alle non playable characters worden geanimeerd
        for (Entity entity : entities) {
            if (entity instanceof NonPlayableCharacter npc) {
                npc.animate();
            }
        }
        // Alle zichtbare objecten worden getoond
        for (Entity entity : entities) {
            if (entity instanceof Visible visible) {
                visible.draw();
            }
        }
    }
}
