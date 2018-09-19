public class StringSort {
    public String[] StringWordSort(String string){
        String[] split = string.split(" ");
        int i,j;
        String temp = "";
        int length = split.length;
        for(i=0;i<length;i++)
        {
            for(j=i+1;j<length;j++){

                if(split[i].compareTo(split[j])>0){
                    temp = split[j];
                    split[j]=split[i];
                    split[i]=temp;
                }

            }
        }

        return split;
    }
}
