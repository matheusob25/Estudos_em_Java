package services;


import java.util.List;

public class CalculationService{

    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty!!");
        }
        T aux = list.get(0);
        for(T i : list){
            if(i.compareTo(aux) > 0){
                aux = i;
            }
        }
        return aux;
    }


}
