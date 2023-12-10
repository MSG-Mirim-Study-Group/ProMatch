
package Start;

public class Project extends javax.swing.JFrame {

    public Project() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        ProjectButton = new javax.swing.JButton();
        GongButton = new javax.swing.JButton();
        MemberGetButton = new javax.swing.JButton();
        Middle1Panel = new javax.swing.JPanel();
        Bottom1Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        StateLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        WriterLabel = new javax.swing.JLabel();
        Bottom2Panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TopPanel.setBackground(new java.awt.Color(80, 175, 217));
        TopPanel.setPreferredSize(new java.awt.Dimension(390, 77));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\project\\ProMatch\\src\\Icon\\스크린샷_2023-08-16_192857-removebg-preview 1 (2).png"));

        ProjectButton.setBackground(new java.awt.Color(80, 175, 217));
        ProjectButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        ProjectButton.setForeground(new java.awt.Color(255, 255, 0));
        ProjectButton.setText("프로젝트");
        ProjectButton.setBorderPainted(false);      //외곽선 없애기
        ProjectButton.setFocusPainted(false);       //클릭했을때 외곽선 없애기

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

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
                TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
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

        MemberGetButton.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        MemberGetButton.setForeground(new java.awt.Color(102, 102, 255));
        MemberGetButton.setText("팀원 모집하기");
        MemberGetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberGetButtonActionPerformed(evt);
            }
        });

        Middle1Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Bottom1Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("1 / 4");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel2.setText("JAVA GUI 사용 가능한 개발자 구해요");

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel3.setText("조수빈");

        javax.swing.GroupLayout Bottom1PanelLayout = new javax.swing.GroupLayout(Bottom1Panel);
        Bottom1Panel.setLayout(Bottom1PanelLayout);
        Bottom1PanelLayout.setHorizontalGroup(
                Bottom1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Bottom1PanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(198, 198, 198)
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34))
        );
        Bottom1PanelLayout.setVerticalGroup(
                Bottom1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Bottom1PanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(Bottom1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        StateLabel.setBackground(new java.awt.Color(204, 204, 204));
        StateLabel.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        StateLabel.setForeground(new java.awt.Color(153, 153, 153));
        StateLabel.setText("상태");

        TitleLabel.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        TitleLabel.setForeground(new java.awt.Color(153, 153, 153));
        TitleLabel.setText("제목");

        WriterLabel.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        WriterLabel.setForeground(new java.awt.Color(153, 153, 153));
        WriterLabel.setText("작성자");

        Bottom2Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("1 / 2");

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel8.setText("식물 상태 확인 할 수 있는 프로젝트 같이 ...");

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel9.setText("장하영");

        javax.swing.GroupLayout Bottom2PanelLayout = new javax.swing.GroupLayout(Bottom2Panel);
        Bottom2Panel.setLayout(Bottom2PanelLayout);
        Bottom2PanelLayout.setHorizontalGroup(
                Bottom2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Bottom2PanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(183, 183, 183)
                                .addComponent(jLabel9)
                                .addGap(34, 34, 34))
        );
        Bottom2PanelLayout.setVerticalGroup(
                Bottom2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Bottom2PanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(Bottom2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Middle1PanelLayout = new javax.swing.GroupLayout(Middle1Panel);
        Middle1Panel.setLayout(Middle1PanelLayout);
        Middle1PanelLayout.setHorizontalGroup(
                Middle1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Bottom1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Middle1PanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(StateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TitleLabel)
                                .addGap(292, 292, 292)
                                .addComponent(WriterLabel)
                                .addGap(35, 35, 35))
                        .addComponent(Bottom2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Middle1PanelLayout.setVerticalGroup(
                Middle1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Middle1PanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(Middle1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(StateLabel)
                                        .addComponent(TitleLabel)
                                        .addComponent(WriterLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bottom1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bottom2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MemberGetButton)
                                        .addComponent(Middle1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MemberGetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Middle1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
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
    private void MemberGetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MemberGet MemberGetFrame = new MemberGet();
        MemberGetFrame.setVisible(true);
        MemberGetFrame.pack();
        MemberGetFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel Bottom1Panel;
    private javax.swing.JPanel Bottom2Panel;
    private javax.swing.JButton GongButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton MemberGetButton;
    private javax.swing.JPanel Middle1Panel;
    private javax.swing.JButton ProjectButton;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel WriterLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
}
