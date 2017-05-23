package com.project.verbosetech.bustracker.others;

/**
 * Created by this pc on 23-05-17.
 */

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Created by Ravi on 01/06/15.
 */
@SuppressLint("CommitPrefEdits")
public class PrefManager {
    // Shared Preferences
    SharedPreferences pref;

    // Editor for Shared preferences
    Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;


    // Shared pref file name
    private static final String PREF_NAME = "AndroidHive";

    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";

    // Email address (make variable public to access from outside)
    public static final String KEY_EMAIL = "email";

    public static final String Event = "event";

    public static final String LOGIN = "login";


    // Constructor
    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();


    }


    public void setNotifyStatus(String status) {

        editor.putString("status", status);
        editor.commit();
    }

    public void setName(String name) {

        editor.putString("name", name);
        editor.commit();
    }


    public String getNotifyStatus() {
        return pref.getString("status", null);
    }

    public String getName() {
        return pref.getString("name", null);
    }


}

