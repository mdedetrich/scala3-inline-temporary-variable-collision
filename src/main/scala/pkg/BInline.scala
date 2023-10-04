package pkg

import pkg.nest

private[pkg] trait BInline { this: APlusB =>
  inline final def bInline: String = nest.Obj.field
}
