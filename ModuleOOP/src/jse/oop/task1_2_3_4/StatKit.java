package jse.oop.task1_2_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StatKit {

    private ArrayList<Stationery> kit = new ArrayList<>();

    public ArrayList<Stationery> getKit() {
        return kit;
    }

    public void setKit(Stationery stationery){
        kit.add(stationery);
    }

    public StatKit() {}

    public void sortKitPrice() {
        Collections.sort(kit, getStationeryPriceComparator());
    }

    private Comparator<Stationery> getStationeryPriceComparator() {
        return (s1, s2) -> {
            if (s1.getPrice() > s2.getPrice())
                return 1;
            else if (s1.getPrice() == s2.getPrice())
                return 0;
            else
                return -1;
        };
    }
    public void sortKitName() {
        Collections.sort(kit, getStationeryNameComparator());
    }

    private Comparator<Stationery> getStationeryNameComparator() {
        return (s1, s2) -> s1.getName().compareTo(s2.getName());
    }
}


//    public void sortKitName(){
//        Collections.sort(kit, new Comparator<Stationery>(){
//            @Override
//            public int compare(Stationery s1, Stationery s2){
//                return s1.getName().compareTo(s2.getName());
//            }
//        });
//

