package day8;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class TwodimentionArray {

	public static void main(String[] args) {
int twodimentional [][]= new int[3][3];

//this is first row from excel
twodimentional [0][0]=12;
twodimentional [0][1]=122;
twodimentional [0][2]=1222;


//this is 2nd row from excel
twodimentional [1][0]=12;
twodimentional [1][1]=122;
twodimentional [1][2]=1222;

for(int row=0;row<twodimentional.length;row++) {
	for (int col=0; col<twodimentional.length;col++) {
		System.out.println(twodimentional[row][col]);
	}
	
}
	}

}
