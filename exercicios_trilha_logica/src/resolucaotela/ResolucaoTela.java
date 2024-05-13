package resolucaotela;

import java.awt.*;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        System.out.println("A resolução do sistema é");
        System.out.println(d.width + " X " + d.height);
    }
}
