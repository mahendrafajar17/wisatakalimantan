package com.mahendrafajar17.wisatakalimantan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWisata = findViewById(R.id.recyclerView)
        rvWisata.setHasFixedSize(true)

        list.addAll(WisataData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(list)
        rvWisata.adapter = listWisataAdapter

        listWisataAdapter.setOnItemClickCallback(object : ListWisataAdapter.OnItemClickCallback{
            override fun onItemClicked(wisata: Wisata) {
                showSelectedWisata(wisata)
            }
        })
    }

    fun showSelectedWisata(wisata: Wisata){
        val intent = Intent(this, WisataDetails::class.java)
        intent.putExtra("wisata", wisata)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.tentang -> startActivity(Intent(this, Tentang::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}
