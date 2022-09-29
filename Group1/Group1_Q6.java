
class Group1_Q6{
	public static void main(String[] args){
		double arr[]= { 10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5};
		double avg=0.0;
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/12;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>avg) {
				
				System.out.println(arr[i]);
				
				
			}
		}
	}
}