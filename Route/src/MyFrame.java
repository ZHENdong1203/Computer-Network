import java.awt.GridLayout; 
import java.awt.Image; 
import javax.swing.*; 
public class MyFrame extends JFrame{ 
       private GridLayout gd=new GridLayout(4,1,10,10); 
       private JTable t1=new JTable(8,8);//八行八列 
       private JTextField j1=new JTextField("初始时距离记录如下"); 
       private JTable t2=new JTable(8,8);//八行八列 
       private JTextField j2=new JTextField("稳定后距离记录如下"); 
    public MyFrame(Routing array[],Routing b[]){ 
       this.setLayout(gd); 
       this.setTitle("距离失量路由算法"); 
       this.setSize(800, 800); 
       t1.setSize(200, 200); 
       t2.setSize(200,200); 
         try{ 
           for(int i=0;i<7;i++){ 
             t1.setValueAt((char)(i+'a'), 0, i+1); 
             t1.setValueAt((char)(i+'a'), i+1, 0); 
             t2.setValueAt((char)(i+'a'), 0, i+1); 
             t2.setValueAt((char)(i+'a'), i+1, 0); 
            } 
             for(int i=1;i<8;i++) 
               for(int j=1;j<8;j++){ 
                t1.setValueAt(b[i-1].dis[j-1], i, j); 
                t2.setValueAt(array[i-1].dis[j-1], i, j); 
               } 
               }catch(Exception e){ 
                  e.printStackTrace(); 
               } 
                 this.add(j1); 
                 this.add(t1); 
                 this.add(j2); 
                 this.add(t2);

               } 
}