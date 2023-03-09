package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.ds2.sendmessages.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
 fun sendMessage (view : View){
     val editMessage = findViewById<EditText>(R.id.editMessage)
 /*  val displayMessage =findViewById<TextView>(R.id.displayMessage)
    displayMessage.text = editMessage.text
     Essas linhas mostram o valor de displayMessage na própria Activity.
     Removidos pois iremos mostrar esse valor na proxima activity
  */
     val message = editMessage.text.toString()
     val intent = Intent( this, DisplayMessageActivity::class.java).apply { putExtra (EXTRA_MESSAGE,message)}

     startActivity(intent)

 }
}
