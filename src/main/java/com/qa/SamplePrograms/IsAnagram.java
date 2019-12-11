package com.qa.SamplePrograms;
/*Annagram:
  For E.G String a1= "Bhanu" and string a2= "nahb".Second String characters are matching in the first String
  characters and Length should be same for two strings is called Anangarm.
 */
public class IsAnagram {
    //Step-1 convert String into charArray
    public boolean checkAnagram(String a1,String a2) {
        char[] chars = a1.toCharArray();
        StringBuilder sb = new StringBuilder(a2);
        for (Character ch : chars) {
            int index = sb.indexOf(""+ch);
            if (index != -1) {
                sb.deleteCharAt(index);
            }
        }
        if(sb.length()==0){
            return true;
        }
        else{
            return false;}
    }
    public static void main(String[] args) {
        IsAnagram obj=new IsAnagram();
        boolean b = obj.checkAnagram("abc", "bca");
        System.out.println(b);
    }
}
