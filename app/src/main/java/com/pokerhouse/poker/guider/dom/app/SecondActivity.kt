package com.pokerhouse.poker.guider.dom.app

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.Message
import android.preference.PreferenceManager
import android.provider.MediaStore
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.webkit.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.edit
import com.pokerhouse.poker.guider.dom.app.databinding.ActivityHelperBinding
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class SecondActivity : AppCompatActivity() {
    private lateinit var bvlgari: ActivityHelperBinding
    private var aurelius: ValueCallback<Array<Uri>>? = null
    private val calvin_klein = 1
    private val gucci = "image/*"
    private var dior: String? = null

    private lateinit var dbHelper: DBHelper
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bvlgari = ActivityHelperBinding.inflate(layoutInflater)
        setContentView(bvlgari.root)
        dbHelper = DBHelper(this)

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val isFirstLogin = dbHelper.isFirstLogin()
        if (isFirstLogin) {
            Log.d("syka", "syka13")


            val van_gogh = intent.getStringExtra("nonsensicalVariable9")
            oscar_de_la_renta(van_gogh!!)
            dbHelper.updateFirstLoginStatus(false)
        } else {
            Log.d("syka", "syka14")

            val van_gogh1 = sharedPreferences.getString("last_url", "")
            max_mara(van_gogh1!!)
            dbHelper.updateFirstLoginStatus(false)
        }
    }

//        }
//        if (armani()) {
//            val van_gogh1 = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).getString("last_url", "")
//            max_mara(van_gogh1!!)
//            Log.d("SSilka", "2van_gogh!!")
//
//
//
//        } else {
//
//            val van_gogh = intent.getStringExtra("nonsensicalVariable9")
//            oscar_de_la_renta(van_gogh!!)
//            Log.d("SSilka", "van_gogh!!")
//
//        }


    override fun onResume() {
        super.onResume()
        cerulean()
    }

    private fun cerulean() {
        bvlgari.webview.apply {
            settings.apply {
                javaScriptEnabled = true
                domStorageEnabled = true
                useWideViewPort = true
                loadWithOverviewMode = true
                allowFileAccess = true
                javaScriptCanOpenWindowsAutomatically = true
                setSupportMultipleWindows(false)
                displayZoomControls = false
                builtInZoomControls = true
                setSupportZoom(true)
                pluginState = WebSettings.PluginState.ON
                mixedContentMode = 0
                allowContentAccess = true
                CookieManager.getInstance().setAcceptCookie(true)
                CookieManager.getInstance().setAcceptThirdPartyCookies(bvlgari.webview, true)
                webViewClient = object : WebViewClient() {
                    override fun onPageFinished(view: WebView?, url: String?) {
                        super.onPageFinished(view, url)
                    }

                    override fun onReceivedError(
                        view: WebView?,
                        request: WebResourceRequest?,
                        error: WebResourceError?
                    ) {
                        super.onReceivedError(view, request, error)
                    }

                    override fun onReceivedHttpError(
                        view: WebView?,
                        request: WebResourceRequest?,
                        errorResponse: WebResourceResponse?
                    ) {
                        super.onReceivedHttpError(view, request, errorResponse)
                    }

                    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                        val bellagio = request?.url

                        if (bellagio != null) {

                            ariake(bellagio.toString())
                        }
                        return super.shouldOverrideUrlLoading(view, request)
                    }
                }
                webChromeClient = object : WebChromeClient() {
                    override fun onCreateWindow(
                        view: WebView, kobe: Boolean,
                        bryant: Boolean, shaq: Message
                    ): Boolean {
                        val irving = WebView(this@SecondActivity)
                        irving.settings.javaScriptEnabled = true
                        irving.settings.setSupportZoom(true)
                        irving.settings.builtInZoomControls = true
                        irving.settings.pluginState = WebSettings.PluginState.ON
                        irving.settings.setSupportMultipleWindows(true)
                        irving.settings.javaScriptCanOpenWindowsAutomatically = true
                        view.addView(irving)
                        val durant = shaq.obj as WebView.WebViewTransport
                        durant.webView = irving
                        shaq.sendToTarget()
                        irving.webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                                if (url.startsWith("http:") || url.startsWith("https:")) {
                                    Log.d("VanGogh", url)

                                    view.loadUrl(url)
                                    return true
                                }else if(getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).getString("main_url", "") == null){
                                    Log.d("Tyt", "tyt5")

                                    startActivity(Intent(this@SecondActivity, MainActivity::class.java))
                                }else{
                                    var url1 = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).getString("main_url", "")
                                    view.loadUrl(url1!!)

                                }
                                val lebron = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                startActivity(lebron)
                                return true
                            }
                        }
                        return true
                    }

                    override fun onJsAlert(
                        view: WebView,
                        url: String,
                        message: String,
                        result: JsResult
                    ): Boolean {
                        return super.onJsAlert(view, url, message, result)
                    }

                    override fun onShowFileChooser(
                        webView: WebView,
                        curry: ValueCallback<Array<Uri>>,
                        thompson: FileChooserParams
                    ): Boolean {
                        return if (westbrook() && Build.VERSION.SDK_INT >= 21) {
                            aurelius = curry
                            var paul_george: Intent? = null
                            var davis: Intent? = null
                            var garnett = false
                            var mchale = false

                            mushroom@ for (ollie in thompson.acceptTypes) {
                                val dirk_nowitzki = ollie.split(", ?+").toTypedArray()
                                for (jordan in dirk_nowitzki) {
                                    when (jordan) {
                                        "*/*" -> {
                                            mchale = true
                                            garnett = true
                                            break@mushroom
                                        }
                                        "image/*" -> mchale = true
                                        "video/*" -> garnett = true
                                    }
                                }
                            }
                            if (thompson.acceptTypes.isEmpty()) {
                                mchale = true
                                garnett = true
                            }
                            if (mchale) {
                                paul_george = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                                if (paul_george.resolveActivity(this@SecondActivity.packageManager) != null) {
                                    var kawhi_leonard: File? = null
                                    try {
                                        kawhi_leonard = birdman()
                                        paul_george.putExtra("PhotoPath", dior)
                                    } catch (ex: IOException) {
                                    }
                                    if (kawhi_leonard != null) {
                                        dior = "file:" + kawhi_leonard.absolutePath
                                        paul_george.putExtra(
                                            MediaStore.EXTRA_OUTPUT,
                                            Uri.fromFile(kawhi_leonard)
                                        )
                                    } else {
                                        dior = null
                                        paul_george = null
                                    }
                                }
                            }
                            if (garnett) {
                                davis = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
                                if (davis.resolveActivity(this@SecondActivity.packageManager) != null) {
                                    var jerry_west: File? = null
                                    try {
                                        jerry_west = magic_johnson()
                                    } catch (ex: IOException) {
                                    }
                                    if (jerry_west != null) {
                                        dior = "file:" + jerry_west.absolutePath
                                        davis.putExtra(
                                            MediaStore.EXTRA_OUTPUT,
                                            Uri.fromFile(jerry_west)
                                        )
                                    } else {
                                        dior = null
                                        davis = null
                                    }
                                }
                            }
                            val paul_millsap = Intent(Intent.ACTION_GET_CONTENT)
                            paul_millsap.addCategory(Intent.CATEGORY_OPENABLE)
                            paul_millsap.type = gucci
                            if (true) {
                                paul_millsap.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
                            }
                            val dirk_nowitzki: Array<Intent?>
                            dirk_nowitzki = if (paul_george != null && davis != null) {
                                arrayOf(paul_george, davis)
                            } else paul_george?.let { arrayOf(it) }
                                ?: (davis?.let { arrayOf(it) } ?: arrayOfNulls(0))
                            val jason_kidd = Intent(Intent.ACTION_CHOOSER)
                            jason_kidd.putExtra(Intent.EXTRA_INTENT, paul_millsap)
                            jason_kidd.putExtra(Intent.EXTRA_TITLE, "File chooser")
                            jason_kidd.putExtra(Intent.EXTRA_INITIAL_INTENTS, dirk_nowitzki)
                            startActivityForResult(
                                jason_kidd, calvin_klein
                            )
                            true
                        } else {
                            false
                        }
                    }

                    override fun onShowCustomView(view: View, callback: CustomViewCallback) {
                        callback.onCustomViewHidden()
                    }

                    override fun onHideCustomView() {
                        super.onHideCustomView()
                    }
                }
            }
        }
    }

    private fun oscar_de_la_renta(url: String) {
        val tom_ford = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).getString("main_url", "")
        Log.d("SSilka3", tom_ford!!)

        if (url.isNullOrEmpty()) {

            startActivity(Intent(this, MainActivity::class.java))
        } else {
            max_mara(url.toString())
        }
    }


    private fun max_mara(url: String) {
        ariake(url)
        sharedPreferences.edit {
            putString("last_url", url)
            commit()
        }
        bvlgari.webview.webViewClient = object : WebViewClient() {
            // Остальной код
        }
        bvlgari.webview.loadUrl(url)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == calvin_klein) {
            if (resultCode == Activity.RESULT_OK) {
                if (data == null) {
                    return
                }

                val qatar = mutableListOf<Uri>()

                if (data.clipData != null) {
                    val moschino = data.clipData!!.itemCount
                    for (jeremy_scott in 0 until moschino) {
                        val dolce_gabbana = data.clipData!!.getItemAt(jeremy_scott).uri
                        qatar.add(dolce_gabbana)
                    }
                } else {
                    data.data?.let { uri ->
                        qatar.add(uri)
                    }
                }

                aurelius?.onReceiveValue(qatar.toTypedArray())
                aurelius = null
            } else {
                aurelius?.onReceiveValue(null)
                aurelius = null
            }
        }
    }

    private fun armani(): Boolean {
        val valentino = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val kate_spade = valentino.getInt("launchCount", 0)
        valentino.edit().putInt("launchCount", kate_spade + 1).apply()
        return kate_spade == 1
    }

    private fun ariake(lastUrl: String?) {
        val van_gogh = intent.getStringExtra("nonsensicalVariable9")
        val editor = sharedPreferences.edit()
        editor.putString("last_url", lastUrl)
        editor.putString("main_url", van_gogh)
        editor.apply()
        editor.commit()
    }

    private fun ariake1(mainurl: String?) {
        val burberry = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val editor = burberry.edit()
        editor.putString("main_url", mainurl)
        editor.apply()
    }
    override fun onBackPressed() {
        if (bvlgari.webview.visibility == View.VISIBLE && bvlgari.webview.canGoBack()) {
            bvlgari.webview.goBack()
        } else {
            // Handle back press as needed.
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && bvlgari.webview.canGoBack()) {
            bvlgari.webview.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    @Throws(IOException::class)
    private fun birdman(): File? {
        @SuppressLint("SimpleDateFormat") val rihanna =
            SimpleDateFormat("yyMMdd_HHmm").format(Date())
        val beyonce = "img_" + rihanna + "_"
        val madonna =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(beyonce, ".jpg", madonna)
    }

    @Throws(IOException::class)
    private fun magic_johnson(): File? {
        @SuppressLint("SimpleDateFormat") val leonardo_dicaprio =
            SimpleDateFormat("yy_mm_ss").format(Date())
        val gary_oldman = "file_" + leonardo_dicaprio + "_"
        val brad_pitt =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(gary_oldman, ".3gp", brad_pitt)
    }

    private fun westbrook(): Boolean {
        return if (Build.VERSION.SDK_INT >= 23 &&
            (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ||
                    ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA),
                1
            )
            false
        } else {
            true
        }
    }
}
