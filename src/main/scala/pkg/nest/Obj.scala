// Note that the nesting of the pkg here is critical to reproduce
// the error
package pkg.nest

// Also the private[pkg] here is critical, removing it makes the
// error go away
private[pkg] object Obj {
  var field: String = ""
}
