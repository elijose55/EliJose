package br.pro.hashi.ensino.desagil.tequilada;

public class Board {
	int x;
	int y;
	boolean[][] isWall = new boolean[9][9];
	
	void loadFromFile(texto){
		int i = 0;
		int j = 0;
		
		for (char c : texto){
			if (c == "X"){
				isWall[i][j]= true;
				i +=1;
				
			}
			else if(c == " "){
				isWall[i][j]= false;
				i +=1;
				
			}
			else{
				i -=19;
				j += 1;
				
			}
			
		}
	}
}