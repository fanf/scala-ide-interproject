package samples.module1A

trait Api3 {

  
  def api3( t: (String,Int)) = t._1 + t._2.toString
  
  def x : String
}