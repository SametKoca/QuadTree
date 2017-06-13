
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import javax.swing.DefaultListModel;


public class Main extends javax.swing.JFrame {
   final static Main QuadTree = new Main(); 
   Node Root; //Agacin kok dugumu
   Node Catch; //AddNode fonkisyonunda eklenen dugum
   int Option = 0;//Add yada Search butonunu kontrol eder
   int NodeCount = 0; //Eklenen dugum sayisi 
   int MinX = 512; //Ekle fonksiyonu icin en kucuk x
   int MinY = 512; //Ekle fonksiyonu icin en kucuk y
   int ExclusiveY = 512; //Ekle fonksiyonu icin aynı x ler icin en kucuk y
   DefaultListModel AddListModel = new DefaultListModel<>(); //Eklenen dugumlerin listesi
   DefaultListModel SortListModel = new DefaultListModel<>(); //Siralanan dugumlerin listesi
   DefaultListModel FoundedListModel = new DefaultListModel<>();//Search ile bulunan dugumlerin listesi
   ArrayList<Integer> ListX = new ArrayList<>(); //Aynı x ler tekrar yazilmasin diye tutulan liste 
   ArrayList<Integer> ListY = new ArrayList<>(); //X leri ayni olan dugumlerin y lerini tutan liste
  
   public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jDialog1 = new javax.swing.JDialog();
        textField1 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jRadioButton1.setText("jRadioButton1");

        jCheckBox1.setText("jCheckBox1");

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jScrollPane2.setViewportView(jEditorPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        label1.setText("label1");

        jLabel3.setText("jLabel3");

        jScrollPane4.setViewportView(jTextPane1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        jScrollPane7.setViewportView(jTextPane2);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        textField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textField1.setEditable(false);
        textField1.setEnabled(false);
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1312, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RANDOM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(50, 0, null, 1));
        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });

        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane8.setViewportView(jList2);

        jScrollPane9.setViewportView(jList3);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("ADDED");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText(" SORTED LİST");

        jScrollPane10.setViewportView(jList4);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("FOUNDED");

        jLabel8.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("SAMET KOCA");
        jLabel8.setToolTipText("");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText(" RADIUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel6)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jScrollPane9)
                                    .addComponent(jScrollPane10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    * Panelde mouse a tiklandiysa
    * @param evt Mouse tiklama olayi
    */
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Graphics2D Graphx = (Graphics2D)jPanel1.getGraphics(); //Panelde grafik ekranina biseyler cizdirmek icin
        Stack<Node> NodeStack = new Stack<>(); //Agacin koklerini icine atabilicegimiz yigin
        Random RandomValue = new Random(); //Rastgele renk olusturmak icin kullanilan rastgele sayi
        
        Node Hold; //Catch den gelen dugumu atmak icin
        Node Current = null; //Islemleri Current ustunden yapıyoruz
        
        int UserX; //Kullanicidan gelen X
        int UserY; //Kullanicidan gelen Y
        int r; //Yarıcap ; Spinner ile kullanicidan gelen deger
        int R = 0,B = 0,G = 0; //Rastgele renk olusturmak icin RGB sayilari tanımladik
        int Count=0; //Dongu icin kullanilicak sayi 
        int Search = 0; // Kullanicidan gelen degerlerin aynisi agacda varsa ekleme yapmaması lazim.
        //Search 1 olursa o degerler agacda var demektir ve ekleme yapmaz
        NodeStack.clear(); //Stack in temizlenmesi lazim. Cunku her aramada ayni stack kullaniliyor
        
        if(Option == 0){ //Add secili ise
            
            if(QuadTree.Root != null){ //Agac null degilse
                
                NodeStack.push(QuadTree.Root); //Kok stack e atilir
                
                while(!NodeStack.isEmpty()){ //Stack bos olana kadar
                    
                    Current = NodeStack.pop(); //Stack de en ustteki dugumu alir
             
                    if(Current.NW != null){ //Dugum null degilse
                        NodeStack.push(Current.NW); //O dugumu stack e ekle
                    }
                    if(Current.NE != null){
                        NodeStack.push(Current.NE);
                    }
                    if(Current.SW != null){
                        NodeStack.push(Current.SW);
                    }
                    if(Current.SE != null){
                        NodeStack.push(Current.SE);
                    }
                    if(Current.x == evt.getX() && Current.y == evt.getY()){ //Kullanicinin girdigi deger eslesirse
                        Search = 1; 
                    }
                }
            }
             
            if(Search != 1){ // Kullanicinin girdigi deger agacda yoksa
                
                QuadTree.AddNode(evt.getX(),evt.getY()); //Ekle fonksiyonuna kullanicinin degerleri ile git
                NodeCount++; //Agacdaki toplam dugum sayısı artti
                AddListModel.addElement("X = " + evt.getX() + "   Y = " + evt.getY()); //Added Listesidne eklendi
                jList2.setModel(AddListModel); //Added listesinin yeni haline yazdir
                Hold = QuadTree.Catch; 
                R = RandomValue.nextInt(256); //Rastgele renkler icin sayilar atandi
                B = RandomValue.nextInt(256);
                G = RandomValue.nextInt(256);
                
                Color RandomColor = new Color(R,B,G); //Rastgele renk olusturuldu
                Graphx.setColor(RandomColor); //Olusturulan renk secildi
                
                Graphx.drawLine(Hold.x,Hold.y,Hold.x,Hold.y1); //Noktadan cikan cizgiler cizildi
                Graphx.drawLine(Hold.x,Hold.y,Hold.x,Hold.y2);
                Graphx.drawLine(Hold.x,Hold.y,Hold.x1,Hold.y);
                Graphx.drawLine(Hold.x,Hold.y,Hold.x2,Hold.y);
                Graphx.setColor(Color.BLACK); //Renk tekrar siyah oldu. Bu dugumleri eklerken noktanin siyah olmasi icin gerekli
                Graphx.fillOval(evt.getX()-4, evt.getY()-4, 10, 10); //Kullanicin girdigi degerlere siyah nokta konuldu
            }       
        }
        else{//Add secili degilse yani Search secili ise
            
            UserX = evt.getX(); //Kullanicin girdigi degerler UseX ve UserY ye atildi
            UserY = evt.getY();
            r = (int) jSpinner1.getValue(); //Yaricap spinnerden alindi
            Graphx.setColor(Color.BLUE); //Renk mavi oldu. Cemberler mavi olarak ciziliyor.
            Graphx.drawOval(UserX-r/2, UserY-r/2, r, r); //Cember cizildi. Normalde mouse a tiklandiginda cember mouse un
            //Sag alt tarafina cizilir. Mouse u merkez alıp cizmesi icin degerlerden r/2 yi cikardik.
            Graphx.setColor(Color.BLACK); //Renk tekrar siyah oldu.
            Count = 0;
            if(QuadTree.Root != null){ //Agacda dugum varsa
                
                NodeStack.clear(); //Stack ve listeler sifirlaniyor
                ListX.clear();
                ListY.clear();
                
                while(Count != NodeCount){ //Dugum sayisi kadar dongu devam etsin
                    
                    MinX = 512; //MinX,MinY,ExY degerleri setlendi.
                    MinY = 512;
                    ExclusiveY = 512;
                    Current = null;
                    NodeStack.clear(); //Stack her dongunun basinda siliniyor
                    NodeStack.push(QuadTree.Root);//Ve kok her seferinde Stack e atiliyor
                    
                    while(!NodeStack.isEmpty()){ //Stack bos oluncaya kadar
                    
                        Current = NodeStack.pop();
             
                        if(Current.NW != null){
                            NodeStack.push(Current.NW);
                        }
                        if(Current.NE != null){
                            NodeStack.push(Current.NE);
                        }
                        if(Current.SW != null){
                            NodeStack.push(Current.SW);
                        }
                        if(Current.SE != null){
                            NodeStack.push(Current.SE);
                        }
                        if(MinX >= Current.x){ //En kucuk x i bulmak icin kosul
                     
                            if(ListX.contains(Current.x)!= true){ //X listede yoksa
                                MinX = Current.x; MinY = Current.y; //X ve Y degisti
                            }
                            else if(ListY.contains(Current.y)!= true && ExclusiveY > Current.y){ //X listde olabilir
                            //Fakat y leri ayni olamaz. Y lerden en kucugunu buluyor. Bu döngü icin MinY degil ExY onemli.
                                MinX = Current.x; MinY = Current.y; ExclusiveY = Current.y; //Degerler degisti
                            }
                        }
                    }
                    
                    ListX.add(MinX); //Listeye eklenecek olan x degeri ListX e eklendiki bidaha yazilmasin
                    ListY.add(MinY); //Listeye eklenecek olan y degeri ListY e eklendiki bidaha yazilmasin   
                    if(Math.pow((MinX-UserX),2)+Math.pow((MinY-UserY),2)<=Math.pow((r/2+5),2)){ //Cemberin Denkleminden noktanin cemberde
                    //Olup olmadigini buluyoruz
                        Graphx.setColor(Color.RED); //Bulunan noktanin kirmizi olmasi lazim. O yuzden renk kirmiziya ayarlandi
                        Graphx.fillOval(MinX-4, MinY-4, 10, 10); //Nokta konuldu
                        Graphx.setColor(Color.BLACK); //Renk tekrar siyah oldu
                        FoundedListModel.addElement("X = " + MinX + " Y = " + MinY); //Bulunanlar listesine eklendi
                    }
                    
                    ExclusiveY = 512; 
                    Count++; //Dongu icin Count artti      
                }
                FoundedListModel.addElement("----------------------"); //Bulunan degerler karismasin diye araya isaret koyuyoruz
            }
        }
        
        jList4.setModel(FoundedListModel); //Founded listesi tekrar yazildi
        SortListModel.clear(); //Siralama listesi sifirlandi.Cunku tekrar yazildi
        ListX.clear(); //Listeler sifirlandi
        ListY.clear();
        Count = 0;
        
        while(Count != NodeCount){ //Dongu dugum sayisi kadar devam ediyor
        
            MinX = 512;//Degerler setlendi
            MinY = 512;
            ExclusiveY = 512;
            Current = null;
            NodeStack.clear(); //Stack sifirlandi ve kok stack e eklendi
            NodeStack.push(QuadTree.Root);
            
            while(!NodeStack.isEmpty()){ //Stack bos olana kadar
             
                Current = NodeStack.pop();
             
                if(Current.NW != null){
                    NodeStack.push(Current.NW);
                }
                if(Current.NE != null){
                    NodeStack.push(Current.NE);
                }
                if(Current.SW != null){
                    NodeStack.push(Current.SW);
                }
                if(Current.SE != null){
                    NodeStack.push(Current.SE);
                }    
                if(MinX >= Current.x){ //En kucuk X bulunuyor
                     
                    if(ListX.contains(Current.x)!= true){
                        MinX = Current.x; MinY = Current.y;
                    }
                    else if(ListY.contains(Current.y)!= true && ExclusiveY > Current.y){
                        MinX = Current.x; MinY = Current.y; ExclusiveY = Current.y;
                    }
                }
            }
        
            ListX.add(MinX); //Bulunan X ve Y si listeye ekleniyor
            ListY.add(MinY);
            ExclusiveY = 512;
            SortListModel.addElement("X = " + MinX + " Y = " + MinY); //Sort list e ekleniyor
            Count++; 
        }
        
        jList3.setModel(SortListModel); //Siralama islemi bitince tekrar list yazdiriliyor
    }//GEN-LAST:event_jPanel1MouseClicked
    /*
    * Panelde mouse a tiklandiysa
    * @param evt Mouse tiklama olayi
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Bu butonda hersey silinir ve ekran beyaza boyanir
        Graphics2D Graphx = (Graphics2D)jPanel1.getGraphics();
        QuadTree.Root = null;
        AddListModel.clear();
        SortListModel.clear();
        FoundedListModel.clear();
        jList3.setModel(SortListModel);
        jList4.setModel(FoundedListModel);
        NodeCount = 0;
        
        Graphx.setColor(Color.WHITE);
        Graphx.fillRect(1, 1, 512, 512);
        Graphx.setColor(Color.BLACK);
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    * Panelde mouse a tiklandiysa
    * @param evt Mouse tiklama olayi
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Graphics2D Graphx = (Graphics2D)jPanel1.getGraphics();
        Stack<Node> Stack = new Stack<>(); //Stack tanimlama
        Stack.clear();
        Random RandomValue = new Random(); //Rastgele sayi tanimlama
        Node Current = null;
        int Search = 0; //Rastgele de olsa agacda ayni degerlerde dugum olmamasi icin kontrol yapiliyor
        int R = 0,B = 0,G = 0; //Rastgele renk icin tanimlanan RBG degerleri
        int Count = 0;
        Node Hold;
        
        ListY.clear(); //List ler sifirlandi
        ListX.clear();
        SortListModel.clear(); 
        
        int sayi1 = 1 + RandomValue.nextInt(511); //Sayilar 1 ve 512 arasindan seciliyor 
        int sayi2 = 1 + RandomValue.nextInt(511);
        R = RandomValue.nextInt(256); //Rastgele degerler atandi
        B = RandomValue.nextInt(256);
        G = RandomValue.nextInt(256);
        Color RandomColor = new Color(R,B,G); //Renk olusturuldu
            
        if(QuadTree.Root != null){ //Agacda dugum varsa
                
            Stack.push(QuadTree.Root); 
               
            while(!Stack.isEmpty()){
                    
                Current = Stack.pop();
             
                if(Current.NW != null){
                    Stack.push(Current.NW);
                }
                if(Current.NE != null){
                    Stack.push(Current.NE);
                }
                if(Current.SW != null){
                    Stack.push(Current.SW);
                }
                if(Current.SE != null){
                    Stack.push(Current.SE);
                }
                if(Current.x == sayi1 && Current.y == sayi2){
                    Search = 1; //Ayni degerler bulunduysa Search 1 olur
                }
            }
        }
        
        if(Search != 1){ //Ayni degerler agacda yoksa
       
            QuadTree.AddNode(sayi1,sayi2); //Ekleme fonksiyonunda agaca ekle
            AddListModel.addElement("X = " + sayi1 + "   Y = " + sayi2); //Added listesine ekle
            Hold = QuadTree.Catch;
            
            Graphx.setColor(RandomColor); //Rastgele rengi sec
            Graphx.drawLine(Hold.x,Hold.y,Hold.x,Hold.y1); //Cizgileri ciz
            Graphx.drawLine(Hold.x,Hold.y,Hold.x,Hold.y2);
            Graphx.drawLine(Hold.x,Hold.y,Hold.x1,Hold.y);
            Graphx.drawLine(Hold.x,Hold.y,Hold.x2,Hold.y);
            Graphx.setColor(Color.BLACK); //Renk tekrar siyah
            Graphx.fillOval(sayi1-4,sayi2-4, 10, 10); //Noktayi yerlestir
        
        
             NodeCount++; //Toplam dugum sayisi artti
        }
            
        jList2.setModel(AddListModel); //Added listesini tekrar yazdir
        
        while(Count!=NodeCount){ //Dugum sayisi kadar
            
            MinX = 512; //Degerler setlendi
            MinY = 512;
            ExclusiveY = 512;
        
            Current = null;
        
            Stack.clear(); //Stack sifirlandi ve kok stack e atildi
            Stack.push(QuadTree.Root);
            
            while(!Stack.isEmpty()){ //Stack bos olana kadar
                 
                Current = Stack.pop();
             
                if(Current.NW != null){
                    Stack.push(Current.NW);
                }
                if(Current.NE != null){
                    Stack.push(Current.NE);
                }
                if(Current.SW != null){
                    Stack.push(Current.SW);
                }
                if(Current.SE != null){
                    Stack.push(Current.SE);
                }    
                if(MinX >= Current.x){ //En kucuk X li dugum bulunuyor
                     
                    if(ListX.contains(Current.x)!= true){                         
                        MinX = Current.x; MinY = Current.y;
                    } 
                    else if(ListY.contains(Current.y)!= true && ExclusiveY > Current.y){ //Xler ayni ise en kucuk y li olan bulunuyor           
                        MinX = Current.x; MinY = Current.y; ExclusiveY = Current.y;
                    }
                }
            }
            
            ListX.add(MinX); //Listlere ekleme islemi yapildi
            ListY.add(MinY);
            ExclusiveY = 512;
            SortListModel.addElement("X = " + MinX + " Y = " + MinY); //Bulunan degerler SortList e eklendi
            Count++; 
        }
        
        jList3.setModel(SortListModel); //SortList tekrar yaziliyor
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked
        
    }//GEN-LAST:event_jSpinner1MouseClicked
    /*
    * Panelde mouse a tiklandiysa
    * @param evt Mouse tiklama olayi
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Option = 1; //Search e tiklandiysa ekleme yapmamasi icin
    }//GEN-LAST:event_jButton3ActionPerformed
    /*
    * Panelde mouse a tiklandiysa
    * @param evt Mouse tiklama olayi
    */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Option = 0; //Add e tiklandiginda ekleme yapmasi icin
    }//GEN-LAST:event_jButton4ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
  
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged
   
    }//GEN-LAST:event_textField1TextValueChanged
    /*
    * Agaca ekleme fonksiyonu
    * @param x kullanicidan gelen x kordinat degeri
    * @param y kullanicidan gelen y kordinat degeri
    */
    public void AddNode(int x, int y){ //Ekleme foksiyonu
        
        Node New = new Node(x,y); //Yeni dugum olusturuldu
      
        if(Root == null) //Kok null ise
        { //Yeni gelen deger kok dugume yerlestirilir
            Root = New;
            Catch = New;
            Root.x1 = 1;
            Root.y1 = 1;
            Root.x2 = 512;
            Root.y2 = 512;
        }
        else //Kok null degilse
        {
            Node Hold = Root; //Kok Hold a atildi
            Node Parent; 
            
            while(true) //Donguden cikana kadar
            {
                Parent = Hold; //Tutulan deger parent a atildi
                
                if(x <= Hold.x  && y <= Hold.y) //Kokun sol ustunde ise
                {    
                    Hold = Hold.NW; //Bir alttaki dugumdeki solust dugune git
                    
                    if(Hold == null) // Gidilen dugum null ise 
                    {   //O dugume yerlestir.
                        Parent.NW = New;
                        Catch = New; //Yeni gelen dugum Catch e atiliyor. Catchden cizgiler cekilmek uzere alinicak                  
                        Parent.NW.x1 = Parent.x1;//Sol ust , Sag ust , Sol alt , Sag alt degerleri ataniyor
                        Parent.NW.y1 = Parent.y1;
                        Parent.NW.x2 = Parent.x;
                        Parent.NW.y2 = Parent.y;       
                        return; //Dugum yerlestiyse donguden cikiliyor
                    }
                }
                else if(x > Hold.x && y <= Hold.y) //Sag ust e gidilicek ise
                {
                    Hold = Hold.SW;
                    
                    if(Hold == null)
                    {
                        Parent.SW = New;
                        Catch = New;
                        Parent.SW.x1 = Parent.x;
                        Parent.SW.y1 = Parent.y1;
                        Parent.SW.x2 = Parent.x2;
                        Parent.SW.y2 = Parent.y;                        
                        return;
                    }
                }
                else if(x <= Hold.x && y > Hold.y) //Sol alt a gidilicek ise
                {           
                    Hold = Hold.NE;
                    
                    if(Hold == null)
                    {
                        Parent.NE = New;
                        Catch = New;
                        Parent.NE.x1 = Parent.x1;
                        Parent.NE.y1 = Parent.y;
                        Parent.NE.x2 = Parent.x;
                        Parent.NE.y2 = Parent.y2;                     
                        return;
                    }
                }
                else //Sag alt a gidilicek ise
                {
                    Hold = Hold.SE;
                    
                    if(Hold == null)
                    {
                        Parent.SE = New;
                        Catch = New;
                        Parent.SE.x1 = Parent.x;
                        Parent.SE.y1 = Parent.y;
                        Parent.SE.x2 = Parent.x2;
                        Parent.SE.y2 = Parent.y2;                      
                        return;
                    }
                }
            }
        }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    class Node{ //Dortlu Agac icin dugum
       int x; //Noktanın x degeri
       int y; //Noktanın y degeri
       int x1,x2; //Noktanin sol ust degerleri
       int y1,y2; //Noktanin sag alt degerleri
       Node NW; //KuzeyBati
       Node NE; //KuzeyDogu
       Node SW; //GuneyBati
       Node SE; //GuneyDogu
       
       Node(int x, int y){
           this.x = x;
           this.y = y;
       }
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private java.awt.Label label1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
