public class Algorithm { 
            Routing[] arr=new Routing[7]; 
            public static Routing[] create(Routing array[]){//������ɾ��� 
         for(int i=0;i<7;i++) 
          for(int j=0;j<7;j++){ 
             if(i==j) 
             array[i].dis[j]=0; 
           else{ 
             if(array[i].dis[j]==0){ 
                array[i].dis[j]=(int)(Math.random()*50); 
             if(array[i].dis[j]>40||array[i].dis[j]==0){//���������Ϊ�����ڰѾ�����Ϊһ���ܴ��ֵ 
                array[i].dis[j]=1000; 
                array[j].dis[i]=1000; 
                      } } 
              } 
                array[i].name[j]=array[j].m; 
                array[i].next[j]=array[j].m; 
              } 
              for(int n=0;n<7;n++){ 
            System.out.println("���ǳ�ʼֵ"); 
            System.out.println("���ǽ��"+array[n].m+"�ĵ�ǰ·�ɱ�"); 
                for(int e=0;e<7;e++){ 
            System.out.println(array[n].name[e]+" "+array[n].dis[e]+"��һ����ַ��"+array[n].next[e]); 
                 } 
               } 
               return array; 
             } 
public static Routing[] exchange(Routing array[]){//����Ƿ��и�С����������� 
            int ex=0,count=0; 
            while(true){ 
            for(int i=0;i<7;i++) 
            for(int j=0;j<7;j++){ 
            for(int m=0;m<7;m++){ 
            if(array[i].dis[m]==1000) 
                  continue;//�����ڵĽ�㲻�ܽ���·�ɱ� 
            if(array[i].dis[j]>array[i].dis[m]+array[m].dis[j]){ 
                  array[i].dis[j]=array[i].dis[m]+array[m].dis[j]; 
                  array[i].next[j]=array[m].m; 
                          ex=1; 
              }}} 
                          count++; 
                  for(int n=0;n<7;n++){ 
             System.out.println("���ǵ�"+count+"�ֵĽ��"); 
             System.out.println("���ǽ��"+array[n].m+"�ĵ�ǰ·�ɱ�"); 
             for(int e=0;e<7;e++){ 
                 System.out.println(array[n].name[e]+" "+array[n].dis[e]+"��һ����ַ��"+array[n].next[e]); 
                  } 
             } 
                 if(ex==0){ 
                   System.out.println("�Ѿ��ﵽ�ȶ�״̬,һ��������"+count+"��"); 
                 return array; 
                    } 
                   ex=0; 
              } 
} 
public static void main(String[] args){ 
          try{ 
             Routing[] arr=new Routing[7]; 
             Routing[] b=new Routing[7]; 
             arr[0]=new Routing('a'); 
             arr[1]=new Routing('b'); 
             arr[2]=new Routing('c'); 
             arr[3]=new Routing('d'); 
             arr[4]=new Routing('e'); 
             arr[5]=new Routing('f'); 
             arr[6]=new Routing('g'); 
             b[0]=new Routing('a'); 
             b[1]=new Routing('b'); 
             b[2]=new Routing('c'); 
             b[3]=new Routing('d'); 
             b[4]=new Routing('e'); 
             b[5]=new Routing('f'); 
             b[6]=new Routing('g'); 
             arr=create(arr); 
           for(int i=0;i<7;i++){ 
             b[i].m=arr[i].m; 
           for(int j=0;j<7;j++){ 
             b[i].dis[j]=arr[i].dis[j]; 
             b[i].name[j]=arr[i].name[j];
          }}
             arr=exchange(arr);
             MyFrame mf=new MyFrame(arr,b);
             mf.setVisible(true);
         }catch(Exception e){
              e.printStackTrace();
   }
  }
}