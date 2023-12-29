
package Start;

public class Gong extends javax.swing.JFrame {

    public Gong() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GongButton = new javax.swing.JButton();
        ProjectButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ItemGong = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setSize(800,500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("공모전");
        setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setBackground(new java.awt.Color(80, 175, 217));    //패널 바탕 색

        GongButton.setBackground(new java.awt.Color(80, 175, 217));     // 버튼 배경 색
        GongButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));  //버튼 폰트 스타일 크기
        GongButton.setForeground(new java.awt.Color(255, 255, 0));
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
        ProjectButton.setForeground(new java.awt.Color(255, 255, 255));
        ProjectButton.setText("프로젝트");
        ProjectButton.setBorderPainted(false);      //외곽선 없애기
        ProjectButton.setFocusPainted(false);       //클릭했을때 외곽선 없애기
        ProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectButtonActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스크린샷_2023-08-16_192857-removebg-preview 1 (2).png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스마틴 앱챌린지 포스터.png"));
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);           //외곽선 없애기
        jButton1.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ItemGong.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\청년 창업아이디어 공모전-포스터.png"));
        ItemGong.setToolTipText("");
        ItemGong.setBorderPainted(false);           //외곽선 없애기
        ItemGong.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        ItemGong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGongActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\세상을 바꾸는 코딩.png"));
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);           //외곽선 없애기
        jButton3.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\메타버스 크리에이터.png"));
        jButton4.setToolTipText("");
        jButton4.setBorderPainted(false);           //외곽선 없애기
        jButton4.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스크린샷 2023-08-28 163721 1.png"));
        jButton5.setToolTipText("");
        jButton5.setBorderPainted(false);           //외곽선 없애기
        jButton5.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\앱잼.png"));
        jButton6.setToolTipText("");
        jButton6.setBorderPainted(false);           //외곽선 없애기
        jButton6.setContentAreaFilled(false);       //클릭했을때 외곽선 없애기
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(ItemGong, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ItemGong, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }

    private void GongButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void ProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Project ProjectFrame = new Project();
        ProjectFrame.setVisible(true);
        ProjectFrame.pack();
        ProjectFrame.setLocationRelativeTo(null);
        this.dispose(); //현재 로그인 창 닫음
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void ItemGongActionPerformed(java.awt.event.ActionEvent evt) {
        Detail DetailFrame = new Detail();
        DetailFrame.setVisible(true);
        DetailFrame.pack();
        DetailFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JButton GongButton;
    private javax.swing.JButton ProjectButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton ItemGong;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
}
