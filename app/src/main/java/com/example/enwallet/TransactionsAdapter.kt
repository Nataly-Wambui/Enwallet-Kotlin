package com.example.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionsAdapter(var transactionList: List<Transactions>): RecyclerView.Adapter<TransactionsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.transaction_history, parent, false)
        return TransactionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionsViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.tvSalary.text = transaction.salary
        holder.tvAmount.text = transaction.amount
        holder.tvDate.text = transaction.date

    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}
class TransactionsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvSalaryAmount)
    var tvDate= itemView.findViewById<TextView>(R.id.tvDate)

}