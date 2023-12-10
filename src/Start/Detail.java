
package Start;

public class Detail extends javax.swing.JFrame {

    public Detail() {
        initComponents();
    }

    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        GongButton = new javax.swing.JButton();
        ProjectButton = new javax.swing.JButton();
        MiddlePanel = new javax.swing.JPanel();
        DetailButton = new javax.swing.JButton();
        TeamgetButton = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TopPanel.setBackground(new java.awt.Color(80, 175, 217));
        TopPanel.setPreferredSize(new java.awt.Dimension(390, 77));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스크린샷_2023-08-16_192857-removebg-preview 1 (2).png"));

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

        DetailButton.setText("세부사항");
        DetailButton.setIconTextGap(0);
        DetailButton.setPreferredSize(new java.awt.Dimension(400, 50));
        DetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailButtonActionPerformed(evt);
            }
        });
        MiddlePanel.add(DetailButton);

        TeamgetButton.setBackground(new java.awt.Color(204, 204, 204));
        TeamgetButton.setText("팀원모집");
        TeamgetButton.setIconTextGap(0);
        TeamgetButton.setPreferredSize(new java.awt.Dimension(400, 50));
        TeamgetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamgetButtonActionPerformed(evt);
            }
        });
        MiddlePanel.add(TeamgetButton);

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        jLabel3.setText("목적");

        jLabel4.setText("SW 코딩 개발자 양성 및 SW개발 능력 향상");

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        jLabel5.setText("개요 ");

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("주제 ");

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("결과물");

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 1, 18));
        jLabel8.setText("일정");

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("신청기간");

        jLabel10.setText("2차: 23.7.3 (월) ~ 23.7.16 (일)");

        jLabel11.setText("1차: 23.6.19 (월) ~ 23.7.2 (일)");

        jLabel12.setText("3차: 23.7.17 (월) ~ 23.7.30 (일)");

        jLabel13.setText("4차: 23.7.31 (월) ~ 23.8.13 (일)");

        jLabel1.setText("자유 주제의 게임 개발");

        jLabel14.setText("발표 자료 (PPT), 파이썬 게임 개발소스 (.py), 발표 동영상 1개(5분 ~ 10분 이내)");

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
                BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BottomPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)
                                        .addGroup(BottomPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1))
                                        .addGroup(BottomPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel14))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel12))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BottomPanelLayout.setVerticalGroup(
                BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BottomPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                        .addComponent(MiddlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Project ProjectFrame = new Project();
        ProjectFrame.setVisible(true);
        ProjectFrame.pack();
        ProjectFrame.setLocationRelativeTo(null);
        this.dispose(); //현재 로그인 창 닫음
    }

    private void TeamgetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Teamget TeamgetFrame = new Teamget();
        TeamgetFrame.setVisible(true);
        TeamgetFrame.pack();
        TeamgetFrame.setLocationRelativeTo(null);
        this.dispose(); //현재 로그인 창 닫음
    }

    private void DetailButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel BottomPanel;
    private javax.swing.JButton DetailButton;
    private javax.swing.JButton TeamgetButton;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton GongButton;
    private javax.swing.JButton ProjectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
}