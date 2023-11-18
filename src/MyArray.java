import java.util.Arrays;
import java.util.Iterator;

public class MyArray extends MyAbstractArrayList{
    //new就是一个实例化
    private Object[] arrs={};
    private int size=0;
    public MyArray() {
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for(int i=0;i<this.arrs.length;i++){
            if(this.arrs[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object obj){
        add(0,obj);
        return true;
    }

    public void add(int index,Object obj){
        arrs=Arrays.copyOf(arrs,10);
        arrs[this.size]=obj;
        this.size++;
    }
    public Object set(int index,Object newValue){
        if(index>this.size){
            return new Exception("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
        }
        //先把原值取回，最后返回
        Object oldValue=this.arrs[index];
        //使用设置的新值修改原值。
        this.arrs[index]=newValue;
        //最后返回老值
        return oldValue;

    }
    public Object get(int index){
        if(index>size){
            System.out.println("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
        }else{
            return arrs[index];
        }
        return new Exception("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
    }
    //删除方法，官方方法中有一个返回值Object，返回的值就是被删除的元素，按参数index进行删除
    public Object remove(int index){
        //首先判断index超界
        if(index>this.size){
            //return已异常，后面代码不用执行
            return new Exception("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
        }
        //先把删除元素记录
        Object oldValue=this.arrs[index];
        //挪动元素的位数
        int numMoved=size-index-1;
        //如果挪动的非最后一位，需要数组的元素向前移动
        if(numMoved>0){
            //arrayCopy中的元素意义：第一个复制前的数组，复制的索引，复制后的数组，复制后数据的索引从哪里开始，挪动元素的个数）
            System.arraycopy(this.arrs,index+1,this.arrs,index,numMoved);
        }
        //因为所有元素往前复制，数组中最后一个元素还存在,因为最后元素已前移，原数组最后一个元素的位置是null;
        this.size--;
        //减完后使用
        this.arrs[this.size]=null;
        return oldValue;
    }
    @Override
    public String toString() {
        Object[] objs=new Object[this.size];
        for(int i=0;i<arrs.length;i++){
            if(arrs[i]!=null){
                objs[i]=arrs[i];
            }
        }
        return Arrays.toString(objs);
    }
}
