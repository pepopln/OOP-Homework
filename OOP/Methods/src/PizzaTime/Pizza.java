package PizzaTime;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pizza {
public Map<Integer,List<String>>PizzaGroups(String...params){
    HashMap<Integer,List<String>> result =new HashMap<>();
    String regex = "(\\d+)([^\\s]+)";
    Pattern pattern = Pattern.compile(regex);
    for (String param : params) {
        Matcher matcher = pattern.matcher(param);
        if (!matcher.find()){
            continue;
        }
        int group = Integer.valueOf(matcher.group(1));
        String name = matcher.group(2);
        if (!result.containsKey(group)){
            result.put(group,new ArrayList<>());
        }
        result.get(group).add(name);
    }
    return result;
}

    }


