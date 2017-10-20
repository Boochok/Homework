package hw.oop.task1_2_3_4;

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

    public void sortByPrice(){
        Collections.sort(kit, getPriceComparator());
    }
    private Comparator<Stationery> getPriceComparator() {
        return (s1, s2) -> {
            Double d1 = s1.getPrice();
            Double d2 = s2.getPrice();
            return d1.compareTo(d2);
        };
    }
    public void sortByName(){
        Collections.sort(kit, getNameComparator());
        kit.sort(getNameComparator());
    }

    private Comparator<Stationery> getNameComparator() {
        return (stationery1, stationery2) -> stationery1.getName().compareTo(stationery2.getName());
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

