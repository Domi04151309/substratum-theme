package io.github.domi04151309.substratum

import android.content.ComponentName
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.substratum).setOnClickListener {
            val i = Intent()
            val n = ComponentName("projekt.substratum",
                    "projekt.substratum.LauncherActivity")
            i.component = n
            startActivity(i)
        }
    }
}
