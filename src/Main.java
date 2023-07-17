public class Main {
    public static void main(String[] args) {
        String message ="Another Love.";//Create string message.
        System.out.println(message);//print message.
        System.out.println("Number of elements "+message.length());//The code that finds the number of elements of the message.
        System.out.println("11th element="+message.charAt(10));//Which char is the 11th element.
        System.out.println(message.concat(""));//Adding message.
        System.out.println(message.startsWith("A"));//if start b true false.
        System.out.println(message.startsWith("B"));//if start B true false.
        System.out.println(message.endsWith("."));//if . finish true false.
        System.out.println(message.endsWith("c"));//if finish c true false.
        char[ ] characters =new char[8];//Creates an 8-element string..
        message.getChars(0,8,characters,0);//getchars action pulls element from string message to array of characters.
        System.out.println(characters);//outputs a string of characters.
        System.out.println(message.indexOf('k'));//which element k searches from the beginning.
        System.out.println(message.lastIndexOf('m'));//searches from the end
        System.out.println("------------------------------------------------------------------------");
        String newmessage=message.replace(' ','-');//replace old makes new char.
        System.out.println(newmessage);
        System.out.println(message.substring(4));//takes the first 4
        System.out.println(message.substring(0,2));//0 inclusive up to 2
        System.out.println("------------");
        for (String kelime:message.split(" ")){//split separates words when it sees spaces
            System.out.println(kelime);
        }
        System.out.println(message.toLowerCase());//lowercase the message.
        System.out.println(message.toUpperCase());//capitalizes the message.
        String message1="      Another Love          ";
        System.out.println(message1);
        System.out.println(message1.trim());//Removes leading and trailing spaces.

    }
}