package Start;

public class Project extends javax.swing.JFrame {

    public Project() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        ProjectButton = new javax.swing.JButton();
        GongButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        MemGetButton = new javax.swing.JButton();

        setSize(800,500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setBackground(new java.awt.Color(80, 175, 217));

        logo.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스크린샷_2023-08-16_192857-removebg-preview 1 (2).png"));

        ProjectButton.setBackground(new java.awt.Color(80, 175, 217));
        ProjectButton.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        ProjectButton.setForeground(new java.awt.Color(255, 255, 0));
        ProjectButton.setText("프로젝트");
        ProjectButton.setPreferredSize(new java.awt.Dimension(73, 26));
        ProjectButton.setBorderPainted(false);      //외곽선 없애기
        ProjectButton.setFocusPainted(false);       //클릭했을때 외곽선 없애기
        ProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GongButton.setBackground(new java.awt.Color(80, 175, 217));
        GongButton.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        GongButton.setForeground(new java.awt.Color(255, 255, 255));
        GongButton.setText("공모전");
        GongButton.setBorderPainted(false);     //외곽선 없애기
        GongButton.setFocusPainted(false);      //클릭했을때 외곽선 없애기
        GongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GongButtonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 734, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 363, Short.MAX_VALUE)
        );

        MemGetButton.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        MemGetButton.setForeground(new java.awt.Color(51, 0, 204));
        MemGetButton.setText("팀원 모집하기");
        MemGetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemGetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MemGetButton)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(MemGetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    private void MemGetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MemberGet memberGetFrame = new MemberGet();
        memberGetFrame.setVisible(true);
        memberGetFrame.pack();
        memberGetFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    private void GongButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Gong gongFrame = new Gong();
        gongFrame.setVisible(true);
        gongFrame.pack();
        gongFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    private javax.swing.JButton ProjectButton;
    private javax.swing.JButton GongButton;
    private javax.swing.JButton MemGetButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
