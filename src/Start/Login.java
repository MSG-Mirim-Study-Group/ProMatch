
package Start;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }    //텍스트 상자, 레이블, 버튼 등을 초기화하고 배치하기 위해 initComponents 메서드 사용

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        Left.setBackground(new java.awt.Color(80, 175, 217));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(800, 500));

        //프로매치 아이콘 삽입
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hyewo\\OneDrive\\Documents\\NetBeansProjects\\LoginAndSignUp\\src\\Icon\\logo (3).png")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)   // 컴포넌트 왼쪽 정렬
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                .addComponent(jLabel5)  //jLabel5 컴포넌트를 LeftLayout에 추가
                                .addGap(0, 0, Short.MAX_VALUE)) //공백을 없애고 가장 오른쪽으로 정렬
        );
        LeftLayout.setVerticalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(200, 200, 200)  //jLabel5를 위에서 200 픽셀, 아래에서 200 픽셀로 내림 -> jLabel5가 패널의 중앙에 위치
                                .addComponent(jLabel5)
                                .addContainerGap(206, Short.MAX_VALUE)) // jLabel5 아래 여백을 없애고 컴포넌트를 패널의 아래쪽에 정렬
        );

        // 이메일, 패스워드 레이블의 폰트 및 크기 설정
        jPanel2.add(Left);
        Left.setBounds(0, 0, 400, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 36));
        jLabel1.setForeground(new java.awt.Color(80, 175, 217));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Email");

        EmailField.setFont(new java.awt.Font("맑은 고딕", 0, 14));
        EmailField.setForeground(new java.awt.Color(102, 102, 102));
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Password");

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(80, 175, 217));
        LoginButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setPreferredSize(new java.awt.Dimension(74, 23));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 12));
        jLabel4.setText("계정을 찾을 수 없습니다.");

        SignUpButton.setFont(new java.awt.Font("맑은 고딕", 1, 14));
        SignUpButton.setForeground(new java.awt.Color(255, 51, 51));
        SignUpButton.setText("Sign Up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        // Rightlayout 객체 생성후 Right 패널에 적용
        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  //수평으로 요소를 배치하기 위한 그룹을 설정하기 위해 setHorizontalGroup 메서드를 사용
                        .addGroup(RightLayout.createSequentialGroup()
                                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RightLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel2)
                                                                .addComponent(EmailField)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(RightLayout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(45, 45, 45)
                                                                .addComponent(SignUpButton))
                                                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(RightLayout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addComponent(jLabel1)))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(    // 수직으로 요소 배치를 위한 그룹 설정
                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RightLayout.createSequentialGroup()
                                .addGap(42, 42, 42)     // 공백 추가
                                .addComponent(jLabel1)  //로그인 텍스트를 42픽셀 아래 추가
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                //이메일 입력 가능한 텍스트필드 설정
                                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SignUpButton)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.add(Right);
        Right.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Gong gongFrame = new Gong();
        gongFrame.setVisible(true);
        gongFrame.pack();
        gongFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {    //Sign up 버튼을 클릭했을 때 호출
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose(); //현재 로그인 창 닫음
    }



    // 지금까지 쓴 gui 요소들 선언
    private javax.swing.JTextField EmailField;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel Right;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
}
