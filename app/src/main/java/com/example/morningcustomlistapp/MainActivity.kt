package com.example.morningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var mList:ListView?= null
    var users:ArrayList<User>?=null
    var adapter:CustomAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList=findViewById(R.id.mlistusers)
        users= ArrayList()
        adapter= CustomAdapter(this,users!!)
        var user1 = User(R.mipmap.back,"King Wanyama","0714000000")
        var user2 = User(R.mipmap.caps,"Lewis","072453678")
        var user3 = User(R.mipmap.city,"Lusweti","0789654327")
        var user4 = User(R.mipmap.clas,"Kabusia","0714076859")
        var user5 = User(R.mipmap.download,"King ","0714000000")
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)

        mList!!.adapter=adapter!!
    }
}