class Quick_Sorter{
	private int[] inp_array;

	public void number_setter(int[] inp){
		inp_array = inp;
	}

	public int partition(int start_num, int end_num){
		
		if (start_num >= end_num){
			return -1;
		}
		int x = inp_array[end_num];
		int i = start_num -1;
		for(int j = start_num; j<end_num; j++){
			if(inp_array[j] < x){
				i++;
				int temp = inp_array[i];
				inp_array[i] = inp_array[j];
				inp_array[j] = temp; 
			}
		}
		//System.out.println(i);
		inp_array[end_num] = inp_array[i+1];
		inp_array[i+1] = x;
		return i+1;

	}

	public void sort(int start_num, int end_num){

		int q = partition(start_num,end_num);
		if(q != -1){
			sort(start_num,q-1);
			sort(q+1,end_num);	
		}
		
	}

	public void sort(){
			int start_num = 0;
			int end_num = inp_array.length-1;
		int q = partition(start_num,end_num);
		if(q != -1){
			sort(start_num,q-1);
			sort(q+1,end_num);	
		}
		
	}
}

class Quick_SorterDrive{
	public static void main(String[] args){
		Quick_Sorter sorter = new Quick_Sorter();
		int[] array = {1,5,3,4,2};

		sorter.number_setter(array);
		
		sorter.sort();
		
		for(int x:array){
			System.out.println(x);
		}
	}
}