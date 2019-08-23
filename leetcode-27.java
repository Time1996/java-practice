public int removeElement(int[] nums, int val){
	int i = 0;
	int n = nums.length;
	while(i<n){
		if (nums[i] == val){
			nums[i] = nums[n-1];
			//把减去的元素变成前一个元素
			n--;//然后把数组大小减1
		}else{
			i++;
		}
	}
	return n;
}
