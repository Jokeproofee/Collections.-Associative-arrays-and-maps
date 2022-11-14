import telephoneDirectory.TelephoneDirectory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1 (Задание 1):");

        TelephoneDirectory phone1 = new TelephoneDirectory("Наталья Богданова","+7(812)100-37-85");
        TelephoneDirectory phone2 = new TelephoneDirectory("Мария Румянцева","+7(812)429-49-10");
        TelephoneDirectory phone3 = new TelephoneDirectory("Иван Кондратьев","+7(812)970-68-20");
        TelephoneDirectory phone4 = new TelephoneDirectory("Андрей Сорокин","+7(812)339-03-26");
        TelephoneDirectory phone5 = new TelephoneDirectory("Виктория Юдина","+7(812)378-06-33");
        TelephoneDirectory phone6 = new TelephoneDirectory("Кира Любимова","+7(812)535-55-68");
        TelephoneDirectory phone7 = new TelephoneDirectory("Ксения Кудрявцева","+7(812)491-22-21");
        TelephoneDirectory phone8 = new TelephoneDirectory("Алиса Сергеева","+7(812)515-84-22");
        TelephoneDirectory phone9 = new TelephoneDirectory("Кирилл Сидоров","+7(812)017-64-17");
        TelephoneDirectory phone10 = new TelephoneDirectory("Анастасия Гордеева","+7(812)536-00-55");
        TelephoneDirectory phone11 = new TelephoneDirectory("Дмитрий Большаков","+7(812)407-84-86");
        TelephoneDirectory phone12 = new TelephoneDirectory("Владимир Серебряков","+7(812)156-27-09");
        TelephoneDirectory phone13 = new TelephoneDirectory("Фёдор Лазарев","+7(812)441-06-90");
        TelephoneDirectory phone14 = new TelephoneDirectory("Александра Белкина","+7(812)185-92-46");
        TelephoneDirectory phone15 = new TelephoneDirectory("Ульяна Головина","+7(812)928-61-81");
        TelephoneDirectory phone16 = new TelephoneDirectory("Александр Носов","+7(812)387-63-36");
        TelephoneDirectory phone17 = new TelephoneDirectory("Ксения Николаева","+7(812)396-11-30");
        TelephoneDirectory phone18 = new TelephoneDirectory("Анастасия Маслова","+7(812)872-40-50");
        TelephoneDirectory phone19 = new TelephoneDirectory("Григорий Серов","+7(812)548-16-95");
        TelephoneDirectory phone20 = new TelephoneDirectory("Елена Андреева","+7(812)277-42-70");

        Map<String,String> guide = new HashMap<>();
        guide.put(phone1.getName(),phone1.getNumber());
        guide.put(phone2.getName(),phone2.getNumber());
        guide.put(phone3.getName(),phone3.getNumber());
        guide.put(phone4.getName(),phone4.getNumber());
        guide.put(phone5.getName(),phone5.getNumber());
        guide.put(phone6.getName(),phone6.getNumber());
        guide.put(phone7.getName(),phone7.getNumber());
        guide.put(phone8.getName(),phone8.getNumber());
        guide.put(phone9.getName(),phone9.getNumber());
        guide.put(phone10.getName(),phone10.getNumber());
        guide.put(phone11.getName(),phone11.getNumber());
        guide.put(phone12.getName(),phone12.getNumber());
        guide.put(phone13.getName(),phone13.getNumber());
        guide.put(phone14.getName(),phone14.getNumber());
        guide.put(phone15.getName(),phone15.getNumber());
        guide.put(phone16.getName(),phone16.getNumber());
        guide.put(phone17.getName(),phone17.getNumber());
        guide.put(phone18.getName(),phone18.getNumber());
        guide.put(phone19.getName(),phone19.getNumber());
        guide.put(phone20.getName(),phone20.getNumber());

        for (Map.Entry<String, String> stringEntry : guide.entrySet()) {
            System.out.println(stringEntry.getKey() + " / " + stringEntry.getValue());
        }

        System.out.println();
        System.out.println("Домашнее задание 1 (Задание 3):");

        Map<String,Integer> str = new HashMap<>();
        putStr(str,"число",14);
        putStr(str,"число",16);
        putStr(str,"число1",14);
        putStr(str,"число2",15);

        for (Map.Entry<String, Integer> stringIntegerEntry : str.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " / " + stringIntegerEntry.getValue());
        }

        System.out.println();
        System.out.println("Домашнее задание 2 (Задание 1):");
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("string1",List.of(11,12,13));
        listMap.put("string2",List.of(100,120,130));
        listMap.put("string3",List.of(210,125,138));
        listMap.put("string4",List.of(119,184,136));
        listMap.put("string5",List.of(399,522,999));

        Map<String, Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : listMap.entrySet()) {
            listMap1.put(stringListEntry.getKey(), stringListEntry.setValue(stringListEntry.getValue()).stream().reduce(0, Integer::sum));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " / " + stringIntegerEntry.getValue());
        }

        System.out.println();
        System.out.println("Домашнее задание 2 (Задание 2):");
        Map<Integer, String> someNumbers = new LinkedHashMap<>();
        someNumbers.put(1,"someNumbers1");
        someNumbers.put(2,"someNumbers2");
        someNumbers.put(3,"someNumbers3");
        someNumbers.put(4,"someNumbers4");
        someNumbers.put(5,"someNumbers5");
        someNumbers.put(6,"someNumbers6");
        someNumbers.put(7,"someNumbers7");
        someNumbers.put(8,"someNumbers8");
        someNumbers.put(9,"someNumbers9");
        someNumbers.put(10,"someNumbers10");

        for (Map.Entry<Integer, String> integerStringEntry : someNumbers.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " / " + integerStringEntry.getValue());
        }
    }

    public static void putStr(Map<String,Integer> str,String s,Integer i) {
        if (str.containsKey(s) && str.containsValue(i)){
            throw new RuntimeException(str + " ключ уже есть и значения совпадают.");
        }
        str.put(s,i);
    }
}