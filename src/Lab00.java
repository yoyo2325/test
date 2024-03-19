import javax.swing.JOptionPane;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class Lab10 {
	123333333
    public static void main(String[] args) {
        String filename = JOptionPane.showInputDialog("What robot world?");
        Display.openWorld("maps/" + filename + ".map");
        Display.setSpeed(10);
        Athlete athlete = new Athlete(1, 1, Display.NORTH, 0);

        Point destination = bfs(athlete);

        if (destination != null) {
            System.out.println("Shortest path found! Destination at: (" + destination.x + ", " + destination.y + ")");
            athlete.putBeeper(); // 放置一个 Beeper
        } else {
            System.out.println("No path found to destination!");
        }
    }

    public static Point bfs(Athlete athlete) {
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[Display.getWidth()][Display.getHeight()];

        queue.offer(new Point(athlete.getX(), athlete.getY()));

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int x = current.x;
            int y = current.y;

            if (athlete.nextToABeeper()) {
                return current;
            }

            if (visited[x][y]) {
                continue;
            }

            visited[x][y] = true;

            athlete.move();

            for (int i = 0; i < 4; i++) {
                if (athlete.frontIsClear()) {
                    queue.offer(new Point(athlete.getX(), athlete.getY()));
                }
                athlete.turnLeft();
            }
        }

        return null;
    }
}