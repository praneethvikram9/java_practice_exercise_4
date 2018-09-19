public class CheckCharOcc {
    public int CheckOcc(String string , char c){
        int count=0;

        int length = string.length();
        String s = string.replace(string.valueOf(c),"");
        int len = s.length();
        count = length - len;
        return count;
    }
}
