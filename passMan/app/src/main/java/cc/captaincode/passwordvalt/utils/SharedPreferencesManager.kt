package cc.captaincode.passwordvalt.utils

import android.content.Context
import android.preference.PreferenceManager
import android.util.Log

class SharedPreferencesManager(private val context: Context) {
    val USER_ID = "userId"

    fun saveLoginInfo(apiKey: String, userId:String) {
        val sharedPref = PreferenceManager.getDefaultSharedPreferences(context.applicationContext)
        val editor = sharedPref.edit()
        editor.putString(USER_ID, userId)
        editor.apply()
    }


    fun getSharedPrefValue(key: String): String {
        val sharedPref = PreferenceManager.getDefaultSharedPreferences(context.applicationContext)
        Log.d("debugging", sharedPref.getString(key,""))
        return sharedPref.getString(key, "")!!
    }
}