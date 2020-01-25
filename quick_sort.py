def partition(inp_array,start_num,end_num):

	x = inp_array[end_num]
	i = start_num - 1
	for j in range(start_num,end_num):
		if inp_array[j]<x:
			i += 1
			inp_array[i], inp_array[j] = inp_array[j], inp_array[i]
	inp_array[i+1],inp_array[end_num] = inp_array[end_num], inp_array[i+1]
	return i+1

def quick_sort(inp_array,start_num,end_num):
	q = partition(inp_array,start_num,end_num)
	if start_num < q-1:
		quick_sort(inp_array,start_num,q-1)
	if q+1 < end_num:
		quick_sort(inp_array,q+1,end_num)


inp = [int(x) for x in input("Enter the numbers to be sorted: ").split()]
quick_sort(inp,0,len(inp)-1)
print(inp)