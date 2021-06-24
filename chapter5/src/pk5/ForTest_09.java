package pk5;

public class ForTest_09 {

	public static void main(String[] args) {
		
		//결과가 60이 될때 까지, 60이 되면 i,j 결과값 도출
		int i,j;
		
		for(i=1; i<11; i++) {
			for(j=1; j<11; j++) {
				if(8*i + 2*j ==60) {
					System.out.println("(" +i+ "," + j + ")");
				}//if
			}//for
	
	}//for
  }//main
}//class