package AdventureGame;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "an object oriented platform independent language");
        languages.put("R", "another programming language");
        languages.put("Python", "an object oriented programming language");
        languages.put("CSS", "not a programming language but styling sheet");
        languages.put("C#", "a programming language");
        languages.put("Javascript", "scripting language to dynamically design a DOM");


        System.out.println(languages.get("Java"));
        //some way to do validation for HashMap
        if(languages.containsKey("Java")){
            System.out.println("Java already defined");
        }else {
            languages.put("Java", "This is another definition of java");
        }

        languages.remove("CSS");
        //it check key and value pair. It will not remove c# since the value above is different. It can also be used as condition which returns booleans
        languages.remove("C#", "another language");

        if(languages.remove("java", "this is not right")){
            System.out.println("Java removed");
        }else{
            System.out.println("Java not removed");
        }

        languages.replace("C#", "a structured and procedural programming language");

        if(languages.replace("C#", "old value", "new value, it will not work since old value is diff from what is above")){
            System.out.println("C# value was replaced");
        }else{
            System.out.println("C# was not replaced");
        }



        for(String key : languages.keySet()){
            System.out.println(key+" : "+ languages.get(key));
        }



    }
}
