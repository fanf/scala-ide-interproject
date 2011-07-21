package samples.module1B

import samples.module1A.Api1

class Impl1 extends Api1 {

  override def foo(s:String, t:String) = s.capitalize + t
  
}