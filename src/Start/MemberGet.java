
package Start;

public class MemberGet extends javax.swing.JFrame {

    public MemberGet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        GongButton = new javax.swing.JButton();
        ProjectButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TitleField = new javax.swing.JTextField();
        ContentField = new javax.swing.JTextField();
        LinkField = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        ContentLabel = new javax.swing.JLabel();
        LinkLabel = new javax.swing.JLabel();
        UploadButton = new javax.swing.JButton();

        setSize(800,500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));
        jPanel1.setBackground(new java.awt.Color(80, 175, 217));

        logo.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스크린샷_2023-08-16_192857-removebg-preview 1 (2).png")); // NOI18N

        GongButton.setBackground(new java.awt.Color(80, 175, 217));
        GongButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        GongButton.setForeground(new java.awt.Color(255, 255, 255));
        GongButton.setText("공모전");
        GongButton.setBorderPainted(false);     //외곽선 없애기
        GongButton.setFocusPainted(false);      //클릭했을때 외곽선 없애기
        GongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GongButtonActionPerformed(evt);
            }
        });

        ProjectButton.setBackground(new java.awt.Color(80, 175, 217));
        ProjectButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        ProjectButton.setForeground(new java.awt.Color(255, 255, 0));
        ProjectButton.setText("프로젝트");
        ProjectButton.setBorderPainted(false);      //외곽선 없애기
        ProjectButton.setFocusPainted(false);       //클릭했을때 외곽선 없애기

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ProjectButton)
                                .addGap(27, 27, 27)
                                .addComponent(GongButton)
                                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GongButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TitleLabel.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        TitleLabel.setForeground(new java.awt.Color(102, 102, 102));
        TitleLabel.setText("제목");

        ContentLabel.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        ContentLabel.setForeground(new java.awt.Color(102, 102, 102));
        ContentLabel.setText("내용");

        LinkLabel.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        LinkLabel.setForeground(new java.awt.Color(102, 102, 102));
        LinkLabel.setText("링크");

        UploadButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        UploadButton.setText("게시");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LinkLabel)
                                        .addComponent(ContentLabel)
                                        .addComponent(TitleLabel)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(UploadButton)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TitleField)
                                                        .addComponent(ContentField)
                                                        .addComponent(LinkField, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))))
                                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(TitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(ContentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ContentField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(LinkLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LinkField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UploadButton)
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();

    }

    private void GongButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Gong gongFrame = new Gong();
        gongFrame.setVisible(true);
        gongFrame.pack();
        gongFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Project ProjectFrame = new Project();
        ProjectFrame.setVisible(true);
        ProjectFrame.pack();
        ProjectFrame.setLocationRelativeTo(null);
        this.dispose(); //현재 로그인 창 닫음
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberGet().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField ContentField;
    private javax.swing.JLabel ContentLabel;
    private javax.swing.JButton GongButton;
    private javax.swing.JTextField LinkField;
    private javax.swing.JLabel LinkLabel;
    private javax.swing.JButton ProjectButton;
    private javax.swing.JTextField TitleField;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton UploadButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
}
