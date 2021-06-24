package pk12;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		ArrayList<Animal> Alist=new ArrayList<Animal>();
		
		Alist.add(new Bear());
		Alist.add(new Spider());
		Alist.add(new Lion());
		
		for(int i=0; i<Alist.size();i++) {
			System.out.println("눈: "+Alist.get(i).getEye()+ "다리: "+Alist.get(i).getLeg());
		}
		
		int A=Alist.get(0).getEye();
		int B=Alist.get(0).getLeg();
		int C=Alist.get(1).getEye();
		int D=Alist.get(1).getLeg();
		int E=Alist.get(2).getEye();
		int F=Alist.get(2).getLeg();
		System.out.println("---곰----");
		System.out.println("눈: " +A+"개 , 다리: "+B);
		System.out.println("---거미---");
		System.out.println("눈: " +C+"개 , 다리: "+D);
		System.out.println("---사자---");
		System.out.println("눈: " +E+"개 , 다리: "+F);
		
		
	}

}
