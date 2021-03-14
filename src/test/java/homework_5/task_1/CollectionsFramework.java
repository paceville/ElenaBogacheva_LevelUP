package homework_5.task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionsFramework {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        HashSet<Integer> listSet = new HashSet<>(list);

        while (list.size() != listSet.size()) {
            int a = list.size() - listSet.size();

            for (int i = 0; i < a; i++) {
                int rnd = random(10);
                int item = 0;
                for (int newItem : list) {
                    if (rnd != newItem) {
                        item = rnd;
                    }
                }
                listSet.add(item);
            }
        }

        list.clear();
        for (int item : listSet) {
            list.add(item);
        }

        Collections.shuffle(list);

        ArrayList<Integer> multiple2 = new ArrayList<>();
        ArrayList<Integer> multiple3 = new ArrayList<>();
        ArrayList<Integer> multiple5 = new ArrayList<>();
        ArrayList<Integer> multiple7 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);

            if (element % 2 == 0) {
                multiple2.add(element);
            } else if (element % 3 == 0) {
                multiple3.add(element);
            } else if (element % 5 == 0) {
                multiple5.add(element);
            } else if (element % 7 == 0) {
                multiple7.add(element);
            }
        }

        Collections.sort(multiple2);
        Collections.sort(multiple3);
        Collections.sort(multiple5);
        Collections.sort(multiple7);

        System.out.println("list2: " + multiple2);
        System.out.println("list2 size: " + multiple2.size());
        System.out.println("list3: " + multiple3);
        System.out.println("list3 size: " + multiple3.size());
        System.out.println("list5: " + multiple5);
        System.out.println("list5 size: " + multiple5.size());
        System.out.println("list7: " + multiple7);
        System.out.println("list7 size: " + multiple7.size());
    }

    public static int random(int max) {
        return (int) (Math.random() * ++max);
    }
}