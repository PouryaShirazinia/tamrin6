package t;

import java.util.ArrayList;

public class T {

    public ArrayList<Integer> t(ArrayList<Integer> arrayList){
        ArrayList<Integer> newArrayList = new ArrayList<>();
        if (arrayList.size() % 2 != 0){
            for (int i = 0; i < arrayList.size() - 1; i += 2){
                if (arrayList.get(i) <= arrayList.get(i + 1)){
                    newArrayList.add(arrayList.get(i));
                    newArrayList.add(arrayList.get(i + 1));
                }
            }
        }else if (arrayList.size() % 2 == 0){
            for (int i = 0; i < arrayList.size(); i += 2){
                if (arrayList.get(i) <= arrayList.get(i + 1)){
                    newArrayList.add(arrayList.get(i));
                    newArrayList.add(arrayList.get(i + 1));
                }
            }
        }
        return newArrayList;
    }

}
