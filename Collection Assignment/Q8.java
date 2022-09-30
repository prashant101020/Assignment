// package Collection

import java.util.*;

// Assignment;
class MapManager{
    Set<Integer> getKeys(HashMap<Integer,Integer> map){
        Set<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            set.add(mp.getKey());
        }
        return set;
    }
}
public class Q8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number of keys and value");
        int num=sc.nextInt();
        System.out.println("Input the keys and value");
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num;i++){
            int key=sc.nextInt();
            int val=sc.nextInt();
            map.put(key,val);

        }
        MapManager mm=new MapManager();
        Set<Integer> set=mm.getKeys(map);
        for(int i:set){
            System.out.print(i+" ");
        }
    }
}
