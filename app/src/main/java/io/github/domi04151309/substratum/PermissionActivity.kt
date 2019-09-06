package io.github.domi04151309.substratum

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.Manifest.permission.READ_PHONE_STATE
import android.content.Intent
import android.provider.Settings
import android.widget.Button


class PermissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        findViewById<Button>(R.id.phone_state).setOnClickListener {
            ActivityCompat.requestPermissions(this, arrayOf(READ_PHONE_STATE), 112)
        }

        findViewById<Button>(R.id.usage_stats).setOnClickListener {
            startActivity(Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS))
        }
    }
}
