package com.example.menuebtn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menue, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val item: MenuItem =menu!!.getItem(0)
        item.title="Main"
        val item1: MenuItem =menu!!.getItem(1)
        item1.title="Home"
        val item2: MenuItem =menu!!.getItem(2)
        item2.title="About"
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.item2 -> {
                val intent2= Intent(this,MainActivity2::class.java)
                startActivity(intent2)
                return true
            }
            R.id.item3 -> {
                val intent3= Intent(this,MainActivity3::class.java)
                startActivity(intent3)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}