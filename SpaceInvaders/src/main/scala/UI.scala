import java.awt.Color


import javax.swing.{JFrame, JPanel}

class UI {

  def criaJanela: Unit = {
    val janela: JFrame = new JFrame("Space Invaders");
    val painel: JPanel = new JPanel();

    janela.setSize(700,700)
    janela.setBackground(Color.black)
    janela.add(painel)
    janela.setVisible(true)


  }
}
