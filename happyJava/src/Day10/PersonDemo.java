package Day10;

import java.util.*;

public class PersonDemo {
    public static void main(String[] args) {
        //Person을 여러명 저장하는 자료구조를 생각해보세요.

        Person person1 =
                new Person("123-111","kang","010-111-1111","강남구 역삼동");
        Person person2 =
                new Person("123-222","hong","010-111-2222","강남구 역삼동");
        Person person3 =
                new Person("123-333","park","010-111-3333","강남구 역삼동");
        Person person4 =
                new Person("123-444","kim","010-111-4444","강남구 역삼동");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);


        Map<String, Person> personMap = new HashMap<>();
        personMap.put(person1.getIdNumber(), person1);
        personMap.put(person2.getIdNumber(),person2);
        personMap.put(person3.getIdNumber(), person3);
        personMap.put(person4.getIdNumber(),person4);

        Person found1 = null;
        {
            for (Person person : personList) {
                if (person.getIdNumber() == "123-111") {
                    found1 = person;
                    break;
                }
            }
        }

        Person found2 = null;
        {
            Iterator<Person> iterator = personSet.iterator();
            while (iterator.hasNext()) {
                Person checkingPerson = iterator.next();
                if (checkingPerson.getIdNumber() == "123-222") {
                    found2 = checkingPerson;
                    break;
                }
            }
        }

        Person found3 = null;
        {
            Iterator<String> iterator = personMap.keySet().iterator();
            while (iterator.hasNext()) {
                String checkingKey = iterator.next();
                Person checkingPerson = personMap.get(checkingKey);
                if (checkingPerson.getIdNumber() == "123-333") {
                    found3 = checkingPerson;
                    break;
                }
            }
        }

        System.out.println(found1);
        System.out.println(found2);
        System.out.println(found3);

        System.out.println("----------------------------");

        Person result = null;
        for (Person p : personList) {
            if (p.getIdNumber().equals("123-111")) {
                result = p;
                System.out.println(result);
            }
        }

        for (Person p : personSet) {
            if (p.getIdNumber().equals("123-222")) {
                result = p;
                System.out.println(result);
            }
        }

        for (String key : personMap.keySet()) {
            if (key.equals("123-333")) {
                result = personMap.get(key);
                System.out.println(result);
            }
        }


    }
}
