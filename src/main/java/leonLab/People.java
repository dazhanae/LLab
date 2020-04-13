package leonLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList = new ArrayList<>();

    public void add(Person w){
        personList.add(w);
    }
    public Person findById(Long id){
        for (Person person : personList){
            if (person.getId()==(id)) {
                return person;
            }
        }
        return null;
    }
    public Boolean contains(Person w){
        for(Person person : personList){
            if(person.equals(w))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
    public void remove(Person w){
        if(contains(w))
            personList.remove((int)getIndexOf(w));
    }
    public void remove(Long id){
        Person w = findById(id);
        if (w != null)
            personList.remove((int)getIndexOf(w));
    }
    public Integer getIndexOf(Person w){
        for(int x = 0; x < personList.size(); x++){
            if(personList.get(x).equals(w));
            return x;
        }
        return -1;
    }
    public void removeAll(){
        personList.clear();
    }
    public Integer count(){
        return personList.size();
    }
    public Person[] toArray(){
        Person[] res = (Person[])personList.toArray();
        return res;
    }

    public Iterator iterate() {return personList.iterator();}
}