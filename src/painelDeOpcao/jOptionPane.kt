package painelDeOpcao

import javax.swing.JOptionPane

fun main(args: Array<String>) {
    //Pede o nome do usuário
    val nome = JOptionPane.showInputDialog("Digite seu nome")

    // Formata a mensagem de saída
    val saida = String.format("%s %s", "Bem-vindo" , nome)

    // Apresenta o texto em interface gráfica
    JOptionPane.showMessageDialog(null,saida)


}

