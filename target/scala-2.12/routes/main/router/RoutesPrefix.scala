
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Coding/ws_play/play-sandbox/conf/routes
// @DATE:Wed Oct 11 14:03:53 EDT 2017


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
