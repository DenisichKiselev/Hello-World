import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class GameWindow extends JFrame {
    private  static GameWindow game_window;
    private static  long last_frame_time;
    private static Image background;
    private  static Image game_over;
    private static Image drop;
    private static double drop_left = 200;
    private  static double drop_top = -100;
    private  static float v = 200;
    private static int score;
    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
        game_window=new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setVisible(true);
        game_window.setTitle("Поймай Каплю");
        game_window.setLocation(200,100);
        game_window.setSize(906,478);
        last_frame_time = System.nanoTime();
        GameFeild gameFeild = new GameFeild();
        gameFeild.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            double drop_right = drop_left + drop.getWidth(null);
            double drop_botton = drop_top + drop.getHeight(null);
            boolean is_drop = x>= drop_left && x<=drop_right && y >= drop_top && y<=drop_botton;
            if (is_drop){
                drop_top = -100;
                drop_left = (int) (Math.random()*(gameFeild.getWidth() - drop.getWidth(null)));
                v = v + 10;
                score ++;
                game_window.setTitle("Score:"+score);
            }
            }

        });
        game_window.add(gameFeild);

        game_window.setResizable(true);
    }
    private  static void  onRepeat (Graphics g){
        long current_time = System.nanoTime();
        float delta_time= (last_frame_time - current_time)*0.000000001f;
        last_frame_time = current_time;
        drop_top = drop_top - v*delta_time;
       // drop_left = drop_left - v*delta_time;
        g.drawImage(background,0,0,null);
        g.drawImage(drop, (int)drop_left, (int)drop_top, null);
        if (drop_top> game_window.getHeight())g.drawImage(game_over, 180,120,null);

    }
    private static class GameFeild extends JPanel{
        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            onRepeat(g);
            repaint();
        }


    }
}
