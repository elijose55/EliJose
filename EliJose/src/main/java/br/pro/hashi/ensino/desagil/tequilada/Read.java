package br.pro.hashi.ensino.desagil.tequilada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	  public static void main(String[] args) throws IOException
	  {
		  FileReader fr = new FileReader("C:\\Users\\elijo\\Desktop\\Java\\EliJose\\jogo.txt");
		  BufferedReader br = new BufferedReader(fr);
		  
		  br.readLine();
		  String textofinal = "";
		  
          int i;    
          while((i=br.read())!=-1){  
        	  char e = (char)i;
        	  
        	  if (e == '#'){
        		  //System.out.print("X");
        		  textofinal += 'X';
        		  
        	  }
        	  else{
        		  //System.out.print((char)i);
        		  textofinal += e;
        	  }
            
          }
          br.close();    
          fr.close(); 
          System.out.print(textofinal);

		  }

}
