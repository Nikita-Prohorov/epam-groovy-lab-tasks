/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/

package groovylab

class Task07 {
    public static String encryptThis(String s) {
    def length = []
    if(s.length()==0){
     return("")
    }
    else{
     for (def str:s.split(" ")) {
       if(str.length()<=2){
         if(str.length()==1){
         length<<((int)str[0])
         }else{
         length<<((int)str[0]+str[1])
         }
       }else{
         length<<((int)str[0]+str[-1]+str[2..-2]+str[1])
       }
    }
    return length.join(" ")  
    }
  }
}
