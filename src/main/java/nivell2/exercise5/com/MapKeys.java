package nivell2.exercise5.com;

import java.util.HashMap;

public class MapKeys {
    private final HashMap<String, String> mapa = new HashMap<>();
    public MapKeys(){}

    public void addKey(String key, String value){
        mapa.put(key, value);
    }

    public HashMap<String, String> getMapa(){
        return mapa;
    }
}
