public class TransposeString {

    public String transpose(String string){
        String[] split = string.split(" ");
        int i;
        int length = split.length;
        for(i=0;i<length;i++)
        {
            split[i]=reverse(split[i]);
        }
        String answer = "";
        for(i=0;i<length;i++){
            answer = answer+split[i]+" ";
        }
        answer=answer.trim();
        return answer;
    }

    public String reverse(String str){
       String reverse="";
       for(int i = str.length() -1 ; i>=0 ; i--)
       {
           reverse =  reverse + str.charAt(i);
       }
       return reverse;
    }
}
