package ir.hajkarami.groceryapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ir.hajkarami.groceryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val itemList: MutableList<Item> = mutableListOf()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        itemList.addAll(
            listOf(
                Item(R.drawable.fruit, "Fruits", "Fresh Fruits from the Garden"),
                Item(R.drawable.vegitables, "Vegetables", "Delicious Vegetables"),
                Item(R.drawable.bread, "Bakery", "Bread, Wheat and Beans"),
                Item(R.drawable.beverage, "Beverage", "Juice, Tea, Coffee and Soda"),
                Item(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt"),
                Item(R.drawable.popcorn, "Snacks", "Pop Corn, Donut and Drinks")
            )
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(itemList)
    }
}
