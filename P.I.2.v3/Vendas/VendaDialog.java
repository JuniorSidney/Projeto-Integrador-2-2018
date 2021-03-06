package Vendas;
import Produtos.DadosProdutos;
import Produtos.Produto;
import agendatelefonica.DadosPessoas;
import agendatelefonica.MyPostgreSQL;
import agendatelefonica.Pessoa;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class VendaDialog extends javax.swing.JDialog {

    private MyPostgreSQL pgBD; // conexão com banco de dados
    private ArrayList<Pessoa> listaPessoas;
    private ArrayList<Produto> listaProdutos;
     
    
    public VendaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    
 //   getContentPane().setBackground(Color.BLACK); //Colocar a tela com cor
    
 //   jPanel1.setBackground(Color.BLUE); //Colocar o painel com cor

 //getContentPane().setBackground(new Color(100,100,250,250)); //escolher a tonalização da cor
 
 
 
 
 // adiciona change listener no campo de texto:
 // o método filtroAlterou() será chamado toda vez que o
 // conteúdo de filtroTextField for alterado.
 filtroTextFieldCliente.getDocument().addDocumentListener(new DocumentListener() {
 @Override
 public void insertUpdate(DocumentEvent e) {
 filtroAlterou();
 }
 @Override
 public void removeUpdate(DocumentEvent e) {
 filtroAlterou();
 }
 @Override
 public void changedUpdate(DocumentEvent e) {
 filtroAlterou();
 }
 });
 
 
  filtroTextFieldProduto.getDocument().addDocumentListener(new DocumentListener() {
 @Override
 public void insertUpdate(DocumentEvent e) {
 filtroProdutosAlterou();
 }
 @Override
 public void removeUpdate(DocumentEvent e) {
 filtroProdutosAlterou();
 }
 @Override
 public void changedUpdate(DocumentEvent e) {
 filtroProdutosAlterou();
 }
 });
 
 
 

 // conecta com base de dados
 pgBD = new MyPostgreSQL();
 pgBD.conecta();

 // recupera dados da base de dados
 listaPessoas = DadosPessoas.lerDados(pgBD.getConnection());
 mostraDados(listaPessoas);

 // recupera dados da base de dados
 listaProdutos = DadosProdutos.lerDados(pgBD.getConnection());
 mostraDadosProdutos(listaProdutos);
 
 
 // centralizar a janela na tela
 this.setLocationRelativeTo(null);
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pessoasTable = new javax.swing.JTable();
        filtroTextFieldCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        filtroTextFieldProduto = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Concluir pedido");

        jButton2.setText("Limpar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel1.setToolTipText("Cliente");

        jButton5.setText("Inserir");

        pessoasTable.setAutoCreateRowSorter(true);
        pessoasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pessoasTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(pessoasTable);
        if (pessoasTable.getColumnModel().getColumnCount() > 0) {
            pessoasTable.getColumnModel().getColumn(1).setMinWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                    .addComponent(filtroTextFieldCliente))
                .addGap(16, 16, 16)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item", "Produto", "Qtd", "Vlr Unit.", "Vlt Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(2).setMinWidth(40);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Quantidade:");

        jLabel5.setText("Valor total:");

        jLabel4.setText("Pagamento:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));
        jPanel2.setToolTipText("Produtos");

        produtosTable.setAutoCreateRowSorter(true);
        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "EAN", "Produto", "Descrição", "Qtd", "Valor", "Medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtosTable.getTableHeader().setReorderingAllowed(false);
        produtosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(produtosTable);
        if (produtosTable.getColumnModel().getColumnCount() > 0) {
            produtosTable.getColumnModel().getColumn(0).setMinWidth(1);
            produtosTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            produtosTable.getColumnModel().getColumn(0).setMaxWidth(1);
            produtosTable.getColumnModel().getColumn(1).setMinWidth(120);
            produtosTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            produtosTable.getColumnModel().getColumn(1).setMaxWidth(120);
            produtosTable.getColumnModel().getColumn(2).setMinWidth(140);
            produtosTable.getColumnModel().getColumn(2).setPreferredWidth(140);
            produtosTable.getColumnModel().getColumn(2).setMaxWidth(140);
            produtosTable.getColumnModel().getColumn(3).setMinWidth(140);
            produtosTable.getColumnModel().getColumn(3).setPreferredWidth(140);
            produtosTable.getColumnModel().getColumn(3).setMaxWidth(140);
            produtosTable.getColumnModel().getColumn(4).setMinWidth(60);
            produtosTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            produtosTable.getColumnModel().getColumn(4).setMaxWidth(60);
            produtosTable.getColumnModel().getColumn(5).setMinWidth(60);
            produtosTable.getColumnModel().getColumn(5).setPreferredWidth(60);
            produtosTable.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        filtroTextFieldProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroTextFieldProdutoActionPerformed(evt);
            }
        });

        jButton4.setText("-");

        jButton3.setText("+");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(filtroTextFieldProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton2)
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Produtos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void produtosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosTableMouseClicked
        // double-click: editar dados da pessoa
        if (evt.getClickCount() >= 2)
        {
            /*
            * IMPORTANTE: quando uma tabela usa um ordenador, os dados que o usuário
            * vê podem estar em uma ordem diferente da que está especificada no modelo
            * interno (data model). Os dados que o usuário vê é conhecido como uma view,
            * e possui seu próprio conjunto de coordenadas. Portanto, é necessário
            * converter as coordenadas do modelo para as coordenadas da view.
            *
            * Quando usar um ordenador, SEMPRE converta as coordenadas das células
            */
            int rowModel = produtosTable.getSelectedRow(); // coordenadas do modelo
            // coordenadas da view
            int rowView = produtosTable.convertRowIndexToModel(rowModel);

            // obtem dados da pessoa selecionada
            DefaultTableModel model = (DefaultTableModel) produtosTable.getModel();
            ArrayList<Produto> lista =
            buscaNomesTelefones((String)model.getValueAt(rowView, 2));
            if((lista == null) || lista.isEmpty())
            return;

            Produto selecionado = lista.get(0);

            // ativa janela para editar dados da pessoa selecionada
            TelaInserirProduto pDialog = new TelaInserirProduto(this, true);
            pDialog.setConnection(pgBD.getConnection());
            pDialog.setTitle("Manutenção dados");
            pDialog.setProduto(selecionado);
            pDialog.inserindoNovo(false);
            pDialog.setVisible(true);
            switch(pDialog.getOperacao())
            {
                case TelaInserirProduto.OPERACAO_OK:
                // obtém dados informados pelo usuário
                Produto p = pDialog.getProduto();

                selecionado.setId(p.getId());

                // atualiza telefone (nome não pode ser alterado)
                //selecionado.setFone(p.getFone());
                // atualiza dados na tabela
                //model.setValueAt(p.getFoneFormatado(), rowView, 1);

                //selecionada.setFone_Comercial(p.getFone_Comercial_Formatado());
                // atualiza dados na tabela
                //selecionado.setFone_Comercial(p.getFone_Comercial());
                // model.setValueAt(p.getFone_Comercial(), rowView, 2);

                //selecionado.setFone_Residencial(p.getFone_Residencial());
                //model.setValueAt(p.getFone_Residencial(), rowView, 3);

                // selecionado.setCPF(p.getCPF());
                // model.setValueAt(p.getCPF(), rowView, 4);

                //selecionado.setRG(p.getRG());
                //model.setValueAt(p.getRG(), rowView, 5);

                break;
                case TelaInserirProduto.OPERACAO_ELIMINAR:
                // elimina pessoa da lista de pessoas
                listaProdutos.remove(selecionado);

                // atualiza dados na tabela
                model.removeRow(rowView);
                break;
            }
        }
    }//GEN-LAST:event_produtosTableMouseClicked

    private void filtroTextFieldProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroTextFieldProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroTextFieldProdutoActionPerformed
    
    
    
    
    
    public ArrayList<Pessoa> buscaNomesTelefones(String procurado)
    {
        if((procurado == null) || procurado.isEmpty())
 return listaPessoas;

 ArrayList<Pessoa> pessoasEncontradas = new ArrayList<>();
 String minusculo = procurado.toLowerCase();
 boolean achou = false;

 // percorrer toda a lista de pessoas
 for(Pessoa p : listaPessoas)
 {
 // verifica se dado procurado aparece no nome ou telefone
 if(p.getNome().toLowerCase().contains(minusculo) ||
 p.getFone().contains(procurado)//||
 //p.getFone_Comercial().contains(procurado)
         )
 {
 achou = true;
 pessoasEncontradas.add(p);
 }
 }

 if(achou)
 return pessoasEncontradas;
 else
 return null;
    }
    
    private void filtroAlterou()
    {
  ArrayList<Pessoa> filtro = buscaNomesTelefones(filtroTextFieldCliente.getText());
 mostraDados(filtro);

    }
    
    
    
    private void mostraDados(ArrayList<Pessoa> dados)
    {
       try
 {
 // limpa dados da tabela
 DefaultTableModel model = (DefaultTableModel) pessoasTable.getModel();
 model.setRowCount(0);
 
 

 if((dados == null) || (dados.isEmpty()))
 return;

 // percorrer lista de pessoas e mostrar dados
 for (Pessoa p : dados)
 {                                                                          //=-=-=-=-=-=-=-=-=-//=-=-=-=-=-=-=-=-=-
 model.addRow(new Object[]{p.getId(), p.getNome()});
// model.addTableModelListener(new Object[]{p.getNome()});
// add os 3 campos em pessoa , que é add na lista, que depois joga na tabela da tela gráfica
                                                                        
 }
 }
 catch(Exception ex)
 {
 JOptionPane.showMessageDialog(this,
"Erro ao atualizar tabela\n" + ex.getMessage(),
 "Mostrar dados", JOptionPane.ERROR_MESSAGE);
 }

    }
    
   
    
    
    
    
    
    
    // leitura do arquivo contendo dados da agenda
 public static ArrayList<Pessoa> lerDados(Connection bdConnection)
 {
 ArrayList<Pessoa> pessoas = new ArrayList<>();
 if (bdConnection == null)
 return pessoas;

 try
 {
 String sql_str = "SELECT * FROM pessoas ORDER BY nome";
 PreparedStatement stmt = bdConnection.prepareStatement(sql_str);
 ResultSet rs = stmt.executeQuery();
 int id;
 String nome, fone, fone_comercial, fone_residencial, CPF, RG, Endereco,  Complemento, Setor, Cidade, UF, Cep;
 Pessoa novaPessoa;

 // percorre conjunto de pessoas retornadas pelo banco de dados
 while (rs.next())
 {
 // obtém dados da pessoa corrente
 id = rs.getInt("id");
 nome = rs.getString("nome");
 fone = rs.getString("fone");
 fone_comercial = rs.getString("fone_comercial");
 fone_residencial = rs.getString("fone_residencial");
 CPF = rs.getString("CPF");
 RG = rs.getString("RG");
 Endereco = rs.getString("Endereco");
 Complemento = rs.getString("Complemento"); 
 Setor = rs.getString("Setor");
 Cidade = rs.getString("Cidade"); 
 UF = rs.getString("UF");
 Cep = rs.getString("Cep");
     
    
    
 
// cria nova pessoa e a adiciona na lista
 novaPessoa = new Pessoa(id, nome, fone, fone_comercial, fone_residencial, CPF, RG, Endereco,  Complemento, Setor, Cidade, UF, Cep );
 pessoas.add(novaPessoa);
 }

 stmt.close();
 rs.close();

 // retorna lista de pessoas
 return pessoas;
 } catch(SQLException ex) {
 JOptionPane.showMessageDialog(null,
 "Erro na consulta SQL\n" + ex.getMessage(),
 "Ler Dados", JOptionPane.ERROR_MESSAGE);
 return pessoas;
 }}
 
 
 
 
 
 
 
 
 public ArrayList<Produto> buscaProdutoEAN(String procurado)
    {
        if((procurado == null) || procurado.isEmpty())
 return listaProdutos;

 ArrayList<Produto> produtosEncontrados = new ArrayList<>();
 String minusculo = procurado.toLowerCase();
 boolean achou = false;

 // percorrer toda a lista de pessoas
 for(Produto p : listaProdutos)
 {
 // verifica se dado procurado aparece no nome ou telefone
 if(p.getNomeProduto().toLowerCase().contains(minusculo) ||
 p.getEAN13().contains(procurado)//||
 //p.getFone_Comercial().contains(procurado)
         )
 {
 achou = true;
 produtosEncontrados.add(p);
 }
 }

 if(achou)
 return produtosEncontrados;
 else
 return null;
    }
    
    private void filtroProdutosAlterou()
    {
  ArrayList<Produto> filtroProduto = buscaProdutoEAN(filtroTextFieldProduto.getText());
 mostraDadosProdutos(filtroProduto);

    }
    
    
    
    private void mostraDadosProdutos(ArrayList<Produto> dados)
    {
       try
 {
 // limpa dados da tabela
 DefaultTableModel model = (DefaultTableModel) produtosTable.getModel();
 model.setRowCount(0);

 if((dados == null) || (dados.isEmpty()))
 return;

 // percorrer lista de pessoas e mostrar dados
 for (Produto p : dados)
 {                                                                          //=-=-=-=-=-=-=-=-=-//=-=-=-=-=-=-=-=-=-
 model.addRow(new Object[]{p.getId(), p.getEAN13(), p.getNomeProduto(),  p.getDescricaoProduto(), 
                           p.getQtdEstoque(), p.getPrecoProduto(),  p.getUnidMedida()});
            
// add os 3 campos em pessoa , que é add na lista, que depois joga na tabela da tela gráfica
                                                                        
 }
 }
 catch(Exception ex)
 {
 JOptionPane.showMessageDialog(this,
"Erro ao atualizar tabela\n" + ex.getMessage(),
 "Mostrar dados", JOptionPane.ERROR_MESSAGE);
 }

    }
 
 
 
 
 
 
 
 
 
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VendaDialog dialog = new VendaDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JTextField filtroTextField;
    private javax.swing.JTextField filtroTextFieldCliente;
    private javax.swing.JTextField filtroTextFieldProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable pessoasTable;
    private javax.swing.JTable produtosTable;
    // End of variables declaration//GEN-END:variables


    

    private static class filtroTextField extends JTextField {

        public filtroTextField(Object[] object) {
        }
    }
    
    
    
    
    
    
    
    
    
}

