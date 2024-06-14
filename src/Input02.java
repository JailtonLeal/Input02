import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Não há entrada aqui, apenas uma mensagem,",
                "Titulo",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Título da caixa de diálogo",
                2,
                null,
                null,
                "Digite algo aqui.");
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Título da caixa de diálogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
