
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JTextArea;

public class ShortcutKey extends javax.swing.JFrame {
    /**
     * text 01 String
     */
    private final String TEXT_01 = "{\"username\": \"adminlocal\", \"password\": \"123456aA@\"}";
    /**
     * text 02 String
     */
    private final String TEXT_02 = "tuyennv18";
    /**
     * text 03 String
     */
    private final String TEXT_03 = "HNXyhu@894352#1";
    /**
     * text 04 String
     */
    private final String TEXT_04 = "N8Wn5GENrtHjGXiTKYj7";
    /**
     * text 05 String
     */
    private final String TEXT_05 = "spring.datasource.url=jdbc:postgresql://localhost:5432/\n" 	+
				    "spring.datasource.username=postgres\n" 				+
				    "spring.datasource.password=postgres\n" 				+

				    "spring.jpa.hibernate.ddl-auto=update\n" 				+
				    "spring.jpa.hibernate.show-sql=true\n" 				+

				    "spring.datasource.url=jdbc:mysql://localhost:3306/\n" 		+
				    "spring.datasource.username=root\n" 				+
				    "spring.datasource.password=\n" 					+

				    "@RestController\n" 						+

				    "@Autowired\n"							+
				    "private final StudentRepository studentRepository;\n"		+

				    "@GetMapping\n"							+
				    "public List<StudentEntity> get() {\n"				+
				    "return studentRepository.findAll();\n"				+
				    "}\n"								;


    public ShortcutKey() {
        initComponents();
        setAlwaysOnTop(true);
        setLocation(1900, 200);
        setResizable(false);

        // set text
        jTextField1.setText(TEXT_01);
        jTextField2.setText(TEXT_02);
        jTextField3.setText(TEXT_03);
        jTextField4.setText(TEXT_04);
        jTextField5.setText(TEXT_05);

        // set position
        jTextField1.setCaretPosition(0);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 9));
        jLabel1.setText("01");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 9));
        jLabel2.setText("02");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 9));
        jLabel3.setText("03");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 9));
        jLabel4.setText("04");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 9));
        jLabel5.setText("05");

        jTextField1.setFont(new java.awt.Font("Ubuntu", 0, 12));
        jTextField1.setText("jTextField1");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Ubuntu", 0, 12));
        jTextField2.setText("jTextField1");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Ubuntu", 0, 12));
        jTextField3.setText("jTextField1");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jTextField4.setText("jTextField1");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jTextField5.setText("jTextField1");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)

                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel2))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

            )
        );

        pack();
    }

    public void copy(String text) {
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = defaultToolkit.getSystemClipboard();
        clipboard.setContents(new StringSelection(text), null);
    }

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {
        copy(jTextField1.getText());
    }

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {
        copy(jTextField2.getText());
    }

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {
        copy(jTextField3.getText());
    }

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {
        copy(jTextField4.getText());
    }

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {
        copy(jTextField5.getText());
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShortcutKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShortcutKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShortcutKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShortcutKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShortcutKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;

    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextArea jTextField5;

}
