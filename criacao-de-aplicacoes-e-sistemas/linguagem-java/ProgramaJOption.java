import javax.swing.JOptionPane;

public class ProgramaJOption {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!", "Saudações", JOptionPane.INFORMATION_MESSAGE);

        int opcao = JOptionPane.showConfirmDialog(null, "Você gosta de programar em Java?", "Pergunta", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Que legal! Java é uma linguagem poderosa.");
        } else {
            JOptionPane.showMessageDialog(null, "Ah, uma pena. Talvez você mude de ideia!");
        }

        String[] opcoesAnimais = {"Cachorro", "Gato", "Pássaro", "Outro"};
        String animalEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha seu animal favorito:", "Seleção de Animal", JOptionPane.QUESTION_MESSAGE, null, opcoesAnimais, opcoesAnimais[0]);

        if (animalEscolhido != null) {
            JOptionPane.showMessageDialog(null, "Legal! Você gosta de " + animalEscolhido + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Você não escolheu nenhum animal. :(");
        }
    }
}
