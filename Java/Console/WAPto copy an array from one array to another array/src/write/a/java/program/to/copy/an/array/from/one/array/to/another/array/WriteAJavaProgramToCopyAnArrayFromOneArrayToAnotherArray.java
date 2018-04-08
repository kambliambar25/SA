package write.a.java.program.to.copy.an.array.from.one.array.to.another.array;
public class WriteAJavaProgramToCopyAnArrayFromOneArrayToAnotherArray {   
    public static void main(String[] args) {
        
        int array[] = new int[]{1,2,3,4,5};
        int arraye[] = new int[array.length];
        int i;
        for(i=0;i<array.length;i++)
        {
            arraye[i]=array[i];
        }
        System.out.println("Copied array is ");
        for(i=0;i<array.length;i++)
        {
        System.out.print(arraye[i] + " ");
    }
}
}
