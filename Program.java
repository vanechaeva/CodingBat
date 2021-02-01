	public boolean firstLast6(int[] nums) {
		  if (nums.length < 1) {
		    return false;
		  }
		  else if (nums[0]==6 || nums[nums.length-1]==6) {
		    return true;
		  }
		  else return false;
		}


	public boolean sameFirstLast(int[] nums) {
		  if (nums.length < 1) return false;
		  else if (nums.length==1) return true;
		  else if (nums.length > 1 && nums[0]==nums[nums.length-1]) {
		    return true;
		  }
		  else return false;
		}
