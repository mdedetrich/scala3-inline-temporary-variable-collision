package pkg

import pkg.nest

private[pkg] trait AInline { this: APlusB =>
  inline final def aInline: String = nest.Obj.field
}
