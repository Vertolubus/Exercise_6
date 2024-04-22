import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

public class CollectionsDemoTest
{
    @Test
    public void testCountStartingWith()
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("яблоко");
        strings.add("арбуз");
        strings.add("арбуз");
        strings.add("дыня");
        strings.add("ягода");
        assertEquals(2, CollectionsDemo.countStartingWith(strings, 'я'));
        assertEquals(2, CollectionsDemo.countStartingWith(strings, 'а'));
        assertEquals(0, CollectionsDemo.countStartingWith(strings, 'Н'));
    }

    @Test
    public void testGetNamesake()
    {
        ArrayList<Human> humans = new ArrayList<>(6);
        Human human1 = new Human("Иванов", "Иван", "Иванович", 32);
        Human human2 = new Human("Иванов", "Борис", "Иванович", 63);
        Human human3 = new Human("Джонсон", "Борис", "Джон", 11);
        Human human4 = new Human("Иванов", "Михаил", "Михайлович", 6);
        Human human5 = new Human("Мармеладзе", "Валерий", "Шотаевич", 58);
        Human human6 = new Human("Иванов", "Иван", "Иванович", 20);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);
        humans.add(human6);
        ArrayList<Human> result = new ArrayList<>(4);
        result.add(human1);
        result.add(human2);
        result.add(human4);
        result.add(human6);
        assertEquals(result, CollectionsDemo.getNamesake(humans, human1));
    }

    @Test
    public void testListWithoutAPerson()
    {
        ArrayList<Human> humans = new ArrayList<>(6);
        Human human1 = new Human("Иванов", "Иван", "Иванович", 32);
        Human human2 = new Human("Иванов", "Борис", "Иванович", 63);
        Human human3 = new Human("Джонсон", "Борис", "Джон", 11);
        Human human4 = new Human("Иванов", "Михаил", "Михайлович", 6);
        Human human5 = new Human("Мармеладзе", "Валерий", "Шотаевич", 58);
        Human human6 = new Human("Иванов", "Иван", "Иванович", 20);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);
        humans.add(human6);
        ArrayList<Human> result = new ArrayList<>(2);
        result.add(human3);
        result.add(human5);
        assertEquals(result, CollectionsDemo.listWithoutAPerson(humans, human1));
    }

    @Test
    public void testDisjointSets()
    {
        Set<Integer> sOne = new HashSet<>();
        sOne.add(1);
        sOne.add(2);
        sOne.add(3);
        sOne.add(4);
        sOne.add(5);
        sOne.add(6);
        Set<Integer> sTwo = new HashSet<>();
        sTwo.add(7);
        sTwo.add(8);
        sTwo.add(9);
        Set<Integer> sThree = new HashSet<>();
        sThree.add(1);
        sThree.add(12);
        sThree.add(33);
        ArrayList<Set<Integer>> set = new ArrayList<>();
        set.add(sOne);
        set.add(sTwo);
        set.add(sThree);
        ArrayList<Set<Integer>> result = new ArrayList<>();
        result.add(sTwo);
        assertEquals(result, CollectionsDemo.disjointSets(set, sThree));
    }

    @Test
    public void testMaxAge()
    {
        ArrayList<Human> humans = new ArrayList<>(6);
        Human human1 = new Human("Абабаев", "Ерланус", "Карбюратович", 6);
        Human human2 = new Human("Иванов", "Борис", "Иванович", 63);
        Human human3 = new Human("Джонсон", "Борис", "Джон", 32);
        Human human4 = new Human("Иванов", "Михаил", "Михайлович", 6);
        Human human5 = new Human("Мармеладзе", "Валерий", "Шотаевич", 58);
        Human human6 = new Human("Байтуганов", "Хахар", "Батькович", 19);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);
        humans.add(human6);
        Set<Human> result = new HashSet<>();
        result.add(human2);
        //System.out.println(CollectionsDemo.maxAge(humans).toString());
        assertEquals(result, CollectionsDemo.maxAge(humans));
    }

    @Test
    public void testHumanTest(){
        HashMap<Integer, Human> human = new HashMap<>();
        human.put(12345, new Human("Абабаев", "Ерланус", "Карбюратович", 6));
        human.put(23456, new Human("Байтуганов", "Хахар", "Батькович", 19));
        human.put(34567, new Human("Джонсон", "Борис", "Джон", 32));
        human.put(45678, new Human("Мармеладзе", "Валерий", "Шотаевич", 58));
        human.put(56789, new Human("Иванов", "Михаил", "Михайлович", 6));
        Set<Integer> set = new HashSet<>();
        set.add(12345);
        set.add(45678);
        set.add(56789);
        Human human1 = new Human("Абабаев", "Ерланус", "Карбюратович", 6);
        Human human2 = new Human("Мармеладзе", "Валерий", "Шотаевич", 58);
        Human human3 = new Human("Иванов", "Михаил", "Михайлович", 6);
        Set<Human> result = new HashSet<>();
        result.add(human1);
        result.add(human2);
        result.add(human3);
        assertEquals(result, CollectionsDemo.humanSet(human, set));
    }

    @Test
    public void testEighteenYears(){
        Map<Integer, Human> human = new LinkedHashMap<>();

        Human human1 = new Human("Байтуганов", "Хахар", "Батькович", 19);
        Human human2 = new Human("Джонсон", "Борис", "Джон", 32);
        Human human3 = new Human("Мармеладзе", "Валерий", "Шотаевич", 18);
        Human human4 = new Human("Абабаев", "Ерланус", "Карбюратович", 6);
        Human human5 = new Human("Иванов", "Михаил", "Михайлович", 6);

        human.put(12345, human1);
        human.put(23456, human3);
        human.put(34567, human2);
        human.put(45678, human5);
        human.put(56789, human4);

        ArrayList<Integer> result = new ArrayList<>(3);
        result.add(12345);
        result.add(23456);
        result.add(34567);

        assertEquals(result, CollectionsDemo.eighteenYears(human));
    }

    @Test
    public void testAgeIdentifiers(){
        Map<Integer, Human> human = new LinkedHashMap<>();

        Human human1 = new Human("Байтуганов", "Хахар", "Батькович", 19);
        Human human2 = new Human("Джонсон", "Борис", "Джон", 32);
        Human human3 = new Human("Мармеладзе", "Валерий", "Шотаевич", 18);
        Human human4 = new Human("Абабаев", "Ерланус", "Карбюратович", 6);
        Human human5 = new Human("Иванов", "Михаил", "Михайлович", 6);

        human.put(12345, human1);
        human.put(23456, human3);
        human.put(34567, human2);
        human.put(45678, human5);
        human.put(56789, human4);

        Map<Integer, Integer> result = new LinkedHashMap<>();
        result.put(12345, 19);
        result.put(23456, 18);
        result.put(34567, 32);
        result.put(45678, 6);
        result.put(56789, 6);

        assertEquals(result, CollectionsDemo.ageIdentifiers(human));
    }

    @Test
    public void testListOfPeopleOfAGivenAge(){
        Human human1 = new Human("Байтуганов", "Хахар", "Батькович", 19);
        Human human2 = new Human("Джонсон", "Борис", "Джон", 32);
        Human human3 = new Human("Мармеладзе", "Валерий", "Шотаевич", 18);
        Human human4 = new Human("Абабаев", "Ерланус", "Карбюратович", 6);
        Human human5 = new Human("Иванов", "Михаил", "Михайлович", 6);

        Set<Human> setHumans = new LinkedHashSet<>();
        setHumans.add(human1);
        setHumans.add(human2);
        setHumans.add(human3);
        setHumans.add(human4);
        setHumans.add(human5);

        Map<Integer, ArrayList<Human>> result = new LinkedHashMap<>();

        ArrayList<Human> oneAge = new ArrayList<>();
        oneAge.add(human1);
        ArrayList<Human> twoAge = new ArrayList<>();
        twoAge.add(human2);
        ArrayList<Human> threeAge = new ArrayList<>();
        threeAge.add(human3);
        ArrayList<Human> fourAge = new ArrayList<>();
        fourAge.add(human4);
        fourAge.add(human5);

        result.put(19, oneAge);
        result.put(32, twoAge);
        result.put(18, threeAge);
        result.put(6, fourAge);

        assertEquals(result, CollectionsDemo.listOfPeopleOfAGivenAge(setHumans));
    }
}