
package Start;

public class Teamget extends javax.swing.JFrame {

    public Teamget() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        ProjectButton = new javax.swing.JButton();
        GongButton = new javax.swing.JButton();
        MiddlePanel = new javax.swing.JPanel();
        DetailButton = new javax.swing.JButton();
        TeamgetButton = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();
        StateLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        WriterLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MemberGetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TopPanel.setBackground(new java.awt.Color(80, 175, 217));
        TopPanel.setPreferredSize(new java.awt.Dimension(390, 77));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스크린샷_2023-08-16_192857-removebg-preview 1 (2).png"));

        ProjectButton.setBackground(new java.awt.Color(80, 175, 217));
        ProjectButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        ProjectButton.setForeground(new java.awt.Color(255, 255, 0));
        ProjectButton.setText("프로젝트");
        ProjectButton.setBorderPainted(false);           //외곽선 없애기
        ProjectButton.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        ProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectButtonActionPerformed(evt);
            }
        });

        GongButton.setBackground(new java.awt.Color(80, 175, 217));
        GongButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        GongButton.setForeground(new java.awt.Color(255, 255, 255));
        GongButton.setText("공모전");
        GongButton.setBorderPainted(false);           //외곽선 없애기
        GongButton.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        GongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GongButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
                TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ProjectButton)
                                .addGap(51, 51, 51)
                                .addComponent(GongButton)
                                .addGap(29, 29, 29))
        );
        TopPanelLayout.setVerticalGroup(
                TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(GongButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Logo))
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        MiddlePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        DetailButton.setBackground(new java.awt.Color(204, 204, 204));
        DetailButton.setText("세부사항");
        DetailButton.setIconTextGap(0);
        DetailButton.setPreferredSize(new java.awt.Dimension(400, 50));
        DetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailButtonActionPerformed(evt);
            }
        });
        MiddlePanel.add(DetailButton);

        TeamgetButton.setText("팀원모집");
        TeamgetButton.setIconTextGap(0);
        TeamgetButton.setPreferredSize(new java.awt.Dimension(400, 50));
        MiddlePanel.add(TeamgetButton);

        BottomPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        StateLabel.setText("상태");

        TitleLabel.setText("제목");

        WriterLabel.setText("작성자");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("모집중");

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel6.setText("파이썬으로 게임 만들어보신 분중에 같이 ...");

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel7.setText("장하영");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel7)
                                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
                BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BottomPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(StateLabel)
                                .addGap(268, 268, 268)
                                .addComponent(TitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(WriterLabel)
                                .addGap(47, 47, 47))
                        .addGroup(BottomPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        BottomPanelLayout.setVerticalGroup(
                BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BottomPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(StateLabel)
                                        .addComponent(TitleLabel)
                                        .addComponent(WriterLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(211, Short.MAX_VALUE))
        );

        MemberGetButton.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        MemberGetButton.setForeground(new java.awt.Color(102, 102, 255));
        MemberGetButton.setText("사람 모집하기");
        MemberGetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberGetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                        .addComponent(MiddlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(MemberGetButton)
                                                .addGap(17, 17, 17))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MemberGetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>

    private void ProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Project ProjectFrame = new Project();
        ProjectFrame.setVisible(true);
        ProjectFrame.pack();
        ProjectFrame.setLocationRelativeTo(null);
        this.dispose(); //현재 로그인 창 닫음
    }

    private void GongButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Gong gongFrame = new Gong();
        gongFrame.setVisible(true);
        gongFrame.pack();
        gongFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    private void DetailButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Detail DetailFrame = new Detail();
        DetailFrame.setVisible(true);
        DetailFrame.pack();
        DetailFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    private void MemberGetButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teamget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JButton DetailButton;
    private javax.swing.JButton TeamgetButton;
    private javax.swing.JButton GongButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton MemberGetButton;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JButton ProjectButton;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel WriterLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration
}
