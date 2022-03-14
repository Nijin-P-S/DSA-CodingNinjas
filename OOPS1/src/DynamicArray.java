public class DynamicArray {
    private int array[];
    private int size=0;

    DynamicArray(){
        array = new int[5];
        size =0;
    }

    private void expandArray(){
        int temp[] = array;
        array = new int[array.length*2];
        for(int i=0;i< temp.length;i++){
            array[i]= temp[i];
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0?true:false);
    }

    public void addData(int val){
        if(size>= array.length){
            expandArray();
        }
        array[size++] = val;
    }

    public void setData(int index, int val) throws Exception{
        if(index>=size){
            throw new Exception("The index doesn't exist");
        }
        else
            array[index]= val;
    }

    public int getData(int index) throws Exception{
        if(index>=size)
            throw new Exception("Index doesn't exist");
        else
            return array[index];
    }

    public int removeLast() throws Exception{
        if(size==0)
            return -1;
        int temp = array[size-1];
        array[size-1]=0;
        size--;
        return temp;
    }
}