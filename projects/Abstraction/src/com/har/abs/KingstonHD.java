package com.har.abs;

public class KingstonHD implements Harddisk {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public String speed() {
		// TODO Auto-generated method stub
		return "300rpm";
	}
	

}
/*rotating matrix
int array[][] = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        
        for (int i = 0; i < array.length; i++) {
            
                
                for (int j = 0; j < array.length; j++) {
                    
                        System.out.print(array[i][j]);
                }
                System.out.println();
        }*/
/*for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
t[i][j]=o[j][i];  
}    
}  */