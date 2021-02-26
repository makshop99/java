package Day02.Exercises;

public class KeyValuePair<K, V>
{
    // generic Key
    private K key;
    public K getKey() {return key;}
    public void setKey(K key){this.key = key;}

    // generic Value
    private V value;
    public V getValue() {return value;}
    public void setValue(V value) {this.value = value;}

    public String toString()
    {
        return key + " -> " + value;
    }
}
