package com.andallus.entities.moneySociety

/**
  * Created by ot on 04/11/2016.
  */
case class Account(name: String, balance: Int) {
  def increaseBalance(amount: Int) = copy(balance = balance + amount)
  def decreaseBalance(amount: Int) = copy(balance = balance - amount)
}