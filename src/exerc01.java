import javax.swing.*; // pacote que exibe conteúdos na janela
import java.awt.*; // pacote que exibe conteúdos na janela
import java.awt.event.*; // pacote que trabalha com os eventos

public class exerc01 extends JFrame{
    JLabel rotulo1,rotulo2,resultado1,resultado2,desenvolvedor;
    JTextField texto1,texto2;
    JButton somar,subtrair,multiplicar,dividir,
            limpar,habilitar,desabilitar,ocultar,exibir,sair;
    
    public exerc01() {
        super("Mini Calculadora");
        Container tela = getContentPane();
        tela.setBackground(new Color(227, 227, 227)); // Cor da página
        setLayout(null);
        
        // Icon
        ImageIcon icone = new ImageIcon("calculadora.png");
        setIconImage(icone.getImage());
        
        rotulo1 = new JLabel("1º Número:");
        rotulo2 = new JLabel("2º Número:");
        desenvolvedor = new JLabel("Desenvolvido por Amanda - 2ºDS-AMS");
        desenvolvedor.setFont(new Font("Courier New",Font.BOLD,14));
        
        resultado2 = new JLabel("");
        resultado1 = new JLabel("Resultado:");
        resultado1.setForeground(Color.RED);
        
        texto1 = new JTextField("");
        texto2 = new JTextField("");
        
        // Buttons
        somar = new JButton ("+");
        subtrair = new JButton ("-");
        multiplicar = new JButton ("*");
        dividir = new JButton ("/");
        
        limpar = new JButton ("Limpar");
        habilitar = new JButton ("Habilitar");
        desabilitar = new JButton ("Desabilitar");
        ocultar = new JButton ("Ocultar");
        exibir = new JButton ("Exibir");
        sair = new JButton ("Sair");
        
        resultado1.setBounds(50,100,80,20); resultado2.setBounds(120,100,200,20);
        rotulo1.setBounds(50,20,80,20); rotulo2.setBounds(50,60,80,20);
        texto1.setBounds(120,20,80,20); texto2.setBounds(120,60,80,20); 
        somar.setBounds(350,20,50,20); subtrair.setBounds(350,40,50,20);
        multiplicar.setBounds(350,60,50,20); dividir.setBounds(350,80,50,20);
        limpar.setBounds(350,100,100,20); sair.setBounds(350,200,100,20); 
        habilitar.setBounds(50,150,100,20); desabilitar.setBounds(150,150,100,20); 
        ocultar.setBounds(250,150,100,20); exibir.setBounds(350,150,100,20); 
        desenvolvedor.setBounds(80,200,500,100);
         
        // Funcionamento dos buttons
        somar.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    double result = 0;
                    result = Double.parseDouble(texto1.getText()) + Double.parseDouble(texto2.getText());
                    resultado2.setVisible(true);
                    resultado2.setText("A adição é " + result);
                }
            }
        );
        subtrair.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    double result = 0;
                    result = Double.parseDouble(texto1.getText()) - Double.parseDouble(texto2.getText());
                    resultado2.setVisible(true);
                    resultado2.setText("A subtração é " + result);
                }
            }
        );
        multiplicar.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    double result = 0;
                    result = Double.parseDouble(texto1.getText()) * Double.parseDouble(texto2.getText());
                    resultado2.setVisible(true);
                    resultado2.setText("A multiplicação é " + result);
                }
            }
        );
        dividir.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    double result = 0;
                    result = Double.parseDouble(texto1.getText()) / Double.parseDouble(texto2.getText());
                    resultado2.setVisible(true);
                    resultado2.setText("A divisão é " + result);
                }
            }
        );
        limpar.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setText(null);
                        texto2.setText(null);
                        resultado2.setText(null);
                        texto1.requestFocus();
                }
            }
        );
        habilitar.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        resultado1.setEnabled(true);
                        resultado2.setEnabled(true);
                }
            }
        );
        desabilitar.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        resultado1.setEnabled(false);
                        resultado2.setEnabled(false);
                }
            }
        );
        ocultar.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        resultado1.setVisible(false);
                        resultado2.setVisible(false);
                }
            }
        );
        exibir.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        resultado1.setVisible(true);
                        resultado2.setVisible(true);
                }
            }
        );
        sair.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );

        tela.add(resultado1); tela.add(resultado2); 
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(somar); tela.add(subtrair);
        tela.add(multiplicar); tela.add(dividir);
        tela.add(limpar); tela.add(sair);
        tela.add(habilitar); tela.add(desabilitar);
        tela.add(ocultar); tela.add(exibir);
        tela.add(desenvolvedor);
        
        // Atalhos
        getRootPane().setDefaultButton(somar);
        habilitar.setMnemonic(KeyEvent.VK_H); 
        desabilitar.setMnemonic(KeyEvent.VK_D); 
        ocultar.setMnemonic(KeyEvent.VK_O); 
        exibir.setMnemonic(KeyEvent.VK_E); 
        limpar.setMnemonic(KeyEvent.VK_L);
        sair.setMnemonic(KeyEvent.VK_F4); // Alt + F4
        
        setSize(500,350);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        exerc01 app = new exerc01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}