package com.example.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTransactions.layoutManager = LinearLayoutManager(this)
        displayTransactions()
    }

    fun displayTransactions(){
        val salary = Transactions("Salary", "KES 40000", "1 July 2024",)
        val rent = Transactions("Rent", "KES 16000", "2 July 2024",)
        val dividends = Transactions("Dividends", "KES 2400", "4 July 2024",)
        val electricity = Transactions("Electricity", "KES 800", "5 July 2024",)
        val internet = Transactions("Internet", "KES 2500", "5 July 2024",)
        val shopping = Transactions("Shopping", "KES 3500", "5 July 2024",)
        val busFare = Transactions("Bus fare", "KES 500", "11 July 2024",)
        val waterBill= Transactions("Water bill", "KES 2000", "11 July 2024",)
        val blogs = listOf(salary, rent, dividends, electricity, internet, shopping, busFare, waterBill)

        val transactionsAdapter = TransactionsAdapter(blogs)
        binding.rvTransactions.adapter = transactionsAdapter
    }
}