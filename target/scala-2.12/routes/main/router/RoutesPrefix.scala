// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Amar/Desktop/javaplay/blogapp/conf/routes
// @DATE:Mon Dec 03 02:28:44 CET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
