package test;

public class Lesson_17_Activity {
	public static void main(String[] args) {
		int[] array= { 10,20,30,40,50,60,70,80,90};
		binarySearch(array,3);
	}
	public static boolean isSorted(int[] a){
        boolean bool = true;
        
        for(int i =1; i<a.length;i++){
            if(a[i]<a[i-1]){
                bool = false;
                break;
            }
                
        }
        return bool;
        
    }   
    public static int binarySearch(int[] a, int b) {
        int i = (a.length/2)-1;
        while(true){
        	if(b<a[0]||b>a[a.length-1]) {
        		return -1;
            }
        	System.out.println(i);//Debugging
            if(a[i]<b) {
            	i += ((a.length-i)/2); 
            }
            else if(a[i]>b) {
            	i-=((a.length-i)/2);
            }
            else if(a[i]==b) {
            	return i;
            	
            }
            
        }
    }
 
}
