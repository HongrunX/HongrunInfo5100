package assignment6.Q4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Q4
{
public boolean uniqueOccurrences(int[] arr)
{
Map<Integer, Integer> numOccurences = new HashMap<>();
Set setOccurences = new HashSet<>();

    //count number of occurences
    for(int i = 0; i < arr.length; i++)
    {
        if(!numOccurences.containsKey(arr[i]))
        {
            //not in map
            numOccurences.put(arr[i], 1);
        }
        else
        {
            //in map
            numOccurences.put(arr[i], numOccurences.get(arr[i]) + 1);
        }   
    }
    
    for(int key : numOccurences.keySet())
    {
        if(!setOccurences.add(numOccurences.get(key)))
        {
            return false;
        }
    }
    return true;
}
}