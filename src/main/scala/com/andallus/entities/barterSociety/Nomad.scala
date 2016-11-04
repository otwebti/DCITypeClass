package com.andallus.entities.bartersociety

/**
  * Created by ot on 04/11/2016.
  */
case class Nomad(name: String, waterSupply: Int) {

  def giveWater(amount: Int) = copy(waterSupply = waterSupply - amount)

  def receiveWater(amount: Int) = copy(waterSupply = waterSupply + amount)

}
