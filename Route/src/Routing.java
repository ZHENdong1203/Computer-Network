public class Routing { 
          protected char m; 
          protected char[] name=new char[100]; 
          protected int[] dis=new int[100]; 
          protected char[] next=new char[100]; 
        public Routing(char a){ 
              m=a; 
           for(int i=0;i<100;i++){ 
               dis[i]=0; 
      } 
   } 
} 
