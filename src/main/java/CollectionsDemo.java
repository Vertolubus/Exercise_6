import java.util.*;

public class CollectionsDemo
{
    //Задание 6.1 "Начинается со строки"
    public static int countStartingWith(ArrayList<String> strings, char c)
    {
        int result = 0;
        for(String string : strings)
        {
            if(string.charAt(0) == c) result++;
        }
        return result;
    }

    //Задание 6.2 "Однофамильцы"
    public static List<Human> getNamesake(ArrayList<Human> humans, Human current)
    {
        List<Human> result = new ArrayList<>(humans.size());
        for(Human human : humans)
        {
            if(human.getSurname().equals(current.getSurname())) result.add(human);
        }
        return result;
    }

    //Задание 6.3 "Копия входного списка без человека"
    public static ArrayList<Human> listWithoutAPerson(ArrayList<Human> humans, Human current)
    {
        ArrayList<Human> humansCopy = new ArrayList<>(humans.size());
        for(Human human : humans)
        {
            if(!human.getSurname().equals(current.getSurname())) humansCopy.add(human);
        }
        return humansCopy;
    }

    //Задание 6.4 "Непересекающиеся множества"
    public static ArrayList<Set<Integer>> disjointSets(ArrayList<Set<Integer>> sOne, Set<Integer> sTwo)
    {
        ArrayList<Set<Integer>> result = new ArrayList<>();

        boolean notEquals = true;
        for(Set<Integer> set : sOne)
        {
            for(Integer num : sTwo)
            {
                if(set.contains(num)) notEquals = false;
            }

            if(notEquals) result.add(set);
            notEquals = true;
        }
        return result;
    }

    //Задание 6.5 "Множество людей с максимальным возрастом"
    public static Set<Human> maxAge(ArrayList<Human> humans)
    {
        Set<Human> result = new HashSet<>();
        int maxAge = 0;

        for(Human human : humans){
            if(human.getAge() > maxAge) maxAge = human.getAge();
        }

        for(Human human : humans){
            if(human.getAge() == maxAge) result.add(human);
        }

        return result;
    }

    //Задание 6.7 "Множество людей, идентификаторы которых содержатся во входном множестве"
    public static Set<Human> humanSet(Map<Integer, Human> mapH, Set<Integer> setI){
        Set<Human> result = new HashSet<>();
        for(Integer num : setI)
        {
            if(mapH.containsKey(num)){
                result.add(mapH.get(num));
            }
        }
        return result;
    }

    public static ArrayList<Integer> eighteenYears(Map<Integer, Human> map){
        ArrayList result = new ArrayList<>(map.size());
        for(Map.Entry<Integer, Human> entry : map.entrySet()){
            if(entry.getValue().getAge() >= 18) result.add(entry.getKey());
        }
        return result;
    }

    public static Map<Integer, Integer> ageIdentifiers(Map<Integer, Human> map)
    {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for(Map.Entry<Integer, Human> entry : map.entrySet()){
            result.put(entry.getKey(), entry.getValue().getAge());
        }
        return result;
    }

    public static Map<Integer, ArrayList<Human>> listOfPeopleOfAGivenAge(Map<Integer, Human> map){

    }
}
