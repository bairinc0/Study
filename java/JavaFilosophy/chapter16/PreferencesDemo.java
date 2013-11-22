import java.util.prefs.*;

public class PreferencesDemo{
    public static void main(String [] args) throws Exception{
        Preferences prefs=Preferences.userNodeForPackage(PreferencesDemo.class);
        prefs.put("Location", "Thunder Bluff");
        prefs.put("Class", "Shaman");
        prefs.putInt("Level", 90);
        prefs.putBoolean("Not Active", true);
        int usageCount=prefs.getInt("UsageCount",0);
        usageCount++;
        prefs.putInt("UsageCount", usageCount);
        for (String key:prefs.keys()){
            System.out.println(key+":"+prefs.get(key,null));
            
        }
        System.out.println("And again level:"+prefs.getInt("Level",0));
    }
}