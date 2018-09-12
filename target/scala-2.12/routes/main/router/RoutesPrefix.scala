
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Downloads/Java Ca 1/conf/routes
// @DATE:Sun Mar 11 22:04:10 GMT 2018


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
