package com.example.recylerview

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AddActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var buttonSave: Button
    private lateinit var dbHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        editTextName = findViewById(R.id.editTextName)
        buttonSave = findViewById(R.id.buttonSave)
        dbHelper = DatabaseHelper(this)

        buttonSave.setOnClickListener {
            val name = editTextName.text.toString().trim()
            if (name.isNotEmpty()) {
                val item = Item(name = name)
                val success = dbHelper.addItem(item)
                if (success) {
                    Toast.makeText(this, "Item added", Toast.LENGTH_SHORT).show()
                    setResult(Activity.RESULT_OK)
                    finish()
                } else {
                    Toast.makeText(this, "Failed to add item", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
