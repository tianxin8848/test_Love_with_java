import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

/**
 *
 * 飞机游戏的主窗口
 */
public class MyGameFrame<SpriteSheet, image> extends JFrame {
    /**
     * 加载图片
     */
    Image   bg  = GameUtil.getImage("images/bg.jpg");
    Image   plane  = GameUtil.getImage("images/plane.png");

    /**
     * 画笔调用
     * @param tx_g
     */
    public  void paint(Graphics tx_g){

        tx_g.drawImage(plane, 250, 250, null);



    }

/**
 * 初始化窗口
 *
 */
    public void tx_launchFranme(){
        this.setTitle("田欣的作品");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);

      this.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
    }

    public static void main(String[] args) {
         MyGameFrame tx_fm =new MyGameFrame();
         tx_fm.tx_launchFranme();
    }
}
