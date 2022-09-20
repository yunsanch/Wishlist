package com.example.wishlist

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wishlist.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var wishes: ArrayList<Wish> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.wishListRecyclerView.adapter = WishListAdapter(wishes)
        binding.wishListRecyclerView.layoutManager = LinearLayoutManager(this)




        binding.submitBtn.setOnClickListener {
            it.hideKeyboard()

            val strValItem = binding.itemWishedEt.text.toString().uppercase()
            val strValPrice = binding.itemPriceEt.text.toString().uppercase()
            val strValStore = binding.nameStoreEt.text.toString().uppercase()

//            if (strValStore.equals("")) {
//                binding.itemWishedEt.setHint("please enter an item name")
//                binding.itemWishedEt.setError("please enter an item name")
//            }
//            else
//            {
//                intent in = new Intent(applicationContext(),second.class);
//                startActivity(in)
//            }

            binding.wishListRecyclerView.adapter = WishListAdapter(wishes)
            binding.wishListRecyclerView.layoutManager = LinearLayoutManager(this)



            wishes.add(Wish(strValItem,strValPrice,strValStore))


            binding.itemWishedEt.text.clear()
            binding.itemPriceEt.text.clear()
            binding.nameStoreEt.text.clear()

        }

    }
    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }

}