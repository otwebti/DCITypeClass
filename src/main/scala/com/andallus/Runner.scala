package com.andallus

import com.andallus.transfer.MoneyTransferContext

/**
  * Created by ot on 04/11/2016.
  */
object Runner extends App{

  new BarterSoc

  new MoneySoc


}


class BarterSoc {


  import com.andallus.entities.bartersociety.Nomad

  import com.andallus.entities.bartersociety.NomadTransfer._

  val source = Nomad("Ahmed",100)

  val destination = Nomad("Khalid",100)

  val transfer = new MoneyTransferContext


  println(s"Source: $source, Destination: $destination")

  val (a,b) = transfer(source,destination,50)

  println(s"Source: $a, Destination: $b")

}

class MoneySoc {


  import com.andallus.entities.moneysociety.Account

  import com.andallus.entities.moneysociety.AccountTransfer._

  val source = Account("Source",100)

  val destination = Account("Destination",100)

  val transfer = new MoneyTransferContext


  println(s"Source: $source, Destination: $destination")

  val (a,b) = transfer(source,destination,50)

  println(s"Source: $a, Destination: $b")

}