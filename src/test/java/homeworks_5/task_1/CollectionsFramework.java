package homeworks_5.task_1;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFramework {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        ArrayList<Integer> multiple2 = new ArrayList<>();
        ArrayList<Integer> multiple3 = new ArrayList<>();
        ArrayList<Integer> multiple5 = new ArrayList<>();
        ArrayList<Integer> multiple7 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);

            if (element % 2 == 0) {
                if (element % 3 == 0) {
                    if (element % 5 == 0) {
                        if (element % 7 == 0) {
                            multiple2.add(element);
                        }
                        multiple2.add(element);
                    }
                    multiple2.add(element);
                }
                multiple2.add(element);
            }
        }

    }
}
