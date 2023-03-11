class MissingNumber{
	public static void main(String arg[])
	{
		int sum=0;
		int missNumber;
		int[] arr = {11,12,14,15,16,17};
		int sec = arr[0];
		int l = arr[arr.length-1];
			{
				//System.out.println(l);
			}
			for(int i=sec ;i<=l; i++)
			{
				sum = sum+i;
			}
			//System.out.println(sum);
			for(int d :arr)
			{
				sum = sum-d;
				sec = d;
			}
			System.out.println(sum);
	}

}