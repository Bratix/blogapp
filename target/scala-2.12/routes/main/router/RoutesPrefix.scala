// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Amar/Desktop/javaplay_ss/blogapp/conf/routes
// @DATE:Mon Dec 17 01:16:54 CET 2018


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
