package Placement.Day2;

public class p5 { //arrange 0s,1s and 2s in an array
    public static void main(String[] args) {
		int []arr ={0,1,0,2,2,2,1,1,1,0,0,0,0,2,0,2,0,2,0,2};
		int o=0,t=0,z=0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==0){
		        z++;
		    }else if(arr[i]==1){
		        o++;
		        
		    }else if(arr[i]==2){
		        t++;
		    }
		}
		int i=0;
		while(z!=0){
		    arr[i++]=0;
		        z--;
		}
		while(o!=0){
		        arr[i++]=1;
		        o--;
		}   
		while(t!=0){
		        arr[i++]=2;
		        t--;
		}
		for(int j=0;j<arr.length;j++){
		    System.out.print(arr[j]+" ");
	    }
	
	}
    
}
