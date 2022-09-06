package practice_activities.dang_nhap;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Bro","pizza");
        logininfo.put("HeyBoy","061296");
        logininfo.put("HaiBinh","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
