public int removeDuplicates(int[] nums){
	if (nums.length == 0)return 0;//长度是0直接返回0吧
	int i = 0;
	for (int j = 1; j < nums.length; j++){//j一直遍历到数组尾部
		if(nums[j] != nums[i]{//发现不重复的就可以计数+1了
			i++;
			nums[i] = nums[j];//从j的位置继续开始
		}
	}
	return i + 1;
}
